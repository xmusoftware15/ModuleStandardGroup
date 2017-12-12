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
	 * ＜p＞根据班级id，学生id进行签到，在该操作内部调用相应API获取地理位置进行判断
	 * @author LiuAiqi
	 * @param classId 班级的id
	 * @param userId 学生的id
	 * @return true（添加签到信息成功）/false（添加签到信息未成功）
     * @see ClassService#getClassByClassId(BigInteger classId)
	 */
	boolean insertAttendanceById(Biginteger classId,Biginteger userId)
	{
		if(true)
			return true;
		else return false;
	}

}
