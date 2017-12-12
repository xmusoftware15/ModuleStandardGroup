package xmu.crms.service;
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class SchoolService {
	/**
	 * 按城市名称查学校
	 * ＜p＞根据城市名称，查询出在该城市的所有学校
	 * @author LiuAiqi
	 * @param city 城市名称
	 * @return List<SchoolBO> 学校列表
	 */
	List<SchoolBO> listSchoolByCity(String city)
	{
		List<SchoolBO> list = new ArrayList<SchoolBO>();		
		return List<SchoolBO>;
	}
	
	/**
	 * 添加学校
	 * ＜p＞根据学校详细的信息，添加相应学校
	 * @author LiuAiqi
	 * @param school 学校的信息
	 * @return true（添加学校成功）/false（添加学校未成功）
	 */
	boolean insertSchool(School school)
	{
		if(true)
			return true;
		else 
			return false;
	}
	
	/**
	 * 获取省份列表
	 * ＜p＞获取所有省份的名称
	 * @author LiuAiqi
	 * @return List<String> 省份名称列表
	 */
	List<String> listProvince()
	{
		List<String> list = new ArrayList<String>();		
		return List<String> list;
	}
	
	/**
	 * 获取城市列表
	 * ＜p＞根据省份名称，获取该省份所有城市名称，返回城市名称列表
	 * @author LiuAiqi
	 * @param province 省份名称
	 * @return List<String> 城市名称列表
	 */
	List<String> listCity(String province)
	{
		List<String> list = new ArrayList<String>();		
		return List<String> list;
	}
}
