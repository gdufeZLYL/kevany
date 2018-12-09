package com.gdufe.kevany.chapter14_type_information.null_objects;

import java.lang.reflect.Proxy;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 22:05
 * @description:
 */
public class NullRobot {

    public static Robot newNullRobot(Class<? extends Robot> type) {
        return (Robot) Proxy.newProxyInstance(
                NullRobot.class.getClassLoader(),
                new Class[]{Null.class, Robot.class },
                new NullRobotProxyHandler(type)
        );
    }

    public static void main(String[] args) {
        Robot[] bots = {
                new SnowRemovalRobot("SnowBee"),
                newNullRobot(SnowRemovalRobot.class)
        };
        for (Robot bot : bots) {
            Robot.Test.test(bot);
        }
    }
}
