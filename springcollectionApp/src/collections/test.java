package collections;

import java.security.KeyStore.Entry;
import java.util.Map;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		ApplicationContext ac = new ClassPathXmlApplicationContext("springcoll.xml");
//		student s = (student)ac.getBean("std");
//		Set<Integer> x = s.getIds();
//		for(Integer id:x) {
//			System.out.println(id);
//		}
//		List<String> y = s.getNames();
//		for(String name:y) {
//			System.out.println(name);
//		}
//		List<Double> z = s.getMarks();
//		for(Double marks:z) {
//			System.out.println(marks);
//		}
		ApplicationContext ac = new ClassPathXmlApplicationContext("springcoll.xml");
		product p = (product)ac.getBean("pro");
		Map<Integer,String> x = p.getNames();
		System.out.println(x.entrySet());
		
	}

}
