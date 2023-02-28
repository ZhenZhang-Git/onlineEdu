package com.onlineEdu.media.service;


import com.onlineEdu.base.model.PageParams;
import com.onlineEdu.base.model.PageResult;
import com.onlineEdu.base.model.RestResponse;
import com.onlineEdu.media.model.dto.QueryMediaParamsDto;
import com.onlineEdu.media.model.dto.UploadFileParamsDto;
import com.onlineEdu.media.model.dto.UploadFileResultDto;
import com.onlineEdu.media.model.po.MediaFiles;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;

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

    /**
     * @param companyId
     * @param fileId
     * @param uploadFileParamsDto
     * @param bucket
     * @param objectName
     * @return com.onlineEdu.media.model.po.MediaFiles
     * @description 将文件信息入库
     * @author Astronaut
     * @date 2022/10/14 9:14
     */
    @Transactional
    public MediaFiles addMediaFilesToDb(Long companyId, String fileId, UploadFileParamsDto uploadFileParamsDto, String bucket, String objectName);

    /**
     * @param fileMd5 文件的md5
     * @return com.onlineEdu.base.model.RestResponse<java.lang.Boolean> false不存在，true存在
     * @description 检查文件是否存在
     * @author Astronaut
     * @date 2022/9/13 15:38
     */
    public RestResponse<Boolean> checkFile(String fileMd5);

    /**
     * @param fileMd5    文件的md5
     * @param chunkIndex 分块序号
     * @return com.onlineEdu.base.model.RestResponse<java.lang.Boolean> false不存在，true存在
     * @description 检查分块是否存在
     * @author Astronaut
     * @date 2022/9/13 15:39
     */
    public RestResponse<Boolean> checkChunk(String fileMd5, int chunkIndex);

    /**
     * @param fileMd5 文件md5
     * @param chunk   分块序号
     * @param bytes   文件字节
     * @return com.onlineEdu.base.model.RestResponse
     * @description 上传分块
     * @author Astronaut
     * @date 2022/9/13 15:50
     */
    public RestResponse uploadChunk(String fileMd5, int chunk, byte[] bytes);


    /**
     * @param companyId           机构id
     * @param fileMd5             文件md5
     * @param chunkTotal          分块总和
     * @param uploadFileParamsDto 文件信息
     * @return com.onlineEdu.base.model.RestResponse
     * @description 合并分块
     * @author Astronaut
     * @date 2022/9/13 15:56
     */
    public RestResponse mergechunks(Long companyId, String fileMd5, int chunkTotal, UploadFileParamsDto uploadFileParamsDto);

    /**
     * @param id 文件id
     * @return com.onlineEdu.media.model.po.MediaFiles 文件信息
     * @description 根据id查询文件信息
     * @author Astronaut
     * @date 2022/9/13 17:47
     */
    public MediaFiles getFileById(String id);

    //根据桶和文件路径从minio下载文件
    public File downloadFileFromMinIO(File file, String bucket, String objectName);

    public void addMediaFilesToMinIO(String filePath, String bucket, String objectName);
}


