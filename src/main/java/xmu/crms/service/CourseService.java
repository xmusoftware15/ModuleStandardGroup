package xmu.crms.service;
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class CourseService {
	
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
	 * @see CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<CourseBO> listCourseByTeacherName(String teacherName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}

}
