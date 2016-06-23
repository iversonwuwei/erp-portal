package com.walden.common.database;

import java.util.List;

/**
 * Created by walden on 16/6/16.
 */
public interface ISelect<T> {

    List<T> select();
}
