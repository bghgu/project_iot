package com.skhu.iot.dto;

import lombok.Data;
import org.springframework.web.multipart.MultipartFile;

/**
 * Created by ds on 2017-11-14.
 */
@Data
public class photo {
    private int id;
    private String phtot;
    private MultipartFile photoFile;
}
