package org.example.spring_ioc_demo_1;

import org.example.spring_ioc_demo_1.bean.Coach;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
		try {
			
			ApplicationContext applicationContext = new ClassPathXmlApplicationContext("applicationContext.xml");
			Coach coach = applicationContext.getBean("theCoach",Coach.class);
			
			System.out.println("ur daily workout plan " + coach.getDailyWorkout() + "\n");
			System.out.println("ur daily fortune " + coach.getDailyFortune());

		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
		}
    }
}
