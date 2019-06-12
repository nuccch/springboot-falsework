package org.chench.springboot.falsework.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.socket.TextMessage;
import org.springframework.web.socket.WebSocketSession;

import java.io.IOException;
import java.util.HashSet;
import java.util.Set;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.websocket.WebSocketSessionHandler
 * @date 6/11/19 8:20 PM
 */
public class WebSocketSessionHandler {
    private static final Logger logger = LoggerFactory.getLogger(WebSocketSessionHandler.class);
    private static final WebSocketSessionHandler instance = new WebSocketSessionHandler();
    private WebSocketSessionHandler() {}
    private Set<WebSocketSession> sessions = new HashSet<WebSocketSession>(0);

    public static WebSocketSessionHandler getInstance() {
        return instance;
    }

    public void saveSession(WebSocketSession session) {
        this.sessions.add(session);
    }

    public void sendMsg(String msg) {
        for(WebSocketSession session : sessions) {
            try {
                session.sendMessage(new TextMessage(msg));
            } catch (IOException e) {
                logger.error("send msg error: {}, {}", session, msg);
                e.printStackTrace();
            }
        }
    }

}
