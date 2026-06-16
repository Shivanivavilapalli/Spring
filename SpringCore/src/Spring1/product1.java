package Spring1;

import java.util.Map;

public class product1 {
private Map<Integer,String> names;

@Override
public String toString() {
	return "product1 [names=" + names + "]";
}

public Map<Integer, String> getNames() {
	return names;
}

public void setNames(Map<Integer, String> names) {
	this.names = names;
}

public product1() {
	super();
	// TODO Auto-generated constructor stub
}

public product1(Map<Integer, String> names) {
	super();
	this.names = names;
}

}
