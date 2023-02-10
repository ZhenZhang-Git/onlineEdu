package com.onlineEdu.content.model.dto;

import com.onlineEdu.content.model.po.CourseCategory;
import lombok.Data;

import java.util.List;

/**
 * @author Astronaut
 * @version 1.0
 * @description
 * @date 2022/12/10 10:08
 */
@Data
public class CourseCategoryTreeDto extends CourseCategory {
    List childrenTreeNodes;
}
