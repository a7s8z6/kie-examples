package com.myspace.exampleproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class MyDataObject implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	private int code;
	private boolean status;

	public MyDataObject() {
	}

	public int getCode() {
		return this.code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public boolean isStatus() {
		return this.status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}

	public MyDataObject(int code, boolean status) {
		this.code = code;
		this.status = status;
	}

}