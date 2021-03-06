package org.shelltea.learning.elasticsearch.service;

import org.shelltea.learning.elasticsearch.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

/**
 * @author Xiong Shuhong(shelltea@gmail.com)
 *         Created on 2015/10/26.
 */
public interface UserService {
    Page<User> findAll(Pageable pageable);
}
