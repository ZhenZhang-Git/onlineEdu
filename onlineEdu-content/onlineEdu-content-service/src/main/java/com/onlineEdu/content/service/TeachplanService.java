package com.onlineEdu.content.service;


import com.onlineEdu.content.model.dto.SaveTeachplanDto;
import com.onlineEdu.content.model.dto.TeachplanDto;

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

}
