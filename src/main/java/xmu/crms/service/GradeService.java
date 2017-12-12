package xmu.crms.service;

import java.math.BigInteger;

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
	 * @return Boolean true表示插入成功，false表示插入失败
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
	 * @return Boolean true表示插入成功，false表示插入失败
	 */
	private boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade) {
		//GradeDAO.updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade)
		return true;
	}
	
    /**
     * 方法简述
     * <p>按ID获取小组讨论课成绩</p>
     * @param groupId 小组ID
     * @return 小组成绩
     * @see xmu.crms.service.GroupService#countGradeByGroupId()
     */
    BigInteger countGradeByGroupId(BigInteger groupId){
        BigInteger grade;
        gradeDAO.countGradeByGroupId(BigInteger groupId);
        return grade;
    };
    
    /**
     * 方法简述
     * <p>按ID设置小组报告分</p>
     * @param groupId 小组ID
     * @param grade 小组成绩
     * @see xmu.crms.service.GroupService#updateGroupByGroupId()
     * @return 是否成功
     */
    boolean updateGroupByGroupId(BigInteger groupId, BigInteger grade){
        gradeDAO.updateGroupByGroupId(BigInteger groupId, BigInteger grade);
        if(true){
            return true;
        }
        else{
            return false;
        }
    };
}
