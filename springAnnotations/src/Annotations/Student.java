package Annotations;

import java.io.Serializable;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class Student implements Serializable {
	@Value("cv245")
	private String sid;
	@Value("shivani")
	private String sname;
	@Value("98")
	private double smarks;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Student(String sid, String sname, double smarks) {
		super();
		this.sid = sid;
		this.sname = sname;
		this.smarks = smarks;
	}
	public String getSid() {
		return sid;
	}
	public void setSid(String sid) {
		this.sid = sid;
	}
	public String getSname() {
		return sname;
	}
	public void setSname(String sname) {
		this.sname = sname;
	}
	public double getSmarks() {
		return smarks;
	}
	public void setSmarks(double smarks) {
		this.smarks = smarks;
	}
	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", smarks=" + smarks + "]";
	}
	

}
