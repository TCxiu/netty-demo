package com.xiu.model;

import java.io.Serializable;
import java.util.Date;

/**
 * @Auther 创建者: Tc李
 * @Date 创建时间: 2018/07/02 20:08
 * @Description 类描述:
 */
public class Message implements Serializable {

    private String messageName;


    private Object msgData;


    private Date createTime ;

    public String getMessageName() {
        return messageName;
    }

    public void setMessageName(String messageName) {
        this.messageName = messageName;
    }

    public Object getMsgData() {
        return msgData;
    }

    public void setMsgData(Object msgData) {
        this.msgData = msgData;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "Message{" +
                "messageName='" + messageName + '\'' +
                ", msgData=" + msgData +
                ", createTime=" + createTime +
                '}';
    }
}
