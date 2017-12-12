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

}
