package xmu.crms.service;
/**
 * 
 * @author ModuleStandardGroup
 * @version 1.00
 *
 */
public class ClassService {
	
	/**
	 * ���γ����ƺͽ�ʦ���ƻ�ȡ�༶�б�
	 * <p>���ݿγ����ͽ�ʦ����ȡ�γ�ID��ͨ���γ�ID��ȡ�༶�б�;���γ����Ͱ༶������Ϊ�գ�ȡ����<br>
	 * @author yexiaona
	 * @param courseName �γ�����
	 * @param teacherName ��ʦ����
	 * @return List<ClassBO> �༶�б�
	 * @see ClassService#listClassByCourseName(String courseName)
	 * @see ClassService#listClassByTeacherName(String teacherName)
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
	 * @see CourseService#listCourseByCourseName(String courseName)
	 * @see ClassService#listClassByCourseId(BigInteger courseId)
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
	 * @see CourseService#listCourseByTeacherName(String teacherName)
	 * @see ClassService#listClassByCourseId(BigInteger courseId)
	 */
	private List<ClassBO> listClassByTeacherName(String teacherName)
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
	 * @see ?????????????#updateScoreRuleById(BigInteger scoreRuleId)
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
	 * @see ?????????????#deleteScoreRuleById(BigInteger scoreRuleId)
	 * @see ClassService#deleteClassSelectionById(BigInteger classId,User user)
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
	private String insertClassSelectionById(BigInteger userId,BigInteger classId)
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
	private boolean deleteClassSelectionById(BigInteger userId,BigInteger classId)
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
	 * @see GroupService#listGroupBySeminarId(BigInteger seminarId)
	 */
	private ClassBO getCallGroupStatusById(BigInteger seminarId,BigInteger classId)
	{
		ClassBO classBO=new ClassBO();
		return classBO;
	}

}
