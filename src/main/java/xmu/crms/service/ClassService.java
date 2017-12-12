package xmu.crms.service;
<<<<<<< HEAD

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.*;

=======
import java.math.BigInteger
>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class ClassService {
	
	/**
<<<<<<< HEAD
	 * 方法简述.
	 * <p>按courseId获取课程<br> 
	 * @author zhouzhongjun
	 * @param BigInteger userId 用户Id
	 * @return List<ClassBO> 班级列表
	 */
	private  List<ClassBO> listClassByuserId(BigInteger userId) {
		
		List<ClassBO> classBO=new ArrayList<ClassBO>();
		return classBO;
		
	};	
	
	/**
	 * 方法简述.
	 * <p>按courseId获取Class<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
     * @return List<ClassBO> 班级列表
	 */
	List<ClassBO> listClassByCourseId (BigInteger courseId) {
			
		return null;
	};
	
	/**
	 * 方法简述.
	 * <p>按courseId删除Class<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 *@see ClassService  #listClassByCourseId (BigInteger courseId)
	 *@see ClasssSelectionService   #deleteClasssSelectionByClassId(BigInteger classId)
	 *@see ScoreRuleService  #deleteScoreRuleById(BigInteger CourseId,BigInteger ClassId)
	 *@see FixGroupService  #deleteFixGroupByClassId(BigInteger ClassId)
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};
=======
	 * ���γ����ƺͽ�ʦ���ƻ�ȡ�༶�б�
	 * <p>���ݿγ����ͽ�ʦ����ȡ�γ�ID��ͨ���γ�ID��ȡ�༶�б�;���γ����Ͱ༶������Ϊ�գ�ȡ����<br>
	 * @author yexiaona
	 * @param courseName �γ�����
	 * @param teacherName ��ʦ����
	 * @return List<ClassBO> �༶�б�
	 * @see xmu.crms.service.ClassService#listClassByCourseName(String courseName)
	 * @see xmu.crms.service.ClassService#listClassByTeacherName(String teacherName)
	 */
	private List<ClassBO> listClassByName(String courseName,String teacherName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ���γ����ƻ�ȡ�༶�б�
	 * <p>���ݿγ�����ȡ�γ�ID��ͨ���γ�ID��ȡ�༶�б�<br>
	 * @author yexiaona
	 * @param courseName �γ�����
	 * @return List<ClassBO> �༶�б�
	 * @see xmu.crms.service.CourseService#listCourseByCourseName(String courseName)
	 * @see xmu.crms.service.ClassService#listClassByCourseId (BigInteger courseId)
	 */
	private List<ClassBO> listClassByCourseName(String courseName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ����ʦ���ƻ�ȡ�༶�б�
	 * <p>���ݽ�ʦ���ƻ�ȡ�γ�ID��ͨ���γ�ID��ȡ�༶�б�<br>
	 * @author yexiaona
	 * @param teacherName ��ʦ����
	 * @return List<ClassBO> �༶�б�
	 * @see xmu.crms.service.CourseService#listCourseByTeacherName(String teacherName)
	 * @see xmu.crms.service.ClassService#listClassByCourseId (BigInteger courseId)
	 */
	private List<ClassBO> listClassByTeacherName(String teacherName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ���ݽ�ʦID��ȡ�༶�б�
	 * @author yexiaona
	 * @param userId ��ʦID
	 * @return List<ClassBO> �༶�б�
	 * @see xmu.crms.service.CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<ClassBO> listClassByUserId(BigInteger userId)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ���ݿγ�ID��ð༶�б�
	 * @author yexiaona
	 * @param courseId �γ�ID
	 * @return List<ClassBO> �༶�б�
	 */
	private List<ClassBO> listClassByCourseId(BigInteger courseId)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ���༶id��ȡ�༶����
	 * <p>���ݰ༶id��ȡ�༶<br>
	 * @author yexiaona
	 * @param classId �༶ID
	 * @return ClassBO �༶
	 */
	private ClassBO getClassByClassId(BigInteger classId)
	{
		ClassBO classBo=new ClassBO();
		return classBo;
	}
	
	/**
	 * ���༶id�Ͱ༶�޸İ༶��Ϣ
	 * <p>���ݰ༶id�޸İ༶��Ϣ<br>
	 * @author yexiaona
	 * @param classId �༶ID
	 * @return boolean �༶�޸��Ƿ�ɹ����
	 * @see xmu.crms.service.?????????????#updateScoreRuleById(BigInteger scoreRuleId)
	 */
	private boolean updateClassByClassId(BigInteger classId)
	{
		boolean isUpdated;
		return isUpdated;
	}
	
	/**
	 * ���༶idɾ���༶
	 * <p>���ݰ༶idɾ���༶<br>
	 * @author yexiaona
	 * @param classId �༶ID
	 * @return boolean �༶ɾ���Ƿ�ɹ����
	 * @see xmu.crms.service.?????????????#deleteScoreRuleById(BigInteger scoreRuleId)
	 * @see xmu.crms.service.ClassService#deleteCourseSelectionById(BigInteger classId,User user)
	 */
	private boolean deleteClassByClassId(BigInteger classId)
	{
		boolean isDeleted;
		return isDeleted;
	}
	
	/**
	 * ѧ�����༶idѡ��༶
	 * <p>���ݰ༶id���û�id����ѡ�μ�¼<br>
	 * @author yexiaona
	 * @param userId �û�id
	 * @param classId �༶id
	 * @return url ѡ��url
	 */
	private String insertCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		String url=new String();
		return url;
	}
	
	/**
	 * ѧ�����༶idȡ��ѡ��༶
	 * <p>���ݰ༶id���û�idɾ��ѡ�μ�¼����ð༶��ص���Ϣ<br>
	 * @author yexiaona
	 * @param userId �û�id
	 * @param classId �༶id
	 * @return boolean ȡ���༶�Ƿ�ɹ�
	 */
	private boolean deleteCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		boolean isDeleted;
		return isDeleted;
	}
	
	/**
	 * ��ʦ��ȡ�ð༶ǩ��������״̬
	 * <p>�������ۿ�id���༶id����øð༶��ǩ��������״̬<br>
	 * @author yexiaona
	 * @param seminarId ���ۿ�id
	 * @param classid �༶id
	 * @return classBO �༶
	 * @see xmu.crms.service.GroupService#listGroupBySeminarId(BigInteger seminarId)
	 */
	private ClassBO getCallGroupStatusById(BigInteger seminarId,BigInteger classId)
	{
		ClassBO classBO=new ClassBO();
		return classBO;
	}
	
	/**
	 * �½��༶
	 * <p>���ݽ�ʦid�Ϳγ�id�½��༶<br>
	 * @author yexiaona
	 * @param userId ��ʦid
	 * @param courseId �γ�id
	 * @param List<userId> ѧ���б�
	 * @return ClassBO �༶
	 * @see xmu.crms.service.ClassService#insertCourseSelectionById(BigInteger userId,BigInteger classId)
	 */
	private ClassBO insertClassById(BigInteger userId,BigInteger courseId)
	{
		ClassBO classBO=new ClassBO();
		return classBO;
	}
>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf

}
