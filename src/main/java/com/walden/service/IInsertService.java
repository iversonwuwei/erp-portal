package com.walden.service;

import org.springframework.stereotype.Service;

/**
 * Created by walden on 16/6/13.
 */
public interface IInsertService<T> {

    void insert(T t);
}
