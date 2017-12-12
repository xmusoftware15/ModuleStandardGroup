package xmu.crms.service;

import java.math.BigInteger;

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
}
