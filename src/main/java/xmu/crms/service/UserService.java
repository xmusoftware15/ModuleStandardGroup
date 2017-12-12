package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.UserBO;

/**
 * @author ModuleStandardGroup
 * @version 1.00
 */
public class UserService {

	/**
	 * 手机号注册.
	 * <p>手机号注册 (.Net使用)<br>*User中只有phone和password，userId是注册后才有并且在数据库自增<br> 
	 * @author qinlingyun	 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 */
	private UserBO signUpPhone(UserBO user) {
		
		return user;
		
	}
	

	/**
	 * 微信登录.
	 * <p>微信登录<br> 
	 * @author qinlingyun
	 * @param userId 用户Id
	 * @param code 微信小程序/OAuth2授权的Code
	 * @param state 微信OAuth2授权的state。对于小程序，值恒为 MiniProgram
	 * @param successUrl 微信OAuth2授权后跳转到的网址
	 * @return user 该用户信息
	 */
	private UserBO signInWeChat(BigInteger userId,String code,String state,String successUrl) {

		UserBO user = new UserBO();		
		
		return user;
		
	}
	
	
	/**
	 * 手机号登录.
	 * <p>手机号登录 (.Net使用)<br>*User中只有phone和password，用于判断用户名密码是否正确<br>
	 * @author qinlingyun 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 */
	private UserBO signInPhone(UserBO user) {
		
		return user;
		
	}
	
	
	/**
	 * 用户解绑.
	 * <p>教师解绑账号<br>*.NET解绑是置空手机号phone,J2EE解绑是置空微信号unionId<br>
	 * @author qinlingyun
	 * @param userId 用户id
	 * @return true 解绑成功 false 解绑失败
	 * @see CourseService#listCourseByTeacherName(String teacherName)
	 * @see CourseService#deleteCourseByCourseId(BigInteger courseId)
	 */
	private boolean deleteTeacherAccount(BigInteger userId) {
			
			return true;
	}	
	
	
	/**
	 * 用户解绑.
	 * <p>学生解绑账号<br>*.NET解绑是置空手机号phone,J2EE解绑是置空微信号unionId<br>
	 * @author qinlingyun 
	 * @param userId 用户id
	 * @return true 解绑成功 false 解绑失败
	 * @see ？？？？？？？？？？？？？
	 */		
	private boolean deleteStudentAccount(BigInteger userId) {
	
		return true;
	}
	
	
	/**
	 * 根据用户Id获取用户的信息.
	 * <p>根据用户Id获取用户的信息<br> 
	 * @author qinlingyun
	 * @param userId 用户Id
	 * @return user 用户信息
	 * @see SchoolService#getSchoolBySchoolId(BigInteger schoolId)
	 */
	private UserBO getUserByUserId(BigInteger userId) {

		UserBO user = new UserBO();
		
		return user;
		
	}
	

	/**
	 * 根据用户名获取用户ID.
	 * <p>根据用户名获取用户ID<br>
	 * @author qinlingyun
	 * @param userName 用户名
	 * @return userId 用户ID
	 */
	private BigInteger getUserIdByUserName(String userName) {
		BigInteger userId=new BigInteger("100");
		return userId;
	}
	
	
	/**
	 * 根据用户ID修改用户信息.
	 * <p>根据用户ID修改用户信息<br> 
	 * @author qinlingyun
	 * @param userId 用户Id
	 * @param user 用户信息
	 * @return true 修改成功 false 修改失败
	 */
	private boolean updateUserByUserId(BigInteger userId, UserBO user) {
		
			return true;
	}
	

	/**
	 * 按班级ID、学号开头、姓名开头获取学生列表.
	 * <p>按班级ID、学号开头、姓名开头获取学生列表<br> 
	 * @author qinlingyun
	 * @param classId 班级ID
	 * @param numBeginWith 学号开头
	 * @param nameBeginWith 姓名开头
	 * @return list 用户列表
	 */	
	private List listUserByClassId(BigInteger classId,String numBeginWith,String nameBeginWith) {

		List<UserBO> list = new ArrayList<UserBO>(); 
		
		return list;
		
	}
	
	
	/**
	 * 获取讨论课所在的班级的出勤学生名单.
	 * <p>根据ID获取讨论课所在的班级的出勤学生名单<br>
	 * @author qinlingyun
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return list 处于出勤状态的学生的列表
	 */
	private List listPresentStudent(BigInteger seminarId, BigInteger classId) {
		
		List<UserBO> list = new ArrayList<UserBO>();		
		
		return list;
		
	}


	/**
	 * 获取讨论课所在班级缺勤学生名单.
	 * <p>获取讨论课所在班级缺勤学生名单<br>
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return list 处于缺勤状态的学生列表
	 */
	private List listAbsenceStudent(BigInteger seminarId,BigInteger classId) {

		List<UserBO> list = new ArrayList<UserBO>();
		
		return list;
		
	}
	
}
