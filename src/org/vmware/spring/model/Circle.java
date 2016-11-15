package org.vmware.spring.model;

public class Circle {
	private int id;
	private String name;
	private String fname;

	public String getName() {
		
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void getAll(int ids,String names,String fnames) {
		System.out.println("Circle [id=" + ids + ", name=" + names + ", fname=" + fnames + "]");
	}
	
	

}
