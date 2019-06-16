package com.gdufe.kevany;

import org.apache.zookeeper.WatchedEvent;
import org.apache.zookeeper.Watcher;
import org.apache.zookeeper.ZooKeeper;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * @author kevanyzeng
 * @date 2019/2/17 20:59
 */
public class DistributeClient {
    private static String connectString = "39.108.120.164:2182," +
                    "39.108.120.164:2183,39.108.120.164:2184";
    private static int sessionTimeout = 2000;
    private ZooKeeper zk = null;
    private String parentNode = "/servers";
    private volatile ArrayList<String> serversList = new ArrayList<>();
    // 创建到 zk 的客户端连接
    public void getConnect() throws IOException {
        zk = new ZooKeeper(connectString, sessionTimeout, new Watcher() {
            @Override
            public void process(WatchedEvent event) {
                // 再次启动监听
                try {
                    getServerList();
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }
    //
    public void getServerList() throws Exception {
        // 获取服务器子节点信息，并且对父节点进行监听
        List<String> children = zk.getChildren(parentNode, true);
        ArrayList<String> servers = new ArrayList<>();
        for (String child : children) {
            byte[] data = zk.getData(parentNode + "/" + child, false, null);
            servers.add(new String(data));
        }
        // 把 servers 赋值给成员 serverList，已提供给各业务线程使用
        serversList = servers;
        System.out.println(serversList);
    }
    // 业务功能
    public void business() throws Exception {
        System.out.println("client is working ...");
        Thread.sleep(Long.MAX_VALUE);
    }
    public static void main(String[] args) throws Exception {
        // 获取 zk 连接
        DistributeClient client = new DistributeClient();
        client.getConnect();
        // 获取 servers 的子节点信息，从中获取服务器信息列表
        client.getServerList();
        // 业务进程启动
        client.business();
    }
}
