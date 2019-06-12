package org.chench.springboot.falsework.config;

import org.chench.springboot.falsework.websocket.MySessionHandshakeInterceptor;
import org.chench.springboot.falsework.websocket.MyTextHandler;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.WebSocketHandler;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.config.annotation.WebSocketConfigurer;
import org.springframework.web.socket.config.annotation.WebSocketHandlerRegistry;
import org.springframework.web.socket.server.standard.ServletServerContainerFactoryBean;

/**
 * 配置WebSocket
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.config.WebSocketConfig
 * @date 5/28/19 10:58 AM
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements WebSocketConfigurer {
    @Override
    public void registerWebSocketHandlers(WebSocketHandlerRegistry registry) {
        // 原生WebSocket API
        registry.addHandler(myHandler(), "/websocket/text")
                .addInterceptors(new MySessionHandshakeInterceptor())   // 注册处理器
                .setAllowedOrigins("*");                                // 设置域范围

        // 使用SockJS
        registry.addHandler(myHandler(), "/sockjs/text")
                .addInterceptors(new MySessionHandshakeInterceptor())   // 注册处理器
                .setAllowedOrigins("*")                                 // 设置域范围
                .withSockJS()                                           // 开启SockJS支持
                .setHeartbeatTime(10000);                               // 设置心跳时间间隔，默认25秒: 25000
    }

    @Bean
    public WebSocketHandler myHandler() {
        return new MyTextHandler();
    }

    /**
     * 配置WebSocket引擎进行属性配置
     * @return
     */
    @Bean
    public ServletServerContainerFactoryBean createWebSocketContainer() {
        ServletServerContainerFactoryBean container = new ServletServerContainerFactoryBean();
        container.setMaxTextMessageBufferSize(8192);
        container.setMaxBinaryMessageBufferSize(8192);
        return container;
    }
}
