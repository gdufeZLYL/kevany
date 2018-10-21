package com.gdufeZLYL.kevany.cli;

import com.beust.jcommander.JCommander;
import com.gdufeZLYL.kevany.util.SystemUtil;

/**
 * @author zzqnxx@foxmail.com
 * @date 2018/10/21 17:22
 */
public abstract class KeCli {

    protected abstract void execute();

    protected void init(String... args) {
        SystemUtil.printPID();
        SystemUtil.printBaseInfo();
        new JCommander(this, args);
        this.execute();
    }
}
