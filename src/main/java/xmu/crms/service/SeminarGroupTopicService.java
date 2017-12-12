package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SeminarGroupTopicService {
	
	/**
	 * 获取某学生所有讨论课的成绩.
	 * ＜p＞获取某学生所有讨论课的成绩<br>
	 * @author qinlingyun
	 * @param userId 学生id
	 * @param seminarGroupId 讨论课小组id
	 * @return list 讨论课分数列表
	 * @see SeminarGroupMemberService#listSeminarGroupIdByStudentId(BigInteger userId)
	 */
    List<BigInteger> listSeminarGradeBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId)
    {
    	List<BigInteger> list = new ArrayList();
    	
    	return list;
    }

}
