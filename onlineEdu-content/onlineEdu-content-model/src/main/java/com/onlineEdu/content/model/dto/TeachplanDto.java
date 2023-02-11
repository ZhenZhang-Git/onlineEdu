package com.onlineEdu.content.model.dto;


import com.onlineEdu.content.model.po.Teachplan;
import com.onlineEdu.content.model.po.TeachplanMedia;
import lombok.Data;

import java.util.List;

/**
 * @author Astronaut
 * @version 1.0
 * @description OnlineEduExpection
 * @date 2022/10/10 11:52
 */
@Data
public class TeachplanDto extends Teachplan {

    //课程计划关联的媒资信息
    TeachplanMedia teachplanMedia;

    //子目录
    List<TeachplanDto> teachPlanTreeNodes;
}
