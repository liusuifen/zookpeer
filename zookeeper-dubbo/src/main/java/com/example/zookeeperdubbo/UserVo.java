package com.example.zookeeperdubbo;

import lombok.Data;

import java.io.Serializable;
import java.util.Date;

/**
 * @author Tommy
 * Created by Tommy on 2018/11/18
 **/
@Data
public class UserVo implements Serializable {

    Integer id;
    String name;
    Date birthDay;
    int port;
}
