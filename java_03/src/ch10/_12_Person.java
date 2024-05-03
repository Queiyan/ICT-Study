package ch10;

import java.io.Serializable;

// p551
public class _12_Person implements Serializable {
	
	private static final long serialVersionUID = -1503252402544036183L;
	String name;
	String job;
	
	public _12_Person() {
		
	}
	
	public _12_Person(String name, String job) {
		
	}
	
	public String toString() {
		return name + "," + job;
	}
	
}
