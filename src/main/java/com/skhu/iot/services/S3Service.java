/*
package com.skhu.iot.services;

import com.amazonaws.AmazonClientException;
import com.amazonaws.services.s3.AmazonS3;
import com.amazonaws.services.s3.model.PutObjectRequest;
import com.amazonaws.services.s3.transfer.TransferManager;
import com.amazonaws.services.s3.transfer.Upload;
import com.amazonaws.util.IOUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.net.URLEncoder;

*/
/**
 * Created by ds on 2017-11-13.
 *//*

@Service
public class S3Service {

    @Autowired
    private AmazonS3 amazonS3;

    @Autowired
    private ResourceLoader resourceLoader;

    @Value("${cloud.aws.s3.bucket}")
    private String bucket;

    //S3에 파일을 업로드한다.
    public void uploadOnS3(String fileName, File file) {

        TransferManager transferManager = new TransferManager(this.amazonS3);
        PutObjectRequest request = new PutObjectRequest(bucket, fileName, file);
        Upload upload = transferManager.upload(request);

        try {
            upload.waitForCompletion();
        } catch (AmazonClientException amazonClientException) {
            amazonClientException.printStackTrace();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    // S3에서 파일이 들어있는 InputStream 가져옴
    public InputStream getStreamOnS3(String fileName) {
        try {
            InputStream inputStream = null;
            Resource resource
                    = this.resourceLoader.
                    getResource("s3://project-sm/"+fileName);
            if(!resource.exists()) {
                // 파일을 찾지 못했음.
            }
            return resource.getInputStream();
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    // InputStream에서 파일을 byte형태로 가져옴 (다운로드)
    public ResponseEntity<byte[]> downloadFile (String fileName) {
        InputStream inputStream = null;
        byte[] bytes = null;
        String downloadFileName = "";
        try {
            inputStream = getStreamOnS3(fileName);
            bytes = IOUtils.toByteArray(inputStream);
            downloadFileName = URLEncoder.encode(fileName, "UTF-8").replaceAll("\\+", "%20");
            File tempFile = new File(fileName);
        } catch (IOException e) {
            e.printStackTrace();
        }
        HttpHeaders httpHeaders = new HttpHeaders();
        httpHeaders.setContentType(MediaType.IMAGE_JPEG);    //
        httpHeaders.setContentLength(bytes.length);
        httpHeaders.set("Content-Disposition", "attachment; filename="+downloadFileName);
        return new ResponseEntity<>(bytes, httpHeaders, HttpStatus.OK);
    }

    // InputStream의 파일을 HttpResponse에 넣음 (조회)
    public void inquireFile (String key, HttpServletResponse response) {
        InputStream inputStream = null;
        try {
            inputStream = getStreamOnS3(key);
            */
/* Controller에서 주입한 HttpServletResponse 활용 *//*

            IOUtils.copy(inputStream, response.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}*/
