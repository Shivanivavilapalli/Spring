package Spring1;

public class Company {
private int cid;
private String cname;
private String cloc;
private product p;
public Company() {
	super();
	// TODO Auto-generated constructor stub
}
public Company(int cid, String cname, String cloc,product p) {
	super();
	this.cid = cid;
	this.cname = cname;
	this.cloc = cloc;
	this.p = p;
}

public int getCid() {
	return cid;
}
public void setCid(int cid) {
	this.cid = cid;
}
public String getCname() {
	return cname;
}
public void setCname(String cname) {
	this.cname = cname;
}
public String getCloc() {
	return cloc;
}
public void setCloc(String cloc) {
	this.cloc = cloc;
}
public product getP() {
	return p;
}
public void setP(product p) {
	this.p = p;
}
@Override
public String toString() {
	return "Company [cid=" + cid + ", cname=" + cname + ", cloc=" + cloc + ", p=" + p.toString()+ "]";
}


}
