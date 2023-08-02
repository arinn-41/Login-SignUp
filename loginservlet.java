package com.Flipkart;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/loginservlet")
public class loginservlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String uemail = req.getParameter("cgmail");
		String upswd = req.getParameter("cpswd");

		daodata dao = new daodata();
		dtodata dto = dao.fetchByemail(uemail);

		if (uemail.equals(dto.getCgmail()) && upswd.equals(dto.getCpswd())) {
			PrintWriter pw = resp.getWriter();
			pw.print("Thank You ");
			pw.print("Login Successful");

			//resp.sendRedirect("https://www.flipkart.com");



		} else {
			PrintWriter pw = resp.getWriter();
			pw.print("Invalid Details");
		}

	}
}
