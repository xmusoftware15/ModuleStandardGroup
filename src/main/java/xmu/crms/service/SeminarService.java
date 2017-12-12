package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.*;
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SeminarService {
	
	/**
	 * 方法简述.
	 * <p>按courseId获取Seminar<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 */
	List<SeminarBO> listSeminarByCourseId(BigInteger courseId) {
			
		return null;
	};
	
	
	/**
	 * 方法简述.
	 * <p>按courseId删除Seminar<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 *@see SeminarService #listSemiarByCourseId(BigInteger courseId)
	 *@see TopicService   #deleteTopicBySeminarId(BigInteger seminarId)
	 *@see SeminarGroupService  #deleteSeminarGroupBySeminarId(BigInteger seminarId)
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};

}
