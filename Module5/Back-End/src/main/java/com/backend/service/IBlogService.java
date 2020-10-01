package com.backend.service;

import com.backend.model.Post;

import java.util.Optional;

public interface IBlogService {
    Iterable<Post> findAll();

    Optional findById(Long id);

    void save(Post post);

    void remove(Long id);
}
