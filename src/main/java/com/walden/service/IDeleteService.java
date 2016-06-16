package com.walden.service;

import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by walden on 16/6/15.
 */
@Service
public interface IDeleteService<T> {

    void deleteby(Object s);

    void deletelist(List<T> objs);
}
