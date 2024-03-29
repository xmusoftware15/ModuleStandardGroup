﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Numerics;
using Xmu.Crms.Shared.Models;

namespace Xmu.Crms.Shared.Service
{
    /**
 * 
 * @author Huhui QinLingyun ZhouZhongjun
 * @version 2.00
 *
 */
    public interface GradeService
    {


        /**
     * 按seminarGroupTopicId删除学生打分表.
     *
     * @param seminarGroupTopicId  小组话题表的Id
     * @return true删除成功  false删除失败
     * @throws IllegalArgumentException topicId格式错误时抛出
     * @author zhouzhongjun
     */
        void DeleteStudentScoreGroupByTopicId(long seminarGroupTopicId);

        /**
         * 获取某学生一堂讨论课信息.
         * <p>获取某学生一堂讨论课的详细信息（包括成绩）<br>
         *
         * @param userId         学生id
         * @param seminarGroupId 讨论课小组id
         * @return seminarGroup 讨论课小组信息（包括成绩）
         * @throws xmu.crms.exception.GroupNotFoundException 无此小组
         * @throws IllegalArgumentException                  userId或seminarGrouopId格式错误
         * @author qinlingyun
         */
        SeminarGroup GetSeminarGroupBySeminarGroupId(long userId, long seminarGroupId);

        /**
         * 获取某学生所有讨论课的所有成绩
         * <p>获取某学生所有讨论课的详细信息（包括成绩）<br>
         *
         * @param userId
         * @return list 学生历史讨论课小组列表（包含成绩）
         * @throws IllegalArgumentException userId格式错误
         * @author qinlingyun
         * @see SeminarGroupService#listSeminarGroupIdByStudentId(long)
         * @see GradeService#getSeminarGroupBySeminarGroupId(long, long)
         */
        List<SeminarGroup> ListSeminarGradeByUserId(long userId);

        /**
         * 按课程id获取学生该课程所有讨论课
         * <p>通过课程id获取该课程下学生所有讨论课详细信息（包括成绩）<br>
         *
         * @param userId
         * @param courseId
         * @return list 该课程下所有讨论课列表
         * @throws IllegalArgumentException courseId格式错误
         * @see SeminarService#listSeminarByCourseId(long)
         * @see SeminarGroupService#listSeminarGroupBySeminarId(long)
         * @see GradeService#listSeminarGradeByUserId(long) 
         */
        List<SeminarGroup> listSeminarGradeByCourseId(long userId, long courseId) ;

        /**
         * 提交对其他小组的打分.
         *
         * @param userId    用户id
         * @param seminarId 讨论课Id
         * @param groupId   小组Id
         * @param grade     分数
         * @param topicId   话题id
         * @throws IllegalArgumentException topicId或userId或seminarId或groupId或grade格式错误
         * @author Huhui
         */
        void insertGroupGradeByUserId(long topicId, long userId, long seminarId, long groupId, int grade);

        /**
         * 按ID设置小组报告分.
         *
         * @param seminar_group_id 讨论课组id
         * @param grade            分数
         * @throws GroupNotFoundException   未找到小组
         * @throws IllegalArgumentException seminar_group_id或grade格式错误
         * @author Huhui
         */
        void updateGroupByGroupId(long seminar_group_id, int grade);

        /**
         * 定时器方法.
         * 讨论课结束后计算展示得分.
         * <p>条件: 讨论课已结束<br>*GradeService<br>
         *
         * @param seminarId      讨论课ID
         * @param seminarGroupId 小组ID
         * @throws IllegalArgumentException seminarId或seminarGroupId格式错误
         * @author qinlingyun
         */
        void countPresentationGrade(long seminarId, long seminarGroupId);


        /**
         * 定时器方法.
         * 讨论课结束后计算本次讨论课得分.
         * <p>条件: 讨论课已结束，展示得分已算出<br>*GradeService<br>
         *
         * @param seminarId      讨论课ID
         * @param seminarGroupId 小组ID
         * @throws IllegalArgumentException seminarId或seminarGroupId格式错误
         * @author qinlingyun
         */
        void countGroupGradeBySerminarId(long seminarId, long seminarGroupId);




    }
}
