package org.example.spring_ioc_demo_1.bean;

public class BadFortuneService implements FortuneService {
	@Override
	public String dailyFortune() {
		return "be aware of your friends today.";
	}
}
