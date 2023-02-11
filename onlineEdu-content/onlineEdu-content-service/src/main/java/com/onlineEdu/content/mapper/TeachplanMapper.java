package com.onlineEdu.content.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.onlineEdu.content.model.dto.TeachplanDto;
import com.onlineEdu.content.model.po.Teachplan;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * <p>
 * 课程计划 Mapper 接口
 * </p>
 *
 * @author Astronaut
 */
@Mapper
public interface TeachplanMapper extends BaseMapper<Teachplan> {

    List<TeachplanDto> selectTreeNodes(Long courseId);
}
