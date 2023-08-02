package com.Flipkart;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/signupservlet")
public class signupservlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException 
	{
		
		String name=req.getParameter("cname");
		int age=Integer.parseInt(req.getParameter("cage"));
		String add=req.getParameter("cadd");
		String gmail=req.getParameter("cgmail");
		long phno=Long.parseLong(req.getParameter("cphno"));
		String pswd=req.getParameter("cpswd");
	
		dtodata dt1=new dtodata();
		dt1.setCname(name);
		dt1.setCage(age);
		dt1.setCadd(add);
		dt1.setCgmail(gmail);
		dt1.setCphno(phno);
		dt1.setCpswd(pswd);
		
		daodata da=new daodata();
		da.insert(dt1);
		
		resp.sendRedirect("home.jsp");
		
		
	}
}
