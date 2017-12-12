﻿package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.sql.ResultSet;
import xmu.crms.bo.GroupBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class GroupService {
	/**
	 * 根据讨论课Id获得属于该讨论课的所有小组信息
	 * @author ZhouChulun
	 * @param seminarId 讨论课的id
	 * @return List<GroupBO> 所有group的信息
	 */

	private List<GroupBO> listGroupBySeminarId(BigInteger seminarId)  {
        List<GroupBO> list;
		//list = GroupDao.listGroupBySeminarId(BigInteger seminarId);
		return null;
	}

	/**
	 * 根据话题Id获得选择该话题的所有小组的信息
	 * @author ZhouChulun
	 * @param  topicId(话题的id)
	 * @return  List<GroupBO> 所有选择该话题的所有group的信息
	 */
	private List<GroupBO> listGroupByTopicId(BigInteger topicId) {
        List<GroupBO> list;
		//list = GroupDao. listGroupByTopicId(BigInteger topicId);
		return null;
	}
	
     /**
     * 根据讨论课Id及用户id，获得该用户所在的讨论课的小组的信息
     * @author ZhouChulun
     * @param BigInteger seminarId (讨论课的id)
     * @param BigInteger userId（用户的id）
     * @return GroupBO Group的相关信息
     */
    private GroupBO getSeminarGroupById(BigInteger seminarId,BigInteger userId){
          GroupBO groupBO;
          ResultSet rs;
          //rs = GroupDao.listGroupBySeminarId(BigInteger seminarId);
          //for groupBO in rs
          //   if (GroupDao.(groupBO,userId)) //如果该用户在该小组中，则直接返回此小组的信息
          //          return groupBO;
          return null;   //如果该用户不在该讨论课的任何小组中返回空
    };
    
    /**
	 * 自动分组.
	 * ＜p＞根据讨论课id和班级id，对签到的学生进行自动分组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 * @return Boolean 自动分组成功返回true，否则返回false
	 */
    private Boolean automaticallyGrouping(BigInteger seminarId,BigInteger classId)
    {
    	Boolean groupingState=Boolean.valueOf(false);
    	return groupingState;
    }
    
    /**
	 * 将学生加入小组.
	 * ＜p＞将用户加入指定的小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */
    private BigInteger insertStudnetIntoGroup(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }
    
    /**
	 * 小组按id选择话题.
	 * <p>小组通过小组id和话题id选择讨论课的话题<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @param topicId 话题id
	 * @return String 返回一个url
	 */
	private String insertTopicByGroupId(BigInteger groupId, BigInteger topicId){
		//TopicDao.insertTopicByGroupId(BigInteger groupId, BigInteger topicId)
		String url = null;
		return url;
	}
	
	/**
	 * 小组取消话题.
	 * <p>小组按小组id取消讨论课的话题的选择<br>
	 * @author heqi
	 * @param groupId 小组id
	 * @return true or false 返回取消话题是否成功
	 */
	private boolean deleteTopicByGroupId(BigInteger groupId) {
		//TopicDao.deleteTopicByGroupId(BigInteger groupId)
		return true;
	}
	
	/**
	 * 按id获取小组.
	 * <p>通过学生id和班级id获取学生所在的班级固定小组<br>
	 * @author heqi
	 * @param userId 学生id
	 * @param classId 班级id
	 * @return GroupBO 返回班级固定小组的信息 
	 * @see xmu.crms.service.UserService#listFixedMembersById(BigInteger userId)
	 * @see xmu.crms.service.UserService#getUserByUserId(BigInteger UserId)
	 */
	private GroupBO getFixedGroupById(BigInteger userId,BigInteger classId){
		//rs = UserService.listMembersById(BigInteger userId);
		//for student_id in rs;
		//UserService.UserBO getUserByUserId(BigInteger UserId)
		//得到小组所有成员信息返回小组信息
		GroupBO groupBO = new GroupBO();
		return groupBO;
	}
	/**
	 * 按groupid获取小组选题信息.
	 * @author Huhui
	 * @param groupid 组号
	 * @return List group_topic_id
	 */
	private List selectGroupTopicByGroupId(BigInteger groupid) {
		List list=new ArrayList<BigInteger>();
		return list;
	}
    
    
}
