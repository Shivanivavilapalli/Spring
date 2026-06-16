package collections;

import java.util.List;
import java.util.Set;

public class student {
private Set<Integer> ids;
private List<String> names;
private List<Double> marks;
@Override
public String toString() {
	return "student []";
}
public Set<Integer> getIds() {
	return ids;
}
public void setIds(Set<Integer> ids) {
	this.ids = ids;
}
public List<String> getNames() {
	return names;
}
public void setNames(List<String> names) {
	this.names = names;
}
public List<Double> getMarks() {
	return marks;
}
public void setMarks(List<Double> marks) {
	this.marks = marks;
}
public student(Set<Integer> ids, List<String> names, List<Double> marks) {
	super();
	this.ids = ids;
	this.names = names;
	this.marks = marks;
}
public student() {
	super();
	// TODO Auto-generated constructor stub
}
}
