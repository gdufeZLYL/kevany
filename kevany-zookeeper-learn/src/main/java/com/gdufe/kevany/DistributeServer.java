package com.gdufe.kevany;

import org.apache.zookeeper.*;

import java.io.IOException;

/**
 * @author kevanyzeng
 * @date 2019/2/17 20:48
 */
public class DistributeServer {
    private static String connectString = "39.108.120.164:2182," +
            "39.108.120.164:2183,39.108.120.164:2184";
    private static int sessionTimeout = 2000;
    private ZooKeeper zk = null;
    private String parentNode = "/servers";
    // 创建到 zk 的客户端连接
    public void getConnect() throws IOException {
        zk = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
            }
        });
    }
    // 注册服务器
    public void registServer(String hostname) throws Exception{
        String create = zk.create(parentNode + "/server", hostname.getBytes(),
                ZooDefs.Ids.OPEN_ACL_UNSAFE, CreateMode.EPHEMERAL_SEQUENTIAL);
        System.out.println(hostname +" is online "+ create);
    }
    // 业务功能
    public void business(String hostname) throws Exception{
        System.out.println(hostname+" is working ...");
        Thread.sleep(Long.MAX_VALUE);
    }
    public static void main(String[] args) throws Exception {
        // 获取 zk 连接
        DistributeServer server = new DistributeServer();
        server.getConnect();
         // 利用 zk 连接注册服务器信息
        server.registServer(args[0]);
        // 启动业务功能
        server.business(args[0]);
    }
}
