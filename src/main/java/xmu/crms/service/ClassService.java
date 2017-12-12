package xmu.crms.service;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

import xmu.crms.bo.*;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class ClassService {
	
	/**
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
	 */
	List<ClassBO> listClassByCourseId(BigInteger courseId) {
			
		return null;
	};
	
	/**
	 * 方法简述.
	 * <p>按courseId删除Class<br>  
	 * @author zhouzhongjun
     * @param BigInteger courseId 课程Id
	 *@see ClassService  #listClassByCourseId(BigInteger courseId)
	 *@see ClasssSelectionService   #deleteClasssSelectionByClassId(BigInteger classId)
	 *@see ScoreRuleService  #deleteScoreRuleById(BigInteger CourseId,BigInteger ClassId)
	 *@see FixGroupService  #deleteFixGroupByClassId(BigInteger ClassId)
	 */
	boolean deleteCourseByCourseId(BigInteger courseId) {
			
		//删除自己
		return true;
	};

}
