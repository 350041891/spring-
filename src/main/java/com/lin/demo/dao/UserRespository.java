package com.lin.demo.dao;

import com.lin.demo.domain.User;
import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;
import org.springframework.stereotype.Repository;

/**
 * @author lhy
 * @date 2018/11/16 12:37
 */
@Repository
public interface UserRespository extends ElasticsearchRepository<User,Long> {

}
