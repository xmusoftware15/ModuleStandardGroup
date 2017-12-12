package xmu.crms.service;
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class CourseService {
	
	/**
	 * 按课程名获取课程
	 * <p>根据课程名称获取课程<br>
	 * @author yexiaona
	 * @param courseName 课程名称
	 * @return List<CourseBO> 课程列表
	 */
	private List<CourseBO> listCourseByCourseName(String courseName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}
	
	/**
	 * 按教师名称获取课程
	 * <p>根据教师名称获取教师ID，根据教师ID获取课程ID<br>
	 * @author yexiaona
	 * @param teacherName 教师名称
	 * @return List<CourseBO> 课程列表
	 * @see CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<CourseBO> listCourseByTeacherName(String teacherName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}

}
