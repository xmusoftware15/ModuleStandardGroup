package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;

import xmu.crms.bo.FixGroupBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */

public class FixGroupService {

	/**
	 * 方法简述.
	 * <p>按classId查找FixGroup<br>  
	 * @author zhouzhongjun
     * @param BigInteger classId 班级Id
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
	 */
	boolean deleteFixGroupByClassId(BigInteger classId) {
		
		//删除自己
		return true;
	};
}
