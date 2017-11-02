package com.skhu.iot.controller;

import com.skhu.iot.domain.Photo;
import com.skhu.iot.domain.User;
import com.skhu.iot.repository.LogRepository;
import com.skhu.iot.repository.PhotoRepository;
import com.skhu.iot.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by ds on 2017-11-02.
 */

@RestController
@RequestMapping("/")
public class Controller {

    @Autowired
    UserRepository userRepository;
    @Autowired
    PhotoRepository photoRepository;
    @Autowired
    LogRepository logRepository;

    @GetMapping("/")
    public List<User> test() {
        return userRepository.findAll();
    }
}
