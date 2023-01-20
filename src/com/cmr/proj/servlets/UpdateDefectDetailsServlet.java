package com.cmr.proj.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.cmr.proj.model.Defect_Stat;
import com.cmr.proj.repository.DefectTrackingRepository;

/**
 * Servlet implementation class UpdateDefectDetailsServlet
 */
@WebServlet("/updatedefectstatus")
public class UpdateDefectDetailsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UpdateDefectDetailsServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int def_trac_id=Integer.parseInt(request.getParameter("defect_trackingid"));
		int eid=Integer.parseInt(request.getParameter("empid"));
		String ename=request.getParameter("empname");
		String defname=request.getParameter("defect_name");
		int defid=Integer.parseInt(request.getParameter("defect_id"));
		String defstatus=request.getParameter("def_status");
		
		Defect_Stat statu=new Defect_Stat();
		statu.setDefect_trackingid(def_trac_id);
		statu.setEmpid(eid);
		statu.setEmpname(ename);
		statu.setDefect_name(defname);
		statu.setDefect_id(defid);
		statu.setDef_status(defstatus);
		
		
		DefectTrackingRepository repo=new DefectTrackingRepository();
		int result=repo.updatedefectstatus(statu);
		response.setContentType("text/html");
		
		if(result>0)
		{
			PrintWriter pw=response.getWriter();
			pw.println(def_trac_id+"details are updates successfully");
		}
		else {
			PrintWriter pw=response.getWriter();
			pw.println("Updation Failed.........");
			
		}
		
		RequestDispatcher rd=request.getRequestDispatcher("retrieveemployee");
		rd.include(request, response);
		
		
	}

}
