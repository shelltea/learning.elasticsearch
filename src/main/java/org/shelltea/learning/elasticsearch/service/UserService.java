package org.shelltea.learning.elasticsearch.service;

import org.shelltea.learning.elasticsearch.domain.User;
import org.springframework.data.domain.Page;

import java.util.List;

/**
 * @author Xiong Shuhong(xiongsh@youyuan.com)
 *         Created on 2015/10/26.
 */
public interface UserService {
    Page<User> findAll();
}
