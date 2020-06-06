package org.example.spring_ioc_demo_1.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
@AllArgsConstructor
public class BasketBallCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "practice volley ball today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.dailyFortune();
	}

}
