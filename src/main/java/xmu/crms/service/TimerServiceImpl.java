package xmu.crms.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerServiceImpl {

	@Scheduled(fixedRate = 10000)
	public void scheduled() {
		
	}
	
}
