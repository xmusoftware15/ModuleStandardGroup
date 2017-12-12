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
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰courseIdè·å–è¯¾ç¨‹<br> 
	 * @author zhouzhongjun
	 * @param BigInteger userId ç”¨æˆ·Id
	 * @return List<ClassBO> ç­çº§åˆ—è¡¨
	 */
	private  List<ClassBO> listClassByuserId(BigInteger userId) {
		
		List<ClassBO> classBO=new ArrayList<ClassBO>();
		return classBO;
		
	};	
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰courseIdè·å–Class<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId è¯¾ç¨‹Id
	 */
	List<ClassBO> listClassByCourseId(BigInteger courseId) {
			
		return null;
	};
	
	/**
	 * æ–¹æ³•ç®€è¿°.
	 * <p>æŒ‰courseIdåˆ é™¤Class<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId è¯¾ç¨‹Id
	 *@see ClassService  #listClassByCourseId(BigInteger courseId)
	 *@see ClasssSelectionService   #deleteClasssSelectionByClassId(BigInteger classId)
	 *@see ScoreRuleService  #deleteScoreRuleById(BigInteger CourseId,BigInteger ClassId)
	 *@see FixGroupService  #deleteFixGroupByClassId(BigInteger ClassId)
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
			
		//åˆ é™¤è‡ªå·±
		return true;
	};
=======
	 * °´¿Î³ÌÃû³ÆºÍ½ÌÊ¦Ãû³Æ»ñÈ¡°à¼¶ÁĞ±í
	 * <p>¸ù¾İ¿Î³ÌÃûºÍ½ÌÊ¦Ãû»ñÈ¡¿Î³ÌID£¬Í¨¹ı¿Î³ÌID»ñÈ¡°à¼¶ÁĞ±í;Èô¿Î³ÌÃûºÍ°à¼¶Ãû¾ù²»Îª¿Õ£¬È¡½»¼¯<br>
	 * @author yexiaona
	 * @param courseName ¿Î³ÌÃû³Æ
	 * @param teacherName ½ÌÊ¦Ãû³Æ
	 * @return List<ClassBO> °à¼¶ÁĞ±í
	 * @see xmu.crms.service.ClassService#listClassByCourseName(String courseName)
	 * @see xmu.crms.service.ClassService#listClassByTeacherName(String teacherName)
	 */
	private List<ClassBO> listClassByName(String courseName,String teacherName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * °´¿Î³ÌÃû³Æ»ñÈ¡°à¼¶ÁĞ±í
	 * <p>¸ù¾İ¿Î³ÌÃû»ñÈ¡¿Î³ÌID£¬Í¨¹ı¿Î³ÌID»ñÈ¡°à¼¶ÁĞ±í<br>
	 * @author yexiaona
	 * @param courseName ¿Î³ÌÃû³Æ
	 * @return List<ClassBO> °à¼¶ÁĞ±í
	 * @see xmu.crms.service.CourseService#listCourseByCourseName(String courseName)
	 * @see xmu.crms.service.ClassService#listClassByCourseId(BigInteger courseId)
	 */
	private List<ClassBO> listClassByCourseName(String courseName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * °´½ÌÊ¦Ãû³Æ»ñÈ¡°à¼¶ÁĞ±í
	 * <p>¸ù¾İ½ÌÊ¦Ãû³Æ»ñÈ¡¿Î³ÌID£¬Í¨¹ı¿Î³ÌID»ñÈ¡°à¼¶ÁĞ±í<br>
	 * @author yexiaona
	 * @param teacherName ½ÌÊ¦Ãû³Æ
	 * @return List<ClassBO> °à¼¶ÁĞ±í
	 * @see xmu.crms.service.CourseService#listCourseByTeacherName(String teacherName)
	 * @see xmu.crms.service.ClassService#listClassByCourseId(BigInteger courseId)
	 */
	private List<ClassBO> listClassByTeacherName(String teacherName)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ¸ù¾İ½ÌÊ¦ID»ñÈ¡°à¼¶ÁĞ±í
	 * @author yexiaona
	 * @param userId ½ÌÊ¦ID
	 * @return List<ClassBO> °à¼¶ÁĞ±í
	 * @see xmu.crms.service.CourseService#listCourseByUserId(BigInteger userId)
	 */
	private List<ClassBO> listClassByUserId(BigInteger userId)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * ¸ù¾İ¿Î³ÌID»ñµÃ°à¼¶ÁĞ±í
	 * @author yexiaona
	 * @param courseId ¿Î³ÌID
	 * @return List<ClassBO> °à¼¶ÁĞ±í
	 */
	private List<ClassBO> listClassByCourseId(BigInteger courseId)
	{
		List<ClassBO> list=new ArrayList<ClassBO>();
		return list;
	}
	
	/**
	 * °´°à¼¶id»ñÈ¡°à¼¶ÏêÇé
	 * <p>¸ù¾İ°à¼¶id»ñÈ¡°à¼¶<br>
	 * @author yexiaona
	 * @param classId °à¼¶ID
	 * @return ClassBO °à¼¶
	 */
	private ClassBO getClassByClassId(BigInteger classId)
	{
		ClassBO classBo=new ClassBO();
		return classBo;
	}
	
	/**
	 * °´°à¼¶idºÍ°à¼¶ĞŞ¸Ä°à¼¶ĞÅÏ¢
	 * <p>¸ù¾İ°à¼¶idĞŞ¸Ä°à¼¶ĞÅÏ¢<br>
	 * @author yexiaona
	 * @param classId °à¼¶ID
	 * @return boolean °à¼¶ĞŞ¸ÄÊÇ·ñ³É¹¦Çé¿ö
	 * @see xmu.crms.service.?????????????#updateScoreRuleById(BigInteger scoreRuleId)
	 */
	private boolean updateClassByClassId(BigInteger classId)
	{
		boolean isUpdated;
		return isUpdated;
	}
	
	/**
	 * °´°à¼¶idÉ¾³ı°à¼¶
	 * <p>¸ù¾İ°à¼¶idÉ¾³ı°à¼¶<br>
	 * @author yexiaona
	 * @param classId °à¼¶ID
	 * @return boolean °à¼¶É¾³ıÊÇ·ñ³É¹¦Çé¿ö
	 * @see xmu.crms.service.?????????????#deleteScoreRuleById(BigInteger scoreRuleId)
	 * @see xmu.crms.service.ClassService#deleteCourseSelectionById(BigInteger classId,User user)
	 */
	private boolean deleteClassByClassId(BigInteger classId)
	{
		boolean isDeleted;
		return isDeleted;
	}
	
	/**
	 * Ñ§Éú°´°à¼¶idÑ¡Ôñ°à¼¶
	 * <p>¸ù¾İ°à¼¶idºÍÓÃ»§idĞÂÔöÑ¡¿Î¼ÇÂ¼<br>
	 * @author yexiaona
	 * @param userId ÓÃ»§id
	 * @param classId °à¼¶id
	 * @return url Ñ¡¿Îurl
	 */
	private String insertCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		String url=new String();
		return url;
	}
	
	/**
	 * Ñ§Éú°´°à¼¶idÈ¡ÏûÑ¡Ôñ°à¼¶
	 * <p>¸ù¾İ°à¼¶idºÍÓÃ»§idÉ¾³ıÑ¡¿Î¼ÇÂ¼¼°Óë¸Ã°à¼¶Ïà¹ØµÄĞÅÏ¢<br>
	 * @author yexiaona
	 * @param userId ÓÃ»§id
	 * @param classId °à¼¶id
	 * @return boolean È¡Ïû°à¼¶ÊÇ·ñ³É¹¦
	 */
	private boolean deleteCourseSelectionById(BigInteger userId,BigInteger classId)
	{
		boolean isDeleted;
		return isDeleted;
	}
	
	/**
	 * ÀÏÊ¦»ñÈ¡¸Ã°à¼¶Ç©µ½¡¢·Ö×é×´Ì¬
	 * <p>¸ù¾İÌÖÂÛ¿Îid¼°°à¼¶id£¬»ñµÃ¸Ã°à¼¶µÄÇ©µ½¡¢·Ö×é×´Ì¬<br>
	 * @author yexiaona
	 * @param seminarId ÌÖÂÛ¿Îid
	 * @param classid °à¼¶id
	 * @return classBO °à¼¶
	 * @see xmu.crms.service.GroupService#listGroupBySeminarId(BigInteger seminarId)
	 */
	private ClassBO getCallGroupStatusById(BigInteger seminarId,BigInteger classId)
	{
		ClassBO classBO=new ClassBO();
		return classBO;
	}
	
	/**
	 * ĞÂ½¨°à¼¶
	 * <p>¸ù¾İ½ÌÊ¦idºÍ¿Î³ÌidĞÂ½¨°à¼¶<br>
	 * @author yexiaona
	 * @param userId ½ÌÊ¦id
	 * @param courseId ¿Î³Ìid
	 * @param List<userId> Ñ§ÉúÁĞ±í
	 * @return ClassBO °à¼¶
	 * @see xmu.crms.service.ClassService#insertCourseSelectionById(BigInteger userId,BigInteger classId)
	 */
	private ClassBO insertClassById(BigInteger userId,BigInteger courseId)
	{
		ClassBO classBO=new ClassBO();
		return classBO;
	}
>>>>>>> 97c1cc349b0c55a1dfa9ed03e7faf5f0a534cdbf

}
