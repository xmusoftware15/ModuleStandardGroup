package xmu.crms.service;

import java.math.BigInteger;

import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.SeminarBO;
import xmu.crms.bo.TopicBO;
import xmu.crms.bo.GroupBO;

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
     * @return List<SeminarBO> 讨论课列表
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
	 * @return true/false 是否成功删除
	 */
	boolean deleteSeminarByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};

	/**
	 * 用户（学生）获得当前讨论课信息(小程序端获得讨论课信息进行选题分组、签到等).
	 * ＜p＞用户（学生）通过用户id和讨论课id获得学生当前的讨论课信息<br>* (包括此学生是否是队长，当前讨论课是否处于签到状态，当前讨论课是否可以选题，当前讨论课的组队方式).
	 * @author CaoXingmei
	 * @param seminarId 讨论课id
	 * @param classId 班级id
	 * @return 当前讨论课的信息
	 * @see SeminarGroupService #getSeminarGroupLeaderById(BigInteger, BigInteger)
	 * @see 数据库更新后再完善
	 */
	private SeminarBO getMySeminarBySeminarId(BigInteger seminarId,BigInteger userId){
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 用户（学生）获得讨论课的详细信息.
	 * ＜p＞用户（学生）通过用户id和讨论课id获得讨论课的详细信息<br>* (包括讨论课信息，教师信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课id
	 * @param userId 用户id
	 * @return 相应的讨论课的详细信息
	 * 
	 */
	private SeminarBO getSeminarDetailBySeminarId(BigInteger seminarId,BigInteger userId){
		
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 用户(老师)获得讨论课信息.
	 * ＜p＞用户(老师)通过讨论课id获得讨论课信息（包括讨论课名称、讨论课描述、分组方式、开始时间、结束时间）<br>*.
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return 相应的讨论课信息
	 */
	private SeminarBO getSeminarBySeminarId(BigInteger seminarId){
		SeminarBO seminar = new SeminarBO();
		return seminar;
	}
	
	/**
	 * 修改讨论课信息.
	 * ＜p＞用户（老师）通过seminarId修改讨论课的相关信息<br>*.
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param seminar 讨论课信息
	 * @return true(修改成功), false(修改失败)
	 */
	private boolean updateSeminarBySeminarId(BigInteger seminarId, SeminarBO seminar){
		return true;
	}
	
	/**
	 * 删除讨论课.
	 * ＜p＞用户（老师）通过seminarId删除讨论课<br>* (包括删除讨论课包含的topic信息和小组信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return true(删除成功), false(删除失败)
	 * @see SeminarGroupService #deleteSeminarGroupBySeminarId(BigInteger seminarId)
	 * @see TopicService#deleteTopicBySeminarId(BigInteger seminarId)
	 */
	private boolean deleteSeminarBySeminarId(BigInteger seminarId){
		List<TopicBO> topicList = new ArrayList<TopicBO>();
		List<GroupBO> groupList = new ArrayList<GroupBO>();
		return true;
	}
	
	/**
	 * 新增讨论课.
	 * ＜p＞用户（老师）在指定的课程下创建讨论课<br>*
	 * @author YeHongjie
	 * @param courseId 课程的id
	 * @param SeminarBO 讨论课信息
	 * @return BigInteger 若创建成功返回创建的讨论课id，失败则返回-1
	 */
	BigInteger insertSeminarByCourseId(BigInteger courseId, SeminarBO seminarBO)
	{
		
		BigInteger seminarId=BigInteger.valueOf(-1);
		return seminarId;
	}
}
