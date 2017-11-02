package com.skhu.iot.repository;

import com.skhu.iot.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ds on 2017-11-02.
 */
public interface PhotoRepository extends JpaRepository<Photo, Integer>{

}
