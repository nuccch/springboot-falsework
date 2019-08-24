package org.chench.springboot.falsework;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import sun.misc.Signal;
import sun.misc.SignalHandler;

@SpringBootApplication
@EnableScheduling                  // 支持定时任务调度
public class SpringbootFalseworkApplication {
    private static final Logger logger = LoggerFactory.getLogger(SpringbootFalseworkApplication.class);

	public static void main(String[] args) {
	    logger.info("Start ...");
        addShutdownHook();
		SpringApplication.run(SpringbootFalseworkApplication.class, args);
		logger.info("Start DONE.");
	}

	private static void addShutdownHook() {
        // 在Spring Boot应用中通过监听信号量和注册关闭钩子来实现在进程退出之前执行收尾工作
        // 监听信号量
        Signal sg = new Signal("TERM");
        Signal.handle(sg, new SignalHandler() {
            @Override
            public void handle(Signal signal) {
                logger.info("do signal handle: {}", signal.getName());
                System.exit(0);
            }
        });

        // 注册关闭钩子
        Runtime.getRuntime().addShutdownHook(new Thread(){
            @Override
            public void run() {
                // 执行收尾工作
                // TODO
                logger.info("do something on shutdown hook");
            }
        });
    }
}
