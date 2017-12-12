package xmu.crms.service;

import java.math.BigInteger;

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
	 */
	boolean deleteSeminarGroupMemberBySeminarGroupId(BigInteger seminarGroupId) {
			
		//删除自己
		return true;
	};
}
