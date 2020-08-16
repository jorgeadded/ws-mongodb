package com.jorge.wsmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.jorge.wsmongo.domain.Post;
import com.jorge.wsmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{

}
