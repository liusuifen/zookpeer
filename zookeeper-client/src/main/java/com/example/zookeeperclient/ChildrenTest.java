package com.example.zookeeperclient;

import org.apache.zookeeper.KeeperException;
import org.apache.zookeeper.ZooKeeper;
import org.apache.zookeeper.data.Stat;
import org.junit.Before;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.io.IOException;

/**
 * @author Tommy
 * Created by Tommy on 2019/9/26
 **/
public class ChildrenTest {

    @Autowired
    ZooKeeper zooKeeper;


    @Before
    public void init() throws IOException {
        zooKeeper = new ZooKeeper("195.55.0.84", 2181, event -> {
            System.out.println(event);
        });
    }

    @Test
    public void getChild() throws KeeperException, InterruptedException {
        zooKeeper.getChildren("/tuling", null).stream().forEach(System.out::println);
        Stat stat = new Stat();
        zooKeeper.getChildren("/tuling", null, stat);
        System.out.println(stat);
    }
}
