package springjdbc;

import java.util.List;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext ac = new ClassPathXmlApplicationContext("springconfig.xml");
		productDAO pd = (productDAO)ac.getBean("dao");
		Scanner sc = new Scanner(System.in);
		System.out.println("1.Insert");
		System.out.println("2.Display");
		System.out.println("3.Update");
		System.out.println("4.Delete");
		System.out.println("Enter your choice:");
		int choice = sc.nextInt();
		switch(choice) {
		case 1:
			System.out.println("Enter pid ,pname,pprice");
			product p = new product(sc.nextInt(),sc.next(),sc.nextDouble());
			System.out.println(pd.saveData(p));
			break;
		case 2:List<product> lp = pd.getData();
		for(product p3:lp) {
			System.out.println(p3.getPid()+" "+p3.getPname()+" "+p3.getPprice());
		} break;
		case 3:
			System.out.println("Enter pid , new pname,new pprice");
		product p1 = new product();
		p1.setPid(sc.nextInt());
		p1.setPname(sc.next());
		p1.setPprice(sc.nextDouble());
		System.out.println(pd.updateData(p1));
		case 4:
			System.out.println("Enter pid to delete");
			int pid = sc.nextInt();
			System.out.println(pd.deleteData(pid));
			break;
		default:
			System.out.println("invalid choice");
		}
		
		
		
	}

}
