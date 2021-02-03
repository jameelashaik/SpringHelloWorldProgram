package in.apcfss.springworld.in;



import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class mainSpring {
	public static void main(String[] args) {
	      ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	      HiWorld obj = (HiWorld) context.getBean("Welcome");
	      obj.getMsg();
	   }
}
