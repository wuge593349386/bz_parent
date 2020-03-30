package com.bjsxt.backend.service.impl;

import com.bjsxt.backend.feign.CommonItemFeignClient;
import com.bjsxt.backend.service.FileUploadService;
import com.bjsxt.backend.service.ItemCategoryService;
import com.bjsxt.pojo.TbItemCat;
import com.bjsxt.utils.FtpUtil;
import com.bjsxt.utils.IDUtils;
import com.bjsxt.utils.Result;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.multipart.MultipartFile;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

/**
 * 服务实现类
 * @author wuge
 * @date 2020/3/30
 */
public class FileUploadServiceImpl implements FileUploadService {

    /**
     * F T P _ H O S T: 1 9 2.1 6 8.7 0.1 4 4
       F T P _ P O R T: 2 1
       F T P _ U S E R N A M E: f t p u s e r
       F T P _ P A S S W O R D: f t p u s e r
       F T P _ B A S E P A T H: / h o m e / f t p u s e r /
     */
    @Value("${FTP_HOST}")
    private String FTP_HOST;

    @Value("${FTP_PORT}")
    private int FTP_PORT;

    @Value("${FTP_USERNAME}")
    private String FTP_USERNAME;

    @Value("${FTP_PASSWORD}")
    private String FTP_PASSWORD;

    @Value("${FTP_BASEPATH}")
    private String FTP_BASEPATH;

    @Override
    public Result fileUpload(MultipartFile file) {
        try {
            // 定 义 上 传 图 片 的 目 录 结 构
            SimpleDateFormat sdf = new SimpleDateFormat("/yyyy/MM/dd/");
            String path = sdf.format(new Date());
            // 设 置 新 的 文 件 名
            String newFileName = IDUtils.genImageName() +
                    file.getOriginalFilename().substring(file.getOriginalFilename().lastIndexOf("."));
            FtpUtil.uploadFile(this.FTP_HOST, this.FTP_PORT,
                    this.FTP_USERNAME, this.FTP_PASSWORD, this.FTP_BASEPATH, path,
                    newFileName, file.getInputStream());
            String imageURL = "http://"+this.FTP_HOST+path+newFileName;
            return Result.ok(imageURL);
        }catch(Exception e){
            e.printStackTrace();
        }
        return null;
    }

}
