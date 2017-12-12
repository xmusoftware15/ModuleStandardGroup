package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.SeminarGroupBO;
import xmu.crms.bo.TopicBO;
import xmu.crms.bo.UserBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SeminarGroupService {
	
	/**
	 * 按seminarGroupId删除SeminarGroupMember信息.
	 * @author zhouzhongjun
     * @param BigInteger seminarGroupId 讨论课小组Id
     *  @return true/false 是否成功删除
	 */
	boolean deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
			
		//删除自己
		return true;
	};
	
	/**
	 * 将学生加入讨论课小组.
	 * <p>将用户加入指定的讨论课小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入讨论课小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */
    BigInteger insertSeminarGroupMemberById(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }
    
	/**
	 * 查询讨论课小组成员.
	 * <p>按照讨论课小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return List 讨论课小组成员信息
	 */
    List<UserBO> listSeminarGroupMemberByGroupId(BigInteger groupId)
    {
    	List<UserBO> userBOs=null;
    	return userBOs;
    }
    
	/**
	 *
	 * 获取某学生所有的讨论课小组.
	 * <p>根据学生id获取学生所在的所有讨论课小组的id<br>
	 * @author qinlingyun
	 * @param userId 学生id
	 * @return list 讨论课小组列表
	 */
    List<BigInteger> listSeminarGroupIdByStudentId(BigInteger userId)
    {
    	List<BigInteger> list = new ArrayList();
    	
    	return list;
    }
    
    
    /**
	 * 查询讨论课小组队长id.
	 * <p>按照讨论课小组id查询该小组的队长id<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return BigInteger 讨论课小组队长id
	 */
    BigInteger getSeminarGroupLeaderByGroupId(BigInteger groupId)
    {
    	BigInteger leaderId=null;
    	return leaderId;
    }
	/**
	 * 按seminarId获取SeminarGroup.
	 * @author zhouzhongjun
     * @param BigInteger seminarId 课程Id
     * @return List<SeminarGroupBO> 讨论课小组列表
	 */
	List<SeminarGroupBO> listSeminarGroupBySeminarId(BigInteger seminarId) {
			
		return null;
	};
	
	/**
	 * 按seminarId删除讨论课小组信息.
	 * <p>根据seminarId获得SeminarGroup，然后根据SeminarGroupId删除SeminarGroupMember信息，最后再删除SeminarGroup信息<br>  
	 * @author zhouzhongjun
     * @param BigInteger seminarId 讨论课Id
	 * @see SeminarGroupService #listSeminarGroupBySeminarId(BigInteger seminarId)
	 * @see SeminarGroupMember  #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	 * @return true/false 是否成功删除
	 */
	boolean deleteSeminarGroupBySeminarId(BigInteger seminarId) {
			
		//删除自己
		return true;
	};

	/**
	 * 创建讨论课小组.
	 * ＜p＞在指定讨论课下创建讨论课小组<br>*
	 * @author YeHongjie
	 * @param seminarId 讨论课的id
	 * @param seminarGroupBO 小组信息
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 */
    BigInteger insertSeminarGroupBySeminarId(BigInteger seminarId,SeminarGroupBO seminarGroupBO)
    {
    	BigInteger seminarGroupId = BigInteger.valueOf(-1);
    	return seminarGroupId;
    }
    
    /**
	 * 删除讨论课小组.
	 * ＜p＞按照id删除讨论课小组<br>*
	 * @author YeHongjie
	 * @param groupID 讨论课小组的id
	 * @return Boolean 若创建成功返回true，失败返回false
	 * @see SeminarGroupMemberService #deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId)
	 */
    Boolean deleteSeminarGroupByGroupId(BigInteger groupId)
    {
    	Boolean state=Boolean.valueOf(false);
    	return state;
    }
    
    /**
	 * 查询讨论课小组.
	 * ＜p＞按照id查询某一讨论课小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupID 小组的id
	 * @return seminarGroupBO 讨论课小组对象，若未找到相关小组返回空(null)
	 * @see SeminarGroupMemberService #listSeminarGroupMemberByGroupId(BigInteger groupId)
	 */
    SeminarGroupBO getSeminarGroupByGroupId(BigInteger groupId)
    {
    	SeminarGroupBO seminarGroupBO=null;
    	return seminarGroupBO;
    }
    
    /**
	 * 获取学生所在讨论课小组.
	 * ＜p＞按照用户id和讨论课id获取学生所在讨论课小组id<br>*
	 * @author YeHongjie
	 * @param userId 用户的id
	 * @param seminarId 讨论课id
	 * @return BigInteger 讨论课小组的id，若未找到相关小组返回空(null)
	 */
    BigInteger getSeminarGroupById(BigInteger userId, BigInteger seminarId)
    {
    	//Maybe you need to use intersection while querying
    	//if you have some advice, contract me@YeHonjie, thanks!
    	BigInteger groupId=null;
    	return groupId;
    }
    
    /**
	 * 获取学生所在讨论课队长.
	 * ＜p＞按照用户id和讨论课id获取学生所在讨论课小组队长<br>*
	 * @author YeHongjie
	 * @param userId 用户的id
	 * @param seminarId 讨论课id
	 * @return BigInteger 讨论课小组的队长id，若未找到相关小组队长返回空(null)
	 * @see SeminarGroupService #getSeminarGroupById(BigInteger userId, BigInteger seminarId)
	 * @see SeminarGroupMemberService #getSeminarGroupLeaderByGroupId(BigInteger groupId)
	 */
    BigInteger getSeminarGroupLeaderById(BigInteger userId, BigInteger seminarId)
    {
    	BigInteger groupId=null;
    	return groupId;
    }
}
