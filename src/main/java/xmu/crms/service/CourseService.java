package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.CourseBO;
import xmu.crms.bo.UserBO;


/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class CourseService {
	/**
	 * 方法简述.
	 * <p>按userId获取与当前用户相关联的课程列表<br> 
	 * @author zhouzhongjun
	 * @param BigInteger UserId 用户Id
	 * @return List<CourseBO>  课程列表
	 * @see ClassService #listClassByuserId(BigInteger userId)
	 * @see CourseService #listCourseBycourseId((BigInteger userId)
	 * @return List<CourseBO> 课程列表
	 */
	private List<CourseBO> listCourseByUserId(BigInteger userId) {
		
		return null;
	};	
	
	/**
	 * 方法简述.
	 * <p>按userId创建课程<br> 
	 * @author zhouzhongjun
	 * @param BigInteger UserId 用户Id
	 * @param CourseBO course 课程信息
	 * @return courseId 新建课程的id
	 */
	private  BigInteger insertCourseByUserId(BigInteger userId,CourseBO course) {
		
		BigInteger courseId = null;
		return  courseId;
	};	
	
	
	/**
	 * 方法简述.
	 * <p>按courseId获取课程<br> 
	 * @author zhouzhongjun
	 * @param BigInteger courseId 课程Id
	 * @return CourseBO
	 */
	private  CourseBO getCourseByCourseId(BigInteger courseId) {
		
		CourseBO course=new CourseBO();
		return course;
		
	};	
	
	
	/**
	 * 方法简述.
	 * <p>按userId创建课程<br> 
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 * @param CourseBO course 课程信息
	 * @return true/false 是否成功修改课程
	 */
	private boolean updateCourseByCourseId(BigInteger courseId,CourseBO course) {
		
		return true;
		
	};	
	
	/**
	 * 方法简述.
	 * <p>按courseId删除课程<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 *@see SeminarService #deleteSemiarByCourseId(BigInteger courseId)
	 *@see ClassService   #deleteClassByCourseId(BigInteger courseId)
	 *@return true/false 是否成功删除
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
		
		
		//删除自己
		return true;
	};
	
	/**
	 * ���γ�����ȡ�γ�
	 * <p>���ݿγ����ƻ�ȡ�γ�<br>
	 * @author yexiaona
	 * @param courseName �γ�����
	 * @return List<CourseBO> �γ��б�
	 */
	private List<CourseBO> listCourseByCourseName(String courseName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}
	
	/**
	 * ����ʦ���ƻ�ȡ�γ�
	 * <p>���ݽ�ʦ���ƻ�ȡ��ʦID�����ݽ�ʦID��ȡ�γ�ID<br>
	 * @author yexiaona
	 * @param teacherName ��ʦ����
	 * @return List<CourseBO> �γ��б�
	 * @see xmu.crms.service.CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<CourseBO> listCourseByTeacherName(String teacherName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}

}
