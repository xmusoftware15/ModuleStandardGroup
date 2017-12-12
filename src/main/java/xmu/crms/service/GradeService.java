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
