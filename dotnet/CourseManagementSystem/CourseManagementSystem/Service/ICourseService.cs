﻿using System;
using System.Collections.Generic;
using System.Linq;
using System.Threading.Tasks;
using System.Numerics;
using Xmu.Crms.Shared.Models;

namespace Xmu.Crms.Shared.Service
{

    /**
 * 
 * @author YeXiaona ZhouZhongjun CaoXingmei
 * @version 2.00
 *
 */
    public interface CourseService
    {

        /**
       * 按userId获取与当前用户相关联的课程列表.
       * <p>老师与他相关联的课程列表<br> 
       * @author ZhouZhongjun
       * @param userId 用户Id
       * @return null 课程列表
       * @exception IllegalArgumentException userId格式错误时抛出
       * @exception CourseNotFoundException 未找到课程
       */
        List<Course> ListCourseByUserId(long userId);


        /**
	 * 按userId创建课程.
	 * <p>按userId创建课程<br>
	 * @author ZhouZhongjun
	 * @param userId 用户Id
	 * @param course 课程信息
	 * @return courseId 新建课程的id
	 * @exception IllegalArgumentException userId格式错误时抛出
	 */
        long InsertCourseByUserId(long userId, Course course);


        /**
	 * 按courseId获取课程 .
	 * <p>按courseId获取课程 <br>
	 * @author ZhouZhongjun
	 * @param courseId 课程Id
	 * @return course
	 * @exception IllegalArgumentException courseId格式错误时抛出
	 * @exception CourseNotFoundException 未找到课程
	 */
        Course GetCourseByCourseId(long courseId);


        /**
	 * 传入courseId和course信息修改course信息.
	 * <p>传入courseId和course信息修改course信息 <br>
	 * @author ZhouZhongjun
	 * @param courseId 课程Id
	 * @param course 课程信息
	 */
        void UpdateCourseByCourseId(long courseId, Course course);


        /**
	 * 按courseId删除课程.
	 * <p>先根据courseID删除Seminar 和 class,然后再将course的信息删除<br>
	 * @author ZhouZhongjun
	 * @param courseId 课程Id
	 * @see SeminarService #deleteSemiarByCourseId(BigInteger courseId)
	 * @see ClassService   #deleteClassByCourseId(BigInteger courseId)
	 * @exception IllegalArgumentException courseId格式错误时抛出
	 * @exception CourseNotFoundException 未找到课程
	 */
        void DeleteCourseByCourseId(long courseId);



        /**
      * 根据课程名称获取课程列表.
      * <p>根据课程名称获取课程列表<br>
      * @author YeXiaona
      * @param courseName 课程名称
      * @return list 课程列表
      * @see CourseService #getCourseByCourseId(BigInteger courseId)
      */
        List<Course> ListCourseByCourseName(String courseName);


        /**
	 * 按课程名称获取班级列表.
	 * <p>根据课程名获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param courseName 课程名称
	 * @return list 班级列表
	 * @see CourseService #listCourseByCourseName(String courseName)
	 * @see ClassService #listClassByCourseId(BigInteger courseId)
	 */
        List<ClassInfo> ListClassByCourseName(String courseName);


        /**
	 * 按教师名称获取班级列表.
	 * <p>根据教师名称获取课程ID，通过课程ID获取班级列表<br>
	 * @author YeXiaona
	 * @param teacherName 教师名称
	 * @return list 班级列表
	 * @see UserService #listUserIdByUserName(String userName)
	 * @see CourseService #listClassByUserId(BigInteger userId)
	 */
        List<ClassInfo> ListClassByTeacherName(String teacherName);


        /**
      * 根据教师ID获取班级列表.
      * <p>根据教师ID获取班级列表<br>
      * @author YeXiaona
      * @param userId 教师ID
      * @return list 班级列表
      * @see CourseService #listCourseByUserId(BigInteger userId)
      * @see ClassService #listClassByCourseId(BigInteger courseId)
      * @exception IllegalArgumentException userId格式错误时抛出或courseId格式错误时抛出
      * @exception CourseNotFoundException 未找到课程
      * @exception ClassNotFoundException 未找到班级
      */
        List<ClassInfo> ListClassByUserId(long userId);

    }
}
