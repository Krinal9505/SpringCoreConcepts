package school;

import org.springframework.stereotype.Component;

@Component
public class Teacher implements School{
	
	public void learn(){
		System.out.println("Teachers are learning");
	}
}
