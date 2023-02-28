package com.onlineEdu.content.service;


import com.onlineEdu.content.model.dto.CoursePreviewDto;

/**
 * @author Astronaut
 * @version 1.0
 * @description 
 * @date 2022/10/17 10:56
 */
public interface CoursePublishService {

    /**
     * @param courseId 课程id
     * @return com.onlineEdu.content.model.dto.CoursePreviewDto
     * @description 获取课程预览信息
     * @author Astronaut
     * @date 2022/9/16 15:36
     */
    public CoursePreviewDto getCoursePreviewInfo(Long courseId);

    /**
     * @param courseId 课程id
     * @return void
     * @description 提交审核
     * @author Astronaut
     * @date 2022/9/18 10:31
     */
    public void commitAudit(Long companyId, Long courseId);

    /**
     * @param companyId 机构id
     * @param courseId  课程id
     * @return void
     * @description 课程发布接口
     * @author Astronaut
     * @date 2022/9/20 16:23
     */
    public void publish(Long companyId, Long courseId);
}
