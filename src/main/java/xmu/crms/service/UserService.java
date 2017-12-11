package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.UserBO;
import xmu.crms.service.SchoolService;

/**
 * @author qinlingyun
 * @version 1.00
 */
public class UserService {
	/**
	 * 方法简述.
	 * <p>获取讨论课所在的班级的出勤学生名单<br>
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return List<User> 处于出勤状态的学生列表
	 * 调用的DAO方法：UserDAO.listPresentStudent(BigInteger seminarId, BigInteger classId)
	 */
	private List listPresentStudent(BigInteger seminarId, BigInteger classId) {
		
		List<UserBO> list = new ArrayList<UserBO>();
		
		return list;
		
	};


	/**
	 * 方法简述.
	 * <p>获取讨论课所在班级缺勤学生名单<br>
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return List<User> 处于缺勤状态的学生列表
	 * 调用的DAO方法：UserDAO.listAbsenceStudent(BigInteger seminarId, BigInteger classId)
	 */
	private List listAbsenceStudent(BigInteger seminarId,BigInteger classId) {
		
		List<UserBO> list = new ArrayList<UserBO>();
		
		UserDAO.listAbsenceStudent(BigInteger seminarId, BigInteger classId);
		
		return list;
		
	};


	/**
	 * 方法简述.
	 * <p>根据用户Id获取用户的信息<br> 
	 * @param UserId 用户Id
	 * @return UserBO 用户信息
	 * 调用的Service方法：SchoolService.getSchoolBySchoolId(BigInteger SchoolId);
	 * 调用的DAO方法：UserDAO.getUserByUserId(BigInteger UserId) 
	 */
	private UserBo getUserByUserId(BigInteger UserId) {
		
		List<UserBO> list = new ArrayList<UserBO>();
		
		SchoolService.getSchoolBySchoolId(BigInteger SchoolId);
		
		UserDAO.getUserByUserId(BigInteger UserId);
		
		return UserBO;
		
	};
	
	
	/**
	 * 方法简述.
	 * <p>根据用户ID修改用户信息<br> 
	 * @param UserId 用户Id
	 * @param user 用户信息
	 * @return true 修改成功 false 修改失败
	 * 调用的DAO方法：UserDao.updateUserById(BigInteger UserId,UserDO user) 
	 */
	private boolean updateUserByUserId(BigInteger UserId, UserBO user) {
		
		UserDao.updateUserById(BigInteger UserId, UserDO user);
		
		if() {
			
			return true;
		
		} else{
			
			return false;
			
		}
		
	};

	
	/**
	 * 方法简述.
	 * <p>微信登录<br> 
	 * @param UserId 用户Id
	 * @param code 微信小程序/OAuth2授权的Code
	 * @param state 微信OAuth2授权的state。对于小程序，值恒为 MiniProgram
	 * @param success_url 微信OAuth2授权后跳转到的网址
	 * @return user 该用户信息
	 * 调用的DAO方法：UserDao.signInWeChat(BigInteger UserId,String code,String state,String success_url)
	 */
	private User signInWeChat(BigInteger UserId,String code,String state,String success_url) {
		
		List<UserBO> list = new ArrayList<UserBO>();
		
		UserDao.signInWeChat(BigInteger UserId,String code,String state,String success_url);
		
		return user;
		
	};	
	
	
	/**
	 * 方法简述.
	 * <p>手机号登录 (.Net使用)<br> 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 * @see User中只有Phone和Password，用于判断用户名密码是否正确
	 * 调用的DAO方法：UserDao.signInPhone(UserDO user)
	 */
	private UserBO signInPhone(UserBO user) {
		
		UserDao.signInPhone(UserDO user)；
		
		return user;
		
	};		

	
	/**
	 * 方法简述.
	 * <p>手机号注册 (.Net使用)<br> 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 * @see User中只有Phone和Password，UserId是注册后才有并且在数据库自增
	 * 调用的DAO方法：UserDao.signUpPhone(UserDO user)
	 */
	private UserBO signUpPhone(UserBO user) {
		
		UserDao.signUpPhone(UserDO user)；
		
		return user;
		
	};
	

	/**
	 * 方法简述.
	 * <p>按班级ID、学号开头、姓名开头获取学生列表<br> 
	 * @param classId 班级ID
	 * @param numBeginWith 学号开头
	 * @param nameBeginWith 姓名开头
	 * @return user 学生列表
	 * 调用的DAO方法：UserDao.List listUserBeginWithNumAndName(BigInteger classId,String numBeginWith,String nameBeginWith)
	 * 调用的DAO方法：UserDao.List listUserBeginWithNum(BigInteger classId,String numBeginWith)
	 * 调用的DAO方法：UserDao.List listUserBeginWithName(BigInteger classId,String nameBeginWith)
	 */	
	private List listUserByClassId(BigInteger classId,String numBeginWith,String nameBeginWith) {

		List<UserBO> list = new ArrayList<UserBO>();

		UserDao.List listUserBeginWithNumAndName(BigInteger classId,String numBeginWith,String nameBeginWith);
		 
		UserDao.List listUserBeginWithNum(BigInteger classId,String numBeginWith);
		
		UserDao.List listUserBeginWithName(BigInteger classId,String nameBeginWith);		
		
		return List;
		
	};
		
}
