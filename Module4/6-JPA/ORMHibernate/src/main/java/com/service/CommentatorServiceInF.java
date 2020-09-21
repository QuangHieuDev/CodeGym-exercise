package com.service;

import com.model.Commentator;

import java.util.List;

public interface CommentatorInF {
    List<Commentator> findAll();

    Commentator findById(int id);

    void save(Commentator commentator);

    void remove(int id);
}
