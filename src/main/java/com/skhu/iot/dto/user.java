package com.skhu.iot.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ds on 2017-11-14.
 */
@Data
public class user {
    private int id;
    private String name;
    private String photo;
    private MultipartFile photoFile;
}
