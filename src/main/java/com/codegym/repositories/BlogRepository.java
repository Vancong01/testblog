package com.codegym.repositories;

import com.codegym.models.Blog;

import java.util.List;

public interface BlogRepository {
    List<Blog> findAll();
    Blog findById(Long id);
    void save(Blog blog);
    void remove(Long id);
}
