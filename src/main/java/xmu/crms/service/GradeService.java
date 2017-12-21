package xmu.crms.service;

import xmu.crms.entity.Seminar;
import xmu.crms.entity.SeminarGroup;

import java.math.BigInteger;
import java.util.List;

/**
 * @author Yexiaona
 * @version 2.00
 */
public interface GradeService {

    /**
     * 按topicId删除学生打分表.
     *
     * @param topicId 话题Id
     * @return true删除成功  false删除失败
     * @author zhouzhongjun
     */
    Boolean deleteStudentScoreGroupByTopicId(BigInteger topicId);

    /**
     * 获取某学生一堂讨论课信息.
     * <p>获取某学生一堂讨论课的详细信息（包括成绩）<br>
     *
     * @param userId         学生id
     * @param seminarGroupId 讨论课小组id
     * @return list 讨论课分数列表
     * @author qinlingyun
     */
    SeminarGroup getSeminarGroupBySeminarGroupId(BigInteger userId, BigInteger seminarGroupId);

    /**
     * 获取某学生所有讨论课的所有成绩
     * <p>获取某学生所有讨论课的详细信息（包括成绩）<br>
     *
     * @param userId
     * @return list 学生历史讨论课小组列表（包含成绩）
     * @author qinlingyun
     * @see SeminarGroupService#listSeminarGroupIdByStudentId(BigInteger)
     * @see GradeService#getSeminarGroupBySeminarGroupId(BigInteger, BigInteger)
     */
    List<SeminarGroup> listSeminarGradeByUserId(BigInteger userId);

    /**
     * 按课程id获取学生所有讨论课成绩
     * <p>通过课程id获取该课程下学生所有讨论课详细信息（包括成绩）<br>
     *
     * @param courseId
     * @return list 该课程下所有讨论课列表
     * @see SeminarService#listSeminarByCourseId(BigInteger)
     * @see SeminarGroupService#listSeminarGroupBySeminarId(BigInteger)
     * @see GradeService#getSeminarGroupBySeminarGroupId(BigInteger, BigInteger)
     */
    List<SeminarGroup> listSeminarGradeByCourseId(BigInteger courseId);

    /**
     * 提交对其他小组的打分.
     *
     * @param userId    用户id
     * @param seminarId 讨论课Id
     * @param groupId   小组Id
     * @param grade     分数
     * @param topicId   话题id
     * @return true 提交成功 false 提交失败
     * @author Huhui
     */
    Boolean insertGroupGradeByUserId(BigInteger topicId, BigInteger userId, BigInteger seminarId, BigInteger groupId, BigInteger grade);

    /**
     * 按ID设置小组报告分.
     *
     * @param seminar_group_id 讨论课组id
     * @param grade            分数
     * @return Boolean true 操作成功 false 操作失败
     * @author Huhui
     */
    Boolean updateGroupByGroupId(BigInteger seminar_group_id, BigInteger grade);

    /**
     * 定时器方法.
     * 讨论课结束后计算展示得分.
     * <p>条件: 讨论课已结束<br>*GradeService<br>
     *
     * @param seminarId     讨论课ID
     * @param seminarGroupId 小组ID
     * @author qinlingyun
     */
    void countPresentationGrade(BigInteger seminarId, BigInteger seminarGroupId);


    /**
     * 定时器方法.
     * 讨论课结束后计算本次讨论课得分.
     * <p>条件: 讨论课已结束，展示得分已算出<br>*GradeService<br>
     *
     * @param seminarId     讨论课ID
     * @param seminarGroupId 小组ID
     * @author qinlingyun
     */
    void countGroupGradeBySerminarId(BigInteger seminarId, BigInteger seminarGroupId);


}
