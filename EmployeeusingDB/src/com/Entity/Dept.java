package com.Entity;

public class Dept {
     private int deptid;
     private String deptname;
     public Dept(int deptid,String name) {
    	 this.deptid=deptid;
    	 this.deptname=name;
     }
     
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDeptname() {
		return deptname;
	}
	public void setDeptname(String deptname) {
		this.deptname = deptname;
	}

	@Override
	public String toString() {
		return "Dept [deptid=" + deptid + ", deptname=" + deptname + "";
	}
	
     
}
