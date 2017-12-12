package xmu.crms.service;

import java.math.BigInteger;
<<<<<<< HEAD
import java.util.List;

import xmu.crms.bo.*;
=======
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.SeminarBO;
import xmu.crms.bo.TopicBO;
import xmu.crms.bo.GroupBO;

>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SeminarService {
<<<<<<< HEAD
	
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
	boolean deleteCourseByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};

=======
	/**
	 * 获得学生当前讨论课信息(小程序端获得讨论课信息进行选题分组、签到等).
	 * ＜p＞通过学生用户id和讨论课id获得学生当前的讨论课信息<br>* (此学生是否是队长，当前讨论课是否处于签到状态，当前讨论课是否可以选题，当前讨论课的组队方式).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 * @return 当前讨论课的信息
	 * @see SeminarService#getMySeminarBySeminarId(BigInteger, BigInteger)
	 */
	private SeminarBO getMySeminarBySeminarId(BigInteger seminarId,BigInteger userId){
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 获得学生相关的某个讨论课的信息.
	 * ＜p＞通过学生用户id和讨论课id获得学生某个讨论课的详细信息<br>* (包括讨论课信息，上课地点，教师信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param userId 学生的id
	 * @return 相应的讨论课的详细信息
	 * @see SeminarService#getSeminarDetailBySeminarId(BigInteger, BigInteger) )
	 */
	private SeminarBO getSeminarDetailBySeminarId(BigInteger seminarId,BigInteger userId){
		SeminarBO nowSeminar = new SeminarBO();
		return nowSeminar;
	}
	
	/**
	 * 获得学生相关的某个讨论课的信息.
	 * ＜p＞通过学生用户id和讨论课id获得学生某个讨论课的信息<br>* (包括讨论课信息，上课地点，教师信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return 相应的讨论课信息
	 * @see SeminarService#getSeminarBySeminarId(BigInteger) )
	 */
	private SeminarBO getSeminarBySeminarId(BigInteger seminarId){
		SeminarBO seminarInfo = new SeminarBO();
		return seminarInfo;
	}
	
	/**
	 * 按讨论课id修改讨论课.
	 * ＜p＞用户（老师）通过seminarId修改讨论课的相关信息<br>* (包括讨论课信息，上课地点，教师信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @param seminar 讨论课信息
	 * @return 相应的讨论课信息
	 * @see SeminarService#updateSeminarBySeminarId(BigInteger, SeminarBO) )
	 */
	private boolean updateSeminarBySeminarId(BigInteger seminarId, SeminarBO seminar){
		SeminarBO seminarInfo = new SeminarBO();
		if(true){
			return true;
		}
		
		else{
			return false;
		}
	}
	
	/**
	 * 按讨论课id修改讨论课.
	 * ＜p＞用户（老师）通过seminarId修改讨论课的相关信息<br>* (包括删除讨论课包含的topic信息和小组信息).
	 * @author CaoXingmei
	 * @param seminarId 讨论课的id
	 * @return true(删除成功), false(删除失败)
	 * @see SeminarService#deleteSeminarBySeminarId(BigInteger) )
	 */
	private boolean deleteSeminarBySeminarId(BigInteger seminarId){
		List<TopicBO> topicList = new ArrayList<TopicBO>();
		List<GroupBO> groupList = new ArrayList<GroupBO>();
		
		/*topicList = listTopicBySeminarId(seminarId);
		groupList = listGroupBySeminarId(seminarId);
		
		for topicId in topicList
			TopicService.deleteTopicByTopicId(topicId);
		
		for groupId in groupList
			GroupService.deleteGroupByGroupId(groupId);
		
		deleteSeminarBySeminarId(seminatId);*/
		if(true)
			return true;
		else
			return false;
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
>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf
}
