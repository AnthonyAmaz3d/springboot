package com.spring.codeblog.service;

import com.spring.codeblog.model.Post;

import java.util.List;

public interface CodeblogService {

    List<Post> findAllPosts();
    Post findPostById(Long id);
    Post savePost(Post post);
}
