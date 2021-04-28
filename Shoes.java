package amazon;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Shoes")
public class Shoes extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String e=req.getParameter("t5");
String f=req.getParameter("t6");
int l=Integer.parseInt(f);
HttpSession ses=req.getSession(false);
ses.setAttribute("i",e);
ses.setAttribute("j",l);
pw.println("<html>");
pw.println("<b>Shoes's Section</b>");
pw.println("<form action=Billing method=post>");
pw.println("type:");
pw.println("<input type=text name=t7 size=20><br>");
pw.println("Price:");
pw.println("<input type=text name=t8 size=20><br>");
pw.println("<input type=submit value=submit><br>");
pw.println("</form></html>");
pw.close();
}
catch(Exception ab)
{
	ab.printStackTrace();
	}
}}