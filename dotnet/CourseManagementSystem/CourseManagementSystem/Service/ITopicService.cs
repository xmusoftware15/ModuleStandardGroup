﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Numerics;
using Xmu.Crms.Shared.Models;

namespace Xmu.Crms.Shared.Service
{
    /**
 * @author Aixing ZhouZhongjun
 * @version 2.00
 */
    public interface TopicService
    {


        /**
	 * 按topicId获取topic.
	 * <p>按topicId获取topic<br>
	 * @author aixing
	 * @param topicId 要获取的topic的topicId
	 * @return 该topic
	 * @exception TopicNotFoundException 无此小组或Id错误
	 * @exception IllegalArgumentException Id格式错误时抛出
	 */
        Topic GetTopicByTopicId(long topicId);

        /**
	 * 根据topicId修改topic.
	 * <p>根据topicId修改topic<br>
	 * @author aixing
	 * @param topicId 讨论课的ID
	 * @param topic 修改后的讨论课
	 * @exception TopicNotFoundException 无此小组或Id错误
	 * @exception IllegalArgumentException Id格式错误或topic格式错误时抛出
	 */
        void UpdateTopicByTopicId(long topicId, Topic topic);

        /**
	 * 删除topic.
	 * <p>删除topic表中相应讨论课的topic<br>
	 * @param topicId 要删除的topic的topicId
	 * @param seminarId 要删除topic所属seminar的id
	 * @exception IllegalArgumentException Id格式错误时抛出
	 */
        void DeleteTopicByTopicId(long topicId, long seminarId);
        



        /**
	 * 按seminarId获取Topic.
	 * <p>按seminarId获取Topic<br>
	 * @author zhouzhongjun
	 * @param seminarId 课程Id
	 * @return null
	 * @exception IllegalArgumentException Id格式错误时抛出
	 */
        List<Topic> ListTopicBySeminarId(long seminarId);

        /**
	 * 根据讨论课Id和topic信息创建一个话题.
	 * <p>根据讨论课Id和topic信息创建一个话题<br>
	 * @author aixing
	 * @param seminarId 话题所属讨论课的Id
	 * @param topic 话题
	 * @return 新建话题后给topic分配的Id
	 * @exception IllegalArgumentException Id格式错误或topic格式错误时抛出
	 */
        long InsertTopicBySeminarId(long seminarId, Topic topic);

        /**
	 * 小组取消选择话题.
	 * <p>小组取消选择话题  <br>
	 * <p>删除seminar_group_topic表的一条记录<br>
	 * @author zhouzhongjun
	 * @param groupId 小组Id
	 * @param topicId 话题Id
	 * @exception IllegalArgumentException groupId格式错误或topicId格式错误时抛出
	 */
        void DeleteTopicById(long groupId, long topicId);
        /**
      * 按topicId删除SeminarGroupTopic表信息.
      * <p>删除seminar_group_topic表中选择了某个话题的全部记录<br>
      * @author zhouzhongjun
      * @param topicId 讨论课Id
      * @exception IllegalArgumentException topicId格式错误
      */
        void DeleteSeminarGroupTopicByTopicId(long topicId);


        /**
      * 按seminarId删除话题.
      * <p>删除某讨论课下的所有Topic<br>
      * <p>根据seminarId获得topic信息，然后再根据topic删除seninargrouptopic信息和根据seminarGroupTopicId删除StudentScoreGroup信息，最后再根据删除topic信息<br>
      * @author zhouzhongjun
      * @param seminarId 讨论课Id
      *@see TopicService #listTopicBySeminarId(BigInteger seminarId)
      *@see TopicService #deleteSeminarGroupTopicByTopicId(BigInteger topicId)
      *@see GradeService   #deleteStudentScoreGroupByTopicId(BigInteger seminarGroupTopicId)
      * @exception IllegalArgumentException seminarId格式错误
      */
        void DeleteTopicBySeminarId(long seminarId);


    }
}
