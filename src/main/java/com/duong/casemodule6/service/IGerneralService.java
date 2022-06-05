package com.duong.casemodule6.service;

import java.util.Optional;

public interface IGerneralService<T> {
    Iterable<T> findAll();

    Optional<T> findById(Long id);

    T save(T t);

    void remove(Long id);
}
