package com.walden.common;

import java.util.List;

/**
 * Created by walden on 16/6/17.
 */
public interface IRead<E> {

    Object read(Object name);

    List<E> readAllFiles();
}
