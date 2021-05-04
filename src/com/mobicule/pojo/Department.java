package com.mobicule.pojo;

public class Department {
	
	private int dId;
	private String dName;
	private String dManager;
	private int cId;

	public Department() {
		
	}
	
	public Department(String dName, String dManager, int cId) {
		this.dName = dName;
		this.dManager = dManager;
		this.cId = cId;
	}

	public int getdId() {
		return dId;
	}

	public void setdId(int dId) {
		this.dId = dId;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public String getdManager() {
		return dManager;
	}

	public void setdManager(String dManager) {
		this.dManager = dManager;
	}

	public int getcId() {
		return cId;
	}

	public void setcId(int cId) {
		this.cId = cId;
	}

}
