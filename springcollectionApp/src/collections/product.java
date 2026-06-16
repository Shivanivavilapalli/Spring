package collections;

import java.io.Serializable;
import java.util.Map;

public class product implements Serializable {
private Map<Integer,String> names;

public product() {
	super();
	// TODO Auto-generated constructor stub
}

public Map<Integer, String> getNames() {
	return names;
}

public void setNames(Map<Integer, String> names) {
	this.names = names;
}

public product(Map<Integer, String> names) {
	super();
	this.names = names;
}

}
