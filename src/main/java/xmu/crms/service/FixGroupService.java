package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.FixGroupBO;
import xmu.crms.bo.UserBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */

public class FixGroupService {
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
	/**
	 * 方法简述.
	 * <p>按classId查找FixGroup<br>  
	 * @author zhouzhongjun
     * @param BigInteger classId 班级Id
     * @return List<FixGroupBO> 固定分组列表
	 */
	List<FixGroupBO> listFixGroupByClassId(BigInteger classId) {
		
		return null;
	};
	
	/**
	 * 方法简述.
	 * <p>按classId删除FixGroup<br>  
	 * @author zhouzhongjun
     * @param BigInteger classId 班级Id
     * @see FixGroupService #listFixGroupByClassId(BigInteger classId)
     * @see FixGroupMemberService #deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)
     * @return true/false 是否成功删除
	 */
	boolean deleteFixGroupByClassId(BigInteger classId) {
		
		//删除自己
		return true;
	};
    
    /**
	 * 创建固定小组.
	 * ＜p＞在指定班级下创建固定小组<br>*
	 * @author YeHongjie
	 * @param classId 班级的id
	 * @param fixGroupBO 小组信息
	 * @return BigInteger 若创建成功返回该小组的id，失败则返回-1
	 */
    BigInteger insertFixGroupByClassId(BigInteger classId,FixGroupBO fixGroupBO)
    {
    	BigInteger fixGroupId = BigInteger.valueOf(-1);
    	return fixGroupId;
    }
    
    /**
	 * 删除固定小组.
	 * ＜p＞按照id删除固定小组<br>*
	 * @author YeHongjie
	 * @param groupID 固定小组的id
	 * @return Boolean 若创建成功返回true，失败返回false
	 * @see FixGroupMemberService #deleteFixGroupMemberByFixGroupId(BigInteger fixGroupId)
	 */
    Boolean deleteFixGroupByGroupId(BigInteger groupId)
    {
    	Boolean state=Boolean.valueOf(false);
    	return state;
    }
    
    /**
	 * 修改固定小组.
	 * ＜p＞修改固定小组的信息（不包括成员）<br>*
	 * @author YeHongjie
	 * @param groupID 小组的id
	 * @param fixGroupBO 小组信息
	 * @return Boolean 若创建成功返回true，失败返回false
	 */
    Boolean updateFixGroupByGroupId(BigInteger groupId,FixGroupBO fixGroupBO)
    {
    	Boolean state=Boolean.valueOf(false);
    	return state;
    }
    
    /**
	 * 查询固定小组.
	 * ＜p＞按照id查询某一固定小组的信息（包括成员）<br>*
	 * @author YeHongjie
	 * @param groupID 小组的id
	 * @return fixGroupBO 固定小组对象，若未找到相关小组返回空(null)
	 * @see FixGroupMemberService #listFixGroupMemberByGroupId(BigInteger groupId)
	 */
    FixGroupBO getFixGroupByGroupId(BigInteger groupId)
    {
    	FixGroupBO fixGroupBO=null;
    	return fixGroupBO;
    }
}
