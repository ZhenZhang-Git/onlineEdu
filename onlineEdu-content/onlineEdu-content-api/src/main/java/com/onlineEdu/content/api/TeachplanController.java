package com.onlineEdu.content.api;


import com.onlineEdu.content.model.dto.BindTeachplanMediaDto;
import com.onlineEdu.content.model.dto.SaveTeachplanDto;
import com.onlineEdu.content.model.dto.TeachplanDto;
import com.onlineEdu.content.service.TeachplanService;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @author Astronaut
 * @version 1.0
 * @description
 * @date 2022/10/10 11:55
 */

@RestController
public class TeachplanController {

    @Autowired
    TeachplanService teachplanService;

    @GetMapping("/teachplan/{courseId}/tree-nodes")
    public List<TeachplanDto> getTreeNodes(@PathVariable Long courseId) {
        return teachplanService.findTeachplanTree(courseId);
    }

    @PostMapping("/teachplan")
    public void saveTeachplan(@RequestBody SaveTeachplanDto dto) {
        teachplanService.saveTeachplan(dto);
    }

    @DeleteMapping("/teachplan/{teachPlanId}")
    public void deleteTeachplan(@PathVariable Long teachPlanId) {
        teachplanService.deleteTeachplan(teachPlanId);
    }

    @PostMapping("/teachplan/moveup/{teachplanId}")
    public void moveUp(@PathVariable Long teachplanId) {
        teachplanService.moveUp(teachplanId);
    }

    @PostMapping("/teachplan/movedown/{teachplanId}")
    public void moveDown(@PathVariable Long teachplanId) {
        teachplanService.moveDown(teachplanId);
    }

    @ApiOperation(value = "课程计划和媒资信息绑定")
    @PostMapping("/teachplan/association/media")
    public void associationMedia(@RequestBody BindTeachplanMediaDto bindTeachplanMediaDto) {
        teachplanService.associationMedia(bindTeachplanMediaDto);
    }
}
