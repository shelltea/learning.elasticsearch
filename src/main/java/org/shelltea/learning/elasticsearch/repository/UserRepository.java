package org.shelltea.learning.elasticsearch.repository;

import org.shelltea.learning.elasticsearch.domain.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.Repository;

/**
 * @author Xiong Shuhong(xiongsh@youyuan.com)
 *         Created on 2015/10/26.
 */
public interface UserRepository extends Repository<User, Long> {
    Page<User> findAll(Pageable pageable);
}
