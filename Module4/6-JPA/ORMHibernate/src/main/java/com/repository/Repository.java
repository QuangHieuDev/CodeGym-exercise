package com.reponsitory;

import com.model.Commentator;

import java.util.List;

public interface Repository <T> {
    List<Commentator> findAll();

    T findById(int id);

    void save(T model);

    void remove(int id);
}