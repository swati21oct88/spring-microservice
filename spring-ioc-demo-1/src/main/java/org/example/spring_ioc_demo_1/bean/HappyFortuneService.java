package org.example.spring_ioc_demo_1.bean;

public class HappyFortuneService implements FortuneService {

	@Override
	public String dailyFortune() {
		return "today is your lucky day.";
	}
}
