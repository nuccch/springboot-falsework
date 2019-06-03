package org.chench.springboot.falsework.websocket;

import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;
import org.springframework.web.socket.handler.TextWebSocketHandler;

/**
 * 处理文本消息
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.websocket.MyTextHandler
 * @date 5/28/19 10:55 AM
 */
public class MyTextHandler extends TextWebSocketHandler {
    @Override
    protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
        System.out.println(session.getId() + ": " + message.getPayload());
        session.sendMessage(new TextMessage("Hello, client: " + session.getId()));
    }
}