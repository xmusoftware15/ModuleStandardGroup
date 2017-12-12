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
public class FixGroupMemberService {

	/**
	 * 方法简述.
	 * <p>按FixGroupId删除FixGroupMember<br>  
	 * @author zhouzhongjun
     * @param BigInteger fixGroupId 固定分组Id
     * @return true/false 是否成功删除
	 */
	boolean deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId) {
		
		//删除自己
		return true;
	};
	
	/**
	 * 将学生加入固定小组.
	 * ＜p＞将用户加入指定的固定小组<br>*
	 * @author YeHongjie
	 * @param userId 学生的id
	 * @param groupId 要加入固定小组的id
	 * @return BigInteger 若创建成功返回该条记录的id，失败则返回-1
	 */
    BigInteger insertFixGroupMemberById(BigInteger userId,BigInteger groupId)
    {
    	BigInteger recordId = BigInteger.valueOf(-1);
    	return recordId;
    }
    
	/**
	 * 查询固定小组成员.
	 * ＜p＞按照固定小组id查询该小组的成员<br>*
	 * @author YeHongjie
	 * @param groupId 要查询的固定小组id
	 * @return List 固定小组成员信息
	 */
    List<UserBO> listFixGroupMemberByGroupId(BigInteger groupId)
    {
    	List<UserBO> userBOs=null;
    	return userBOs;
    }
    
    
}
