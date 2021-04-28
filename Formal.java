package amazon;
import javax.servlet.*;
import javax.servlet.http.*;
import java.io.*;
import javax.servlet.annotation.WebServlet;
@WebServlet("/Formal")
public class Formal extends HttpServlet
{
public void service(HttpServletRequest req,HttpServletResponse res)
{
try
{
res.setContentType("text/html");
PrintWriter pw=res.getWriter();
String c=req.getParameter("t3");
String d=req.getParameter("t4");
int z=Integer.parseInt(d);
HttpSession ses=req.getSession(false);//new session is created
ses.setAttribute("m",c);
ses.setAttribute("n",z);
pw.println("<html>");
pw.println("<b>Formal's Section</b>");
pw.println("<form action=Shoes method=post>");
pw.println("type:");
pw.println("<input type=text name=t5 size=20><br>");
pw.println("Price:");
pw.println("<input type=text name=t6 size=20><br>");
pw.println("<input type=submit value=submit><br>");
pw.println("</form></html>");
pw.close();
}
catch(Exception ab)
{
	ab.printStackTrace();
	}
}}