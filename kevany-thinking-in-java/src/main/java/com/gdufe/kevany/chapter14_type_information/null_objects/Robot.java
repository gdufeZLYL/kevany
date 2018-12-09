package com.gdufe.kevany.chapter14_type_information.null_objects;

import java.util.List;

/**
 * @author: kevanyzeng
 * @date: 2018/12/9 20:53
 * @description:
 */
public interface Robot {
    String name();
    String model();
    List<Operation> operations();
    class Test {
        public static void test(Robot r) {
            if (r instanceof Null) {
                System.out.println("[Null Robot]");
            }
            System.out.println("Robot name: " + r.name());
            System.out.println("Robot model: " + r.model());
            for (Operation operation : r.operations()) {
                System.out.println(operation.description());
                operation.command();
            }
        }
    }
}
