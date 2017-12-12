package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.UserBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */

public class SeminarGroupMemberService {

	/**
	 * 方法简述.
	 * <p>按seminarGroupId删除SeminarGroupMember信息<br>  
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
	 * ＜p＞将用户加入指定的讨论课小组<br>*
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
	 * ＜p＞按照讨论课小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的讨论课小组id
	 * @return List 讨论课小组成员信息
	 */
    List<UserBO> listSeminarGroupMemberByGroupId(BigInteger groupId)
    {
    	List<UserBO> userBOs=null;
    	return userBOs;
    }
}
