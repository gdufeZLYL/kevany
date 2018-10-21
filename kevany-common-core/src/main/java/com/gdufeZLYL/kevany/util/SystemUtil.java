package com.gdufeZLYL.kevany.util;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Collection;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/21 17:19
 */
public class SystemUtil {

    private static final Logger logger = LoggerFactory.getLogger(SystemUtil.class);

    public static void sleepSecond(int seconds) {
        try {
            Thread.sleep(seconds * 1000L);
        } catch (InterruptedException e) {
            logger.error(e.getMessage(), e);
        }
    }


    public static void waitEmptyToKill(Collection remain) {
        waitEmptyToKill(remain, 30);
    }

    public static void waitEmptyToKill(Collection remain, int waitIntervalSeconds) {
        while (true) {
            sleepSecond(waitIntervalSeconds);
            int size = remain.size();
            logger.debug("left:\t" + size);
            if (size == 0) {
                sleepSecond(waitIntervalSeconds);
                if (remain.size() == 0) {
                    logger.info(" System.exit(0);");
                    System.exit(0);
                }
            }
        }
    }

    private static long getPID() {
        String processName =
                java.lang.management.ManagementFactory.getRuntimeMXBean().getName();
        return Long.parseLong(processName.split("@")[0]);
    }

    public static void printPID() {
        logger.info("====================================== pid : " + getPID() + "======================================");
    }

    public static void printBaseInfo() {
        //logger.info("hostLocation:" + IDTConfiguration.getInstance().hostLocation);
        //logger.info("profile" + IDTConfiguration.getInstance().profile);
    }
}
