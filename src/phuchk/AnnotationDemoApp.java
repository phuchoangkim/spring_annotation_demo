package phuchk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AnnotationDemoApp {

	public static void main(String[] args) {

		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

		ICoach coach = context.getBean("tennisCoach", ICoach.class);
		ICoach theCoach = context.getBean("tennisCoach", ICoach.class);

		System.out.println(coach.getDailyWorkout());
		System.out.println(coach.getDailyFortune());

		System.out.println("Is equal: " + (coach == theCoach));

		context.close();

	}

}
