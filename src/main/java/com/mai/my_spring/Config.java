package com.mai.my_spring;


public interface Config {
    <T> Class<T> getImplClass(Class<T> type);
}
