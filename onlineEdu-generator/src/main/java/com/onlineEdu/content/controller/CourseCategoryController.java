package com.onlineEdu.content.controller;

import com.onlineEdu.content.service.CourseCategoryService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 课程分类 前端控制器
 * </p>
 *
 * @author Astronaut
 */
@Slf4j
@RestController
@RequestMapping("courseCategory")
public class CourseCategoryController {

    @Autowired
    private CourseCategoryService courseCategoryService;
}
