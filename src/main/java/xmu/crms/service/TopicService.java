package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.CourseBO;
import xmu.crms.bo.SeminarBO;
import xmu.crms.bo.TopicBO;


/**
 * @author qinlingyun
 * @version 1.00
 */

public class TopicService {
	
	

	/**
	 * 方法简述.
	 * <p>按seminarId获取Topic<br>  
	 * @author zhouzhongjun
     * @param BigInteger seminarId 课程Id
	 */
	List<TopicBO> listTopicBySeminarId(BigInteger seminarId) {
			
		return null;
	};
	
	
	/**
	 * 方法简述.
	 * <p>小组取消选择话题  <br> 
	 * <p>删除seminar_group_topic表的记录<br>
	 * @author zhouzhongjun
     * @param BigInteger groupId 小组Id
     * @param BigInteger topicId 话题Id
	 * @return 是否成功取消选择话题
	 */
	private boolean deleteTopicById(BigInteger groupId,BigInteger topicId)  {
		
		//删除自己
		return true;
		
	};	
	
	/**
	 * 方法简述.
	 * <p>按seminarId删除话题<br>  
	 * @author zhouzhongjun
     * @param BigInteger seminarId 讨论课Id
	 *@see TopicService #listTopicBySeminarId(BigInteger seminarId)
	 *@see StudentScoreGroupService   #deleteStudentScoreGroupByTopicId(BigInteger topicId)
	 * @return true/false 是否成功删除
	 */
	boolean deleteTopicBySeminarId(BigInteger seminarId) {
		
		
		//删除自己
		return true;
	};
	
}
