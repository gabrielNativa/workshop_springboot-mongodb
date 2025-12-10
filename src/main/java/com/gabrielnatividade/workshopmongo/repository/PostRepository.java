package com.gabrielnatividade.workshopmongo.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.gabrielnatividade.workshopmongo.domain.Post;
import com.gabrielnatividade.workshopmongo.domain.User;

@Repository
public interface PostRepository extends MongoRepository<Post, String>{



}
