package com.example.zookeeperagent;

import lombok.Data;

/**
 * @author Tommy
 * Created by Tommy on 2019/9/22
 **/
@Data
public class OsBean implements java.io.Serializable {
    public String ip;
    public Double cpu;
    public long usedMemorySize;
    public long usableMemorySize;
    public String pid;
    public long lastUpdateTime;

}
