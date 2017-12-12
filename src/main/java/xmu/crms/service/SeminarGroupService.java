package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.SeminarGroupBO;
import xmu.crms.bo.TopicBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SeminarGroupService {
	
	
	/**
	 * 方法简述.
	 * <p>按seminarId获取SeminarGroup<br>  
	 * @author zhouzhongjun
     * @param BigInteger seminarId 课程Id
     * @return List<SeminarGroupBO> 讨论课小组列表
	 */
	List<SeminarGroupBO> listSeminarGroupBySeminarId(BigInteger seminarId) {
			
		return null;
	};
	
	/**
	 * 方法简述.
	 * <p>按seminarId删除讨论课小组信息<br>  
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
}
