package amazon;

import java.io.PrintWriter;

import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Billing")
public class Billing extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String i=req.getParameter("t7");
String j=req.getParameter("t8");
int o=Integer.parseInt(j);
HttpSession ses=req.getSession(false);
String a=(String)ses.getAttribute("x");
String b=(String)ses.getAttribute("y");
String c=(String)ses.getAttribute("m");
int d=(Integer)ses.getAttribute("n");
String e=(String)ses.getAttribute("i");
int f=(Integer)ses.getAttribute("j");
pw.println("<html>");
pw.println("<b>User:</b>"+a);
pw.println("<br>");
pw.println(c+": Rs."+d+"/-");
pw.println("<br>");
pw.println(e+": Rs."+f+"/-");
pw.println("<br>");
pw.println(i+": Rs."+o+"/-");
pw.println("<br>");
pw.println("<hr>");
pw.println("Total: Rs."+(d+f+o)+"/-");
pw.close();
}
catch(Exception ae)
{}
}}
