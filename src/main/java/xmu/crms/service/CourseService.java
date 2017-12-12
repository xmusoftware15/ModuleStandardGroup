package xmu.crms.service;
<<<<<<< HEAD

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.CourseBO;
import xmu.crms.bo.UserBO;

=======
import java.math.BigInteger;
>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class CourseService {
<<<<<<< HEAD
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰userIdè·å–ä¸å½“å‰ç”¨æˆ·ç›¸å…³è”çš„è¯¾ç¨‹åˆ—è¡¨<br> 
	 * @author zhouzhongjun
	 * @param BigInteger UserId ç”¨æˆ·Id
	 * @return List<CourseBO>  è¯¾ç¨‹åˆ—è¡¨
	 * @see ClassService #listClassByuserId(BigInteger userId)
	 * @see CourseService #listCourseBycourseId((BigInteger userId)
	 */
	private List<CourseBO> listCourseByUserId(BigInteger userId) {
		
		return null;
	};	
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰userIdåˆ›å»ºè¯¾ç¨‹<br> 
	 * @author zhouzhongjun
	 * @param BigInteger UserId ç”¨æˆ·Id
	 * @param CourseBO course è¯¾ç¨‹ä¿¡æ¯
	 * @return courseId æ–°å»ºè¯¾ç¨‹çš„id
	 */
	private  BigInteger insertCourseByUserId(BigInteger userId,CourseBO course) {
		
		BigInteger courseId = null;
		return  courseId;
	};	
	
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰courseIdè·å–è¯¾ç¨‹<br> 
	 * @author zhouzhongjun
	 * @param BigInteger courseId è¯¾ç¨‹Id
	 * @return CourseBO
	 */
	private  CourseBO getCourseByCourseId(BigInteger courseId) {
		
		CourseBO course=new CourseBO();
		return course;
		
	};	
	
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰userIdåˆ›å»ºè¯¾ç¨‹<br> 
	 * @author zhouzhongjun
     * @param BigInteger courseId è¯¾ç¨‹Id
	 * @param CourseBO course è¯¾ç¨‹ä¿¡æ¯
	 * @return æ˜¯å¦æˆåŠŸä¿®æ”¹è¯¾ç¨‹
	 */
	private boolean updateCourseByCourseId(BigInteger courseId,CourseBO course) {
		
		return true;
		
	};	
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰courseIdåˆ é™¤è¯¾ç¨‹<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId è¯¾ç¨‹Id
	 *@see SeminarService #deleteSemiarByCourseId(BigInteger courseId)
	 *@see ClassService   #deleteClassByCourseId(BigInteger courseId)
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
		
		
		//åˆ é™¤è‡ªå·±
		return true;
	};
=======
	
	/**
	 * °´¿Î³ÌÃû»ñÈ¡¿Î³Ì
	 * <p>¸ù¾İ¿Î³ÌÃû³Æ»ñÈ¡¿Î³Ì<br>
	 * @author yexiaona
	 * @param courseName ¿Î³ÌÃû³Æ
	 * @return List<CourseBO> ¿Î³ÌÁĞ±í
	 */
	private List<CourseBO> listCourseByCourseName(String courseName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}
	
	/**
	 * °´½ÌÊ¦Ãû³Æ»ñÈ¡¿Î³Ì
	 * <p>¸ù¾İ½ÌÊ¦Ãû³Æ»ñÈ¡½ÌÊ¦ID£¬¸ù¾İ½ÌÊ¦ID»ñÈ¡¿Î³ÌID<br>
	 * @author yexiaona
	 * @param teacherName ½ÌÊ¦Ãû³Æ
	 * @return List<CourseBO> ¿Î³ÌÁĞ±í
	 * @see xmu.crms.service.CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<CourseBO> listCourseByTeacherName(String teacherName)
	{
		List<CourseBO> list=new ArrayList<CourseBO>();
		return list;
	}

>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf
}
