package com.cmr.proj.repository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.*;

import com.cmr.proj.model.Defect_Stat;
//import com.project.jdbc1.DbConnection;

public class DefectTrackingRepository {
	public List<Defect_Stat> getAllDefectDetailsInfo() {

		List<Defect_Stat>defectdetails = new ArrayList<Defect_Stat>();
			try {
				Connection con=DbConnection.getConnection();
			
			
			final String SQLQUERY="select * from defect_stat";
			
			PreparedStatement pstmt=con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement Created Succesfully....");
			
			
			
			System.out.println("SQL Query is:"+SQLQUERY);
			ResultSet rs=pstmt.executeQuery();
			while(rs.next())
			{
				Defect_Stat status=new Defect_Stat();
				status.setDefect_trackingid(rs.getInt(1));
				status.setEmpid(rs.getInt(2));
				status.setEmpname(rs.getString("empname"));
				status.setDefect_name(rs.getString("defect_name"));
				status.setDefect_id(rs.getInt(5));
				status.setDef_status(rs.getString("def_status"));
				defectdetails.add(status);
			}
			//step-6:
			
		}
			catch(SQLException e)
			{
				System.out.println(e);
				
		    }
			return defectdetails;
		
	}
	
	public int updatedefectstatus(Defect_Stat statu) {

		    int res=0;
			try {
				Connection con=DbConnection.getConnection();
			
			
			final String SQLQUERY="update defect_stat set def_status=?,empid=?,empname=?,defect_name=?,defect_id=? where defect_trackingid=?";
			
			PreparedStatement pstmt=con.prepareStatement(SQLQUERY);
			System.out.println("Prepared Statement Created Succesfully....");
			
			
			pstmt.setString(1,statu.getDef_status());
			pstmt.setInt(2,statu.getEmpid());
			pstmt.setString(3,statu.getEmpname());
			pstmt.setString(4,statu.getDefect_name());
			pstmt.setInt(5,statu.getDefect_id());
			pstmt.setInt(6,statu.getDefect_trackingid());
			
			res=pstmt.executeUpdate();
			System.out.println("Statement Updated Succesfully....");
			
			
			//step-6:
			
		}
			catch(SQLException e)
			{
				System.out.println(e);
				
		    }
			return res;
		
	}


}
