package Spring1;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Resource rs = new ClassPathResource("springConfig.xml");
		BeanFactory fs = new XmlBeanFactory(rs);
//		ApplicationContext ac = new ClassPathXmlApplicationContext("springConfig.xml");
		Company c = (Company)fs.getBean("obj1");
		System.out.println(c);
//		System.out.println(p);
		

	}

}
