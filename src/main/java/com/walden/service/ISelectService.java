package com.walden.service;

import java.util.List;

/**
 * Created by walden on 16/6/13.
 */
public interface ISelectService<T> {

    List<T> selectAll();

    List<T> selectBy(String condition);
}
