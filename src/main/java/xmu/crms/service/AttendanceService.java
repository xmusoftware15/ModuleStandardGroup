package xmu.crms.service;

import java.math.BigInteger;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class AttendanceService {
	/**
	 * 添加学生签到信息
	 * <p>根据班级id，讨论课id，学生id，经度，纬度进行签到<br>*在方法中通过班级id，讨论课id获取当堂课发起签到的位置
	 * @author LiuAiqi
	 * @param classId 班级的id
	 * @param seminarId 讨论课的id
	 * @param userId 学生的id
	 * @param longitude 经度
	 * @param latitude 纬度
	 * @return true（添加签到信息成功）/false（添加签到信息未成功）
	 */

	boolean insertAttendanceById(BigInteger classId, BigInteger seminarId, BigInteger userId, double longitude, double latitude)
	{
		
		if(true) 
		{
			return true;
		}
		else 
		{
			return false;
		}
	}
	
	/**
	 * 获取学生签到信息
	 * <p>根据班级id，讨论课id获取当堂课签到信息
	 * @author LiuAiqi
	 * @param classId 班级的id
	 * @return List<AttendanceBO> 当堂课签到信息
	 */
	List<AttendanceBO> getAttendanceById(BigInteger classId)
	{
		
		List<AttendanceBO> list = new ArrayList<AttendanceBO>();		
		return list;
	}
	
	
}


