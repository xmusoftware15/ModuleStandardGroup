package xmu.crms.service;

import java.math.BigInteger;
import java.util.List;
import java.sql.ResultSet;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class GroupService {
	/**
	 * 根据讨论课Id获得属于该讨论课的所有小组信息
	 * @param seminarId 讨论课的id
	 * @return List<GroupBO> 所有group的信息
	 */

	private List<GroupBO> listGroupBySeminarId(BigInteger seminarId)  {
                List<GroupBO> list;
		//list = GroupDao.listGroupBySeminarId(BigInteger seminarId);
		return list;
	}

	/**
	 * 根据话题Id获得选择该话题的所有小组的信息
	 * @param  topicId(话题的id)
	 * @return  List<GroupBO> 所有选择该话题的所有group的信息
	 */
	private List<GroupBO> listGroupByTopicId(BigInteger topicId) {
                List<GroupBO> list;
		//list = GroupDao. listGroupByTopicId(BigInteger topicId);
		return list;
	}
	
     /**
     * 根据讨论课Id及用户id，获得该用户所在的讨论课的小组的信息
     * @param BigInteger seminarId (讨论课的id)
     * @param BigInteger userId（用户的id）
     * @return GroupBO Group的相关信息
     */
     GroupBO getSeminarGroupById(BigInteger seminarId,BigInteger userId){
          GroupBO groupBO;
          ResultSet rs;
          //rs = GroupDao.listGroupBySeminarId(BigInteger seminarId);
          //for groupBO in rs
          //   if (GroupDao.(groupBO,userId)) //如果该用户在该小组中，则直接返回此小组的信息
          //          return groupBO;
          //return null;   //如果该用户不在该讨论课的任何小组中返回空
    };
    
   
}
