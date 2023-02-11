package com.onlineEdu.content.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.onlineEdu.content.mapper.TeachplanMapper;
import com.onlineEdu.content.model.dto.SaveTeachplanDto;
import com.onlineEdu.content.model.dto.TeachplanDto;
import com.onlineEdu.content.model.po.Teachplan;
import com.onlineEdu.content.service.TeachplanService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @author Astronaut
 * @version 1.0
 * @description 
 * @date 2022/10/10 14:51
 */
@Slf4j
@Service
public class TeachplanServiceImpl implements TeachplanService {

    @Autowired
    TeachplanMapper teachplanMapper;

    @Override
    public List<TeachplanDto> findTeachplanTree(Long courseId) {
        return teachplanMapper.selectTreeNodes(courseId);
    }

    //新增、修改
    @Override
    public void saveTeachplan(SaveTeachplanDto dto) {
        Long id = dto.getId();

        Teachplan teachplan = teachplanMapper.selectById(id);

        if (teachplan == null) {
            teachplan = new Teachplan();
            BeanUtils.copyProperties(dto, teachplan);
            //找到同级课程计划的数量
            int count = getTeachplanCount(dto.getCourseId(), dto.getParentid());
            //新课程计划的值
            teachplan.setOrderby(count + 1);
            teachplanMapper.insert(teachplan);
        } else {
            BeanUtils.copyProperties(dto, teachplan);
            //更新
            teachplanMapper.updateById(teachplan);
        }
    }

    //计算机新课程计划的orderby 找到同级课程计划的数量 SELECT count(1) from teachplan where course_id=117 and parentid=268
    public int getTeachplanCount(Long courseId, Long parentId) {

        LambdaQueryWrapper<Teachplan> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(Teachplan::getCourseId, courseId);
        queryWrapper.eq(Teachplan::getParentid, parentId);

        return teachplanMapper.selectCount(queryWrapper);
    }
}
