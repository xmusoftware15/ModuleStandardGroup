package xmu.crms.service;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class TimerServiceImpl {

	/**
	 * 每十分钟检查一次Event实体的状况
	 * @author qinlingyun
	 */
	@Scheduled(fixedRate = 10000)
	public void scheduled() {
		
	}
	
}
