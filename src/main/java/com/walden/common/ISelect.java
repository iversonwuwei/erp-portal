package com.walden.common;

import org.springframework.stereotype.Component;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
public interface ISelect<T> {

    List<T> select();
}
