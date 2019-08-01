package org.chench.springboot.falsework.websocket;

import org.springframework.stereotype.Service;
import org.springframework.web.socket.*;
import org.springframework.web.socket.client.standard.StandardWebSocketClient;
import org.springframework.web.socket.handler.TextWebSocketHandler;
import org.springframework.web.socket.sockjs.client.RestTemplateXhrTransport;
import org.springframework.web.socket.sockjs.client.SockJsClient;
import org.springframework.web.socket.sockjs.client.Transport;
import org.springframework.web.socket.sockjs.client.WebSocketTransport;

import java.util.ArrayList;
import java.util.List;

/**
 * 使用Spring提供的SockJS模拟一个WebSocket客户端
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.websocket.SockJsClientMock
 * @date 6/13/19 11:04 AM
 */
//@Service
public class SockJsClientMock {
    public SockJsClientMock() {
        List<Transport> transports = new ArrayList<Transport>(2);
        transports.add(new WebSocketTransport(new StandardWebSocketClient()));
        transports.add(new RestTemplateXhrTransport());
        SockJsClient client = new SockJsClient(transports);
        client.doHandshake(new MyWebSocketHandler(), "http://172.17.200.61:8400/dt/front/instance/sockjs.ft?id=11&token=1");
        System.out.println("Init sockjs client done.");
    }

    class MyWebSocketHandler extends TextWebSocketHandler {
        @Override
        protected void handleTextMessage(WebSocketSession session, TextMessage message) throws Exception {
            super.handleTextMessage(session, message);
            System.out.println(message.getPayload());
        }
    }

}
