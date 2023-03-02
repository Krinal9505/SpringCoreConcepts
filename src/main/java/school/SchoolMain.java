package school;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
//import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SchoolMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
		
		ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfig.class);
		
		Student	student = context.getBean(Student.class);
		student.learn();
		student.setScore("67");
		System.out.println(student.getScore());
		
		Student	student1 = context.getBean(Student.class);
		System.out.println(student1.getScore());
	}

}
