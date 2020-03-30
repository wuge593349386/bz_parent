package com.bjsxt.backend.service;

import com.bjsxt.utils.Result;
import org.springframework.web.multipart.MultipartFile;

/**
 * 文件上传服务
 * @author wuge
 * @date 2020/3/30
 */
public interface FileUploadService {

    /**
     * 文件上传
     * @param file
     * @return
     */
    Result fileUpload(MultipartFile file);
}
