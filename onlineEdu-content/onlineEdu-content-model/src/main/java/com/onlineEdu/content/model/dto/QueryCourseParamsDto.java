package com.onlineEdu.content.model.dto;

import lombok.Data;

/**
 * @author Astronaut
 * @version 1.0
 * @description
 * @date 2022/10/7 16:08
 */
@Data
public class QueryCourseParamsDto {

    //审核状态
    private String auditStatus;
    //课程名称
    private String courseName;
    //发布状态
    private String publishStatus;
}
