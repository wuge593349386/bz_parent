package com.bjsxt.backend.controller;

import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

/**
 * 图片上传控制器
 * @author wuge
 * @date 2020/3/30
 */
@RestController
@RequestMapping("/file")
public class FileUploadController {

    /**
     * 注入FileUploadService
     */
    @Autowired
    private FileUploadService fileUploadService;

    /**
     * 文件上传
     * @param file
     * @return
     */
    @PostMapping("/upload")
    public Result fileUpload(MultipartFile file) {
        try{
            return this.fileUploadService.fileUpload(file);
        }catch (Exception e){
            e.printStackTrace();
        }
        return Result.build(500,"error");
    }
}
