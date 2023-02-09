package com.onlineEdu.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.onlineEdu.content.model.dto.CourseCategoryTreeDto;
import com.onlineEdu.content.model.po.CourseCategory;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程分类 Mapper 接口
 * </p>
 *
 * @author Astronaut
 */
@Mapper
public interface CourseCategoryMapper extends BaseMapper<CourseCategory> {

    List<CourseCategoryTreeDto> selectTreeNodes(String id);
}
