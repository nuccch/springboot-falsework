package org.chench.springboot.falsework.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.redis.connection.RedisConnectionFactory;
import org.springframework.data.redis.connection.jedis.JedisConnectionFactory;
import redis.clients.jedis.JedisPoolConfig;

/**
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.config.AppConfig
 * @date 10/14/19 6:17 PM
 */
@Configuration
public class AppConfig {
    // 注入Redis配置信息
    /*@Bean
    public RedisConnectionFactory redisConnectionFactory() {
        JedisPoolConfig poolConfig=new JedisPoolConfig();
        poolConfig.setMaxIdle(10);
        poolConfig.setMinIdle(0);
        poolConfig.setTestOnBorrow(true);
        poolConfig.setTestOnReturn(true);
        poolConfig.setTestWhileIdle(true);
        poolConfig.setNumTestsPerEvictionRun(10);
        poolConfig.setTimeBetweenEvictionRunsMillis(60000);
        JedisConnectionFactory factory = new JedisConnectionFactory(poolConfig);
        factory.getStandaloneConfiguration().setHostName("localhost");
        factory.getStandaloneConfiguration().setPort(6379);
        return factory;
    }*/
}
