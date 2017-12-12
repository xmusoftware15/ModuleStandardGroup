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
public class GradeService {

	/**
	 * 按topicId删除学生打分表
	 * @author zhouzhongjun
     * @param BigInteger topicId 话题Id
     *  @return true/false 是否成功删除
	 */
	private boolean deleteStudentScoreGroupByTopicId(BigInteger topicId) {
		
		//删除自己
		return true;
	}
	/**
	 * 获取某学生所有讨论课的成绩.
	 * <p>获取某学生所有讨论课的成绩<br>
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
	/**
	 * 提交对其他小组的打分.
	 * 
	 * @author Huhui
	 * @param seminar_group_id 讨论课组id
	 * @param userId 用户id
	 * @param grade 分数
	 * @return Boolean true 提交成功 false 提交失败
	 * @see xmu.crms.service.GroupService#selectGroupTopicByGroupId()
	 */
	private boolean insertGroupGradeByUserId(BigInteger seminar_group_id, BigInteger userId,BigInteger grade) {
		//rs=GroupService.selectGroupTopicByGroupId(seminar_group_id)
		//for group_topic_Id in rs;
		// GradeDAO.insertUserScoreGroupById(BigInteger group_topic_Id, BigInteger userId,BigInteger grade)
		return true;
	}

	/**
	 * 按ID设置小组报告分.
	 * 
	 * @author Huhui
	 * @param seminar_group_id 讨论课组id
	 * @param grade 分数
	 * @return Boolean true 操作成功 false 操作失败
	 */
	private boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade) {
		//GradeDAO.updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade)
		return true;
	}
	
	/**
	 * 获取某学生的讨论课成绩列表.
	 * @author qinlingyun
	 * @param seminarId 讨论课id
	 * @param userId 用户id
	 * @return list 讨论课成绩列表
	 * @see SeminarGroupService#listSeminarGroupBySeminarId(BigInteger seminarId);
	 */
	private List<BigInteger> listSeminarGradeByStudentId(BigInteger userId) {
		
		List<BigInteger> list = new ArrayList<BigInteger>();		
		
		return list;		
	}
	
}
