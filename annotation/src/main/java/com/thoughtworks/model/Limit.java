package com.thoughtworks.model;

public @interface Limit {
    int minAge() default 1;
    int maxAge() default 140;
}
