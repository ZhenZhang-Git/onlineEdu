package com.onlineEdu.content.service;


import com.onlineEdu.content.model.dto.BindTeachplanMediaDto;
import com.onlineEdu.content.model.dto.SaveTeachplanDto;
import com.onlineEdu.content.model.dto.TeachplanDto;
import com.onlineEdu.content.model.po.TeachplanMedia;

import java.util.List;

/**
 * @author Astronaut
 * @version 1.0
 * @description
 * @date 2022/10/10 14:51
 */
public interface TeachplanService {

    public List<TeachplanDto> findTeachplanTree(Long courseId);

    /**
     * @param dto
     * @return void
     * @description 保存课程计划(新增 / 修改)
     * @author Astronaut
     * @date 2022/10/10 15:07
     */
    public void saveTeachplan(SaveTeachplanDto dto);

    void deleteTeachplan(Long teachPlanId);

    void moveUp(Long teachplanId);

    void moveDown(Long teachplanId);

    TeachplanMedia associationMedia(BindTeachplanMediaDto bindTeachplanMediaDto);
}

