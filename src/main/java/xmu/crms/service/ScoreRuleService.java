package xmu.crms.service;

import java.math.BigInteger;

/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */

public class ScoreRuleService {



		/**
		 * 方法简述.
		 * <p>按classId和CourseId删除ClassSelection<br>  
		 * @author zhouzhongjun
		 * @param BigInteger courseId 班级Id
	     * @param BigInteger classId 班级Id
	     * @return true/false 是否成功删除
		 */
		boolean deleteClassSelectionByClassId(BigInteger courseId,BigInteger classId) {
			
			//删除自己
			return true;
		};
}
