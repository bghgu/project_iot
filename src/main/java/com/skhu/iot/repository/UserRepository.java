package com.skhu.iot.repository;

import com.skhu.iot.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by ds on 2017-11-02.
 */
public interface UserRepository extends JpaRepository<User, Integer> {
}
