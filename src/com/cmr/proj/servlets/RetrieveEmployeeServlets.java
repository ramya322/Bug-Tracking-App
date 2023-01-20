package com.cmr.proj.servlets;

import java.io.IOException;
//import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmr.proj.model.Defect_Stat;
import com.cmr.proj.repository.DefectTrackingRepository;

/**
 * Servlet implementation class RetrieveEmployeeServlets
 */
@WebServlet("/retrieveemployee")
public class RetrieveEmployeeServlets extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public RetrieveEmployeeServlets() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		DefectTrackingRepository repo=new DefectTrackingRepository();
		List<Defect_Stat>defdetails = repo.getAllDefectDetailsInfo();
		
		request.setAttribute("defectdetails", defdetails);
		
		RequestDispatcher rd = request.getRequestDispatcher("DisplayDefectDetails.jsp");
		rd.include(request, response);
	}

}
