package org.chench.springboot.falsework.websocket;

import org.chench.springboot.falsework.websocket.WebSocketSessionHandler;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

/**
 * 模拟WebSocket主动推送
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.websocket.MockWebSocketPushTask
 * @date 6/11/19 8:17 PM
 */
@Component
public class MockWebSocketPushTask {

    /**
     * 模拟每隔10秒有一次数据推送
     */
    //@Scheduled(initialDelay = 1000, fixedRate = 10000)
    @Scheduled(fixedRate = 10000)
    public void pushMsg() {
        System.out.println("send msg task");
        String msg = "now: " + new Date();
        WebSocketSessionHandler.getInstance().sendMsg(msg);
    }

}
