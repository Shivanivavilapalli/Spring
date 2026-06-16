package Spring1;

import java.io.Serializable;

public class product implements Serializable{
private int pid;
private String pname;
private double psalary;
public product() {
	super();
	// TODO Auto-generated constructor stub
}
public int getPid() {
	return pid;
}
public void setPid(int pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public double getPsalary() {
	return psalary;
}
public void setPsalary(double psalary) {
	this.psalary = psalary;
}
public product(int pid, String pname, double psalary) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.psalary = psalary;
}
@Override
public String toString() {
	return "product [pid=" + pid + ", pname=" + pname + ", psalary=" + psalary + "]";
}


}
