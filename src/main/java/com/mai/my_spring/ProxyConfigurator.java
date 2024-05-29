package com.mai.my_spring;

public interface ProxyConfigurator {
    Object wrapWithProxy(Object t, Class<?> type);
}
