package org.chench.springboot.falsework.websocket;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.server.ServerHttpRequest;
import org.springframework.http.server.ServerHttpResponse;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.server.support.HttpSessionHandshakeInterceptor;

import java.util.Map;

/**
 * Http会话拦截器
 *
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.websocket.MySessionHandshakeInterceptor
 * @date 5/28/19 11:26 AM
 */
public class MySessionHandshakeInterceptor extends HttpSessionHandshakeInterceptor {
    private Logger logger = LoggerFactory.getLogger(MySessionHandshakeInterceptor.class);

    @Override
    public boolean beforeHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler, Map<String, Object> attributes) throws Exception {
        logger.info("before handle shake");
        System.out.println(handler);
        System.out.println(attributes);
        System.out.println(request.getURI().getQuery());
        return true;
    }

    @Override
    public void afterHandshake(ServerHttpRequest request, ServerHttpResponse response, WebSocketHandler handler, Exception ex) {
        logger.info("after handle shake");
    }
}
