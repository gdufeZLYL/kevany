package com.gdufe.kevany.chapter14_type_information.null_objects;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.util.Collections;
import java.util.List;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 22:02
 * @description:
 */
public class NullRobotProxyHandler implements InvocationHandler {

    private String nullName;
    private Robot proxied = new NRobot();

    public NullRobotProxyHandler(Class<? extends Robot> type) {
        nullName = type.getSimpleName() + " NullRobot";
    }

    private class NRobot implements Null, Robot {
        @Override
        public String name() {
            return nullName;
        }

        @Override
        public String model() {
            return nullName;
        }

        @Override
        public List<Operation> operations() {
            return Collections.emptyList();
        }
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        return method.invoke(proxied, args);
    }
}
