package com.elnur.blog.repos;

import org.springframework.data.repository.CrudRepository;

import com.elnur.blog.models.Post;

public interface PostRepository extends CrudRepository<Post, Long> {
	
	

}
