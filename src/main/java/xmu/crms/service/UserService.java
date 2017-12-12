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
	 * 方法简述.
	 * <p>获取讨论课所在的班级的出勤学生名单<br>
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return list 处于出勤状态的学生的列表
	 */
	private List listPresentStudent(BigInteger seminarId, BigInteger classId) {
		
		List<UserBO> list = new ArrayList<UserBO>();		
		
		return list;
		
	}


	/**
	 * 方法简述.
	 * <p>用户解绑(.NET)<br>*.NET解绑是置空手机号Phone,J2EE解绑是置空微信号unionId<br>
	 * @param UserId 用户id
	 * @return true 解绑成功 false 解绑失败
	 */
	private boolean deleteUser(BigInteger UserId) {
		
		if(true) {
			
			return true;
		
		} else{
			
			return false;
			
		}
	}	

	
	/**
	 * 方法简述.
	 * <p>获取讨论课所在班级缺勤学生名单<br>
	 * @param seminarId 讨论课ID
	 * @param classId 班级ID
	 * @return list 处于缺勤状态的学生列表
	 */
	private List listAbsenceStudent(BigInteger seminarId,BigInteger classId) {

		List<UserBO> list = new ArrayList<UserBO>();
		
		return list;
		
	}


	/**
	 * 方法简述.
	 * <p>根据用户Id获取用户的信息<br> 
	 * @param UserId 用户Id
	 * @return user 用户信息
	 * @see SchoolService#getSchoolBySchoolId(BigInteger SchoolId)
	 */
	private UserBO getUserByUserId(BigInteger UserId) {
		
		/**SchoolService.getSchoolBySchoolId(BigInteger SchoolId);*/

		UserBO user = new UserBO();
		
		return user;
		
	}
	
	
	/**
	 * 方法简述.
	 * <p>根据用户ID修改用户信息<br> 
	 * @param UserId 用户Id
	 * @param user 用户信息
	 * @return true 修改成功 false 修改失败
	 */
	private boolean updateUserByUserId(BigInteger UserId, UserBO user) {
		
		if(true) {
			
			return true;
		
		} else{
			
			return false;
			
		}
		
	}

	
	/**
	 * 方法简述.
	 * <p>微信登录<br> 
	 * @param UserId 用户Id
	 * @param code 微信小程序/OAuth2授权的Code
	 * @param state 微信OAuth2授权的state。对于小程序，值恒为 MiniProgram
	 * @param success_url 微信OAuth2授权后跳转到的网址
	 * @return user 该用户信息
	 */
	private UserBO signInWeChat(BigInteger UserId,String code,String state,String success_url) {

		UserBO user = new UserBO();		
		
		return user;
		
	}
	
	
	/**
	 * 方法简述.
	 * <p>手机号登录 (.Net使用)<br>*User中只有Phone和Password，用于判断用户名密码是否正确<br> 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 */
	private UserBO signInPhone(UserBO user) {
		
		return user;
		
	};		

	
	/**
	 * 方法简述.
	 * <p>手机号注册 (.Net使用)<br>*User中只有Phone和Password，UserId是注册后才有并且在数据库自增<br> 
	 * @param user 用户信息(手机号Phone和密码Password)
	 * @return user 该用户信息
	 */
	private UserBO signUpPhone(UserBO user) {
		
		return user;
		
	}
	

	/**
	 * 方法简述.
	 * <p>按班级ID、学号开头、姓名开头获取学生列表<br> 
	 * @param classId 班级ID
	 * @param numBeginWith 学号开头
	 * @param nameBeginWith 姓名开头
	 * @return List<User> 用户列表
	 */	
	private List listUserByClassId(BigInteger classId,String numBeginWith,String nameBeginWith) {

		List<UserBO> list = new ArrayList<UserBO>(); 
		
		return list;
		
	}
	
	
	/**
	 * 方法简述.
	 * <p>根据用户名获取用户ID<br>
	 * @param UserName 用户名
	 * @return UserId 用户ID
	 */
	private BigInteger getUserIdByUserName(String UserName) {
		BigInteger userid=new BigInteger("100");
		return userid;
	}
        
	/**
	 * 获取小组成员.
	 * <p>通过学生个人的id获取学生所在小组的成员列表<br>
	 * @author heqi
	 * @param userId 学生id
	 * @return list 学生小组成员列表
	 */
	private List<UserBO> listFixedGroupMembersById(BigInteger userId){
		//UserDao.listFixedGroupMembersById(BigInteger userId)
		List<UserBO> list = new ArrayList<UserBO>();
		return list;
	}	
}
