package com.cmr.proj.model;

public class Defect_Stat {
	private int defect_trackingid;
	private int empid;
	private String empname;
	private String defect_name;
	private int defect_id;
	private String def_status;
	 //public
	public Defect_Stat() {
		super();
		// TODO Auto-generated constructor stub
	}
	//public
	public Defect_Stat(int defect_trackingid, int empid, String empname, String defect_name, int defect_id,
			String def_status) {
		super();
		this.defect_trackingid = defect_trackingid;
		this.empid = empid;
		this.empname = empname;
		this.defect_name = defect_name;
		this.defect_id = defect_id;
		this.def_status = def_status;
	}
	public int getDefect_trackingid() {
		return defect_trackingid;
	}
	public void setDefect_trackingid(int defect_trackingid) {
		this.defect_trackingid = defect_trackingid;
	}
	public int getEmpid() {
		return empid;
	}
	
	public void setEmpid(int empid) {
		this.empid = empid;
	}
	public String getEmpname() {
		return empname;
	}
	public void setEmpname(String empname) {
		this.empname = empname;
	}
	public String getDefect_name() {
		return defect_name;
	}
	public void setDefect_name(String defect_name) {
		this.defect_name = defect_name;
	}
	public int getDefect_id() {
		return defect_id;
	}
	public void setDefect_id(int defect_id) {
		this.defect_id = defect_id;
	}
	public String getDef_status() {
		return def_status;
	}
	public void setDef_status(String def_status) {
		this.def_status = def_status;
	}
	@Override
	public String toString() {
		return "Defect_Stat [defect_trackingid=" + defect_trackingid + ", empid=" + empid + ", empname=" + empname
				+ ", defect_name=" + defect_name + ", defect_id=" + defect_id + ", def_status=" + def_status + "]";
	}
	

}
