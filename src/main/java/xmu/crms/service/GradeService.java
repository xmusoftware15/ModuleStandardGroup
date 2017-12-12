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
	 * �ύ������С��Ĵ��.
	 * 
	 * @author Huhui
	 * @param seminar_group_id ���ۿ���id
	 * @param userId �û�id
	 * @param grade ����
	 * @return Boolean true��ʾ����ɹ���false��ʾ����ʧ��
	 * @see xmu.crms.service.GroupService#selectGroupTopicByGroupId()
	 */
	private boolean insertGroupGradeByUserId(BigInteger seminar_group_id, BigInteger userId,BigInteger grade) {
		//rs=GroupService.selectGroupTopicByGroupId(seminar_group_id)
		//for group_topic_Id in rs;
		// GradeDAO.insertUserScoreGroupById(BigInteger group_topic_Id, BigInteger userId,BigInteger grade)
		return true;
	}

	/**
	 * ��ID����С�鱨���.
	 * 
	 * @author Huhui
	 * @param seminar_group_id ���ۿ���id
	 * @param grade ����
	 * @return Boolean true��ʾ����ɹ���false��ʾ����ʧ��
	 */
	private boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade) {
		//GradeDAO.updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade)
		return true;
	}
	
    /**
     * ��������
     * <p>��ID��ȡС�����ۿγɼ�</p>
     * @param groupId С��ID
     * @return С��ɼ�
     * @see xmu.crms.service.GroupService#countGradeByGroupId()
     */
    BigInteger countGradeByGroupId(BigInteger groupId){
        BigInteger grade=new BigInteger("100");
        //GradeDAO.countGradeByGroupId(BigInteger groupId);
        return grade;
    }
    
 
}
