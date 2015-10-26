package org.shelltea.learning.elasticsearch.service;

import org.shelltea.learning.elasticsearch.domain.User;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author Xiong Shuhong(xiongsh@youyuan.com)
 *         Created on 2015/10/26.
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Override
    public List<User> findAll() {
        return null;
    }
}
