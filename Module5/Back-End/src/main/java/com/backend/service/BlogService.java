package com.backend.service;

import com.backend.model.Post;
import com.backend.repository.BlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
public class BlogService implements IBlogService{
    @Autowired
    private BlogRepository blogRepository;

    @Override
    public Iterable<Post> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Optional findById(Long id) {
        return blogRepository.findById(id);
    }

    @Override
    public void save(Post post) {
        blogRepository.save(post);
    }

    @Override
    public void remove(Long id) {
        blogRepository.deleteById(id);
    }
}
