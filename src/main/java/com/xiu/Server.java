package com.xiu;

import com.xiu.server.MessageServer;

/**
 * @Auther 创建者: Tc李
 * @Date 创建时间: 2018/07/02 20:28
 * @Description 类描述:
 */
public class Server {
    public static void main(String[] args) throws Exception {
        new MessageServer(8087).run();
    }
}
