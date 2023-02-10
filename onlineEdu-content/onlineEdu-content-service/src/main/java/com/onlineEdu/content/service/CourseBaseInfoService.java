package com.onlineEdu.content.service;


import com.onlineEdu.base.model.PageParams;
import com.onlineEdu.base.model.PageResult;
import com.onlineEdu.content.model.dto.AddCourseDto;
import com.onlineEdu.content.model.dto.CourseBaseInfoDto;
import com.onlineEdu.content.model.dto.QueryCourseParamsDto;
import com.onlineEdu.content.model.po.CourseBase;

/**
 * @author Mr.M
 * @version 1.0
 * @description 课程管理service
 * @date 2022/10/8 9:44
 */
public interface CourseBaseInfoService {


    /**
     * @param params               分页参数
     * @param queryCourseParamsDto 查询条件
     * @return com.onlineEdu.base.model.PageResult<com.onlineEdu.content.model.po.CourseBase>
     * @description 课程查询
     * @author Mr.M
     * @date 2022/10/8 9:46
     */
    public PageResult<CourseBase> queryCourseBaseList(PageParams params, QueryCourseParamsDto queryCourseParamsDto);

    /**
     * 新增课程
     *
     * @param companyId    培训机构id
     * @param addCourseDto 新增课程的信息
     * @return 课程信息包括基本信息、营销信息
     */
    public CourseBaseInfoDto createCourseBase(Long companyId, AddCourseDto addCourseDto);
}
