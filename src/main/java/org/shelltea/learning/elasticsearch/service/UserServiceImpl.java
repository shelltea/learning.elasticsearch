package org.shelltea.learning.elasticsearch.service;

import org.shelltea.learning.elasticsearch.domain.User;
import org.shelltea.learning.elasticsearch.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

/**
 * @author Xiong Shuhong(shelltea@gmail.com)
 *         Created on 2015/10/26.
 */
@Component
@Transactional
public class UserServiceImpl implements UserService {
    @Autowired
    private UserRepository userRepository;

    @Override
    public Page<User> findAll(Pageable pageable) {
        return userRepository.findAll(pageable);
    }
}
