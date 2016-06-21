package com.walden.service;

/**
 * Created by walden on 16/6/20.
 */
public interface ISaveAsDraft {

    void saveAsDraft(Object o);

    String recoverFromDraft(Object o);
}
