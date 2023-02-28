package com.onlineEdu.onlineEdu_content.service.impl;

import com.onlineEdu.onlineEdu_content.model.po.MqMessageHistory;
import com.onlineEdu.onlineEdu_content.mapper.MqMessageHistoryMapper;
import com.onlineEdu.onlineEdu_content.service.MqMessageHistoryService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author Astronaut
 */
@Slf4j
@Service
public class MqMessageHistoryServiceImpl extends ServiceImpl<MqMessageHistoryMapper, MqMessageHistory> implements MqMessageHistoryService {

}
