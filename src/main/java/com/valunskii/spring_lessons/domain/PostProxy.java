package com.valunskii.spring_lessons.domain;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/**
 * Методы, анотированные этой анотацией должны запускаться сами в тот момент,
 * когда уже всё настроено и все прокси сгенерировались
 * */
@Retention(RetentionPolicy.RUNTIME)
public @interface PostProxy {

}
