package com.onlineEdu.media.service;

import com.onlineEdu.base.model.PageParams;
import com.onlineEdu.base.model.PageResult;
import com.onlineEdu.media.model.dto.QueryMediaParamsDto;
import com.onlineEdu.media.model.dto.UploadFileParamsDto;
import com.onlineEdu.media.model.dto.UploadFileResultDto;
import com.onlineEdu.media.model.po.MediaFiles;

/**
 * @author Astronaut
 * @version 1.0
 * @description 媒资文件管理业务类
 * @date 2022/9/10 8:55
 */
public interface MediaFileService {

    /**
     * @param pageParams          分页参数
     * @param queryMediaParamsDto 查询条件
     * @return com.onlineEdu.base.model.PageResult<com.onlineEdu.media.model.po.MediaFiles>
     * @description 媒资文件查询方法
     * @author Astronaut
     * @date 2022/9/10 8:57
     */
    public PageResult<MediaFiles> queryMediaFiels(Long companyId, PageParams pageParams, QueryMediaParamsDto queryMediaParamsDto);


    /**
     * @param companyId           机构id
     * @param uploadFileParamsDto 文件信息
     * @param bytes               文件字节数组
     * @param folder              桶下边的子目录
     * @param objectName          对象名称
     * @return com.onlineEdu.media.model.dto.UploadFileResultDto
     * @description 上传文件的通用接口
     * @author Astronaut
     * @date 2022/10/13 15:51
     */
    public UploadFileResultDto uploadFile(Long companyId, UploadFileParamsDto uploadFileParamsDto, byte[] bytes, String folder, String objectName);

}
