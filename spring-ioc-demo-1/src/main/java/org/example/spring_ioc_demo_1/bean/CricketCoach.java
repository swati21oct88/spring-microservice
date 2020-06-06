package org.example.spring_ioc_demo_1.bean;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class CricketCoach implements Coach{
	
	private FortuneService fortuneService;
	
	@Override
	public String getDailyWorkout() {
		return "practice spin bowling today";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.dailyFortune();
	}

}
