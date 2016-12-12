package com.bawei.test.eventbus.ebus;

/**
 * autour: 曾光春
 * date: 2016/12/12 19:41
 * update: 2016/12/12
 */
public class AnyEventType {//自定义一个类

    private String mMsg;
    public AnyEventType(String msg) {
        // TODO Auto-generated constructor stub
        mMsg = msg;
    }
    public String getMsg(){
        return mMsg;
    }
}
