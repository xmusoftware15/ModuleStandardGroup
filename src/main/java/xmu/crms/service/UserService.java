package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.UserBO;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class UserService {
	/**
	 * 查询班级出勤学生信息.
	 * ＜p＞根据讨论课id及班级id得到讨论课所在的班级出勤学生信息(方法的详细说明第一行)＜br＞ * (方法的详细说明第二行)
	 * @author XXX
	 * @param seminarId 讨论课的id
	 * @param classId 班级的id
	 * @return List 处于出勤状态的学生列表
	 * @see (具体的Service的方法，写法参考文档。例如XXXService#toString() )
	 */
	private List listPresentStudent(BigInteger seminarId, BigInteger classId) {
		List<UserBO> list = new ArrayList<UserBO>();
		return list;
	}
	
}
