package org.chench.springboot.falsework.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

/**
 * Kafka服务
 * @author chench9@lenovo.com
 * @desc org.chench.springboot.falsework.service.KafkaService
 * @date 8/1/19 6:10 PM
 */
@Service
public class KafkaService {
    private static final Logger logger = LoggerFactory.getLogger(KafkaService.class);

    public KafkaService() {

    }

    /**
     * 启动消费者
     */
    public void startConsumer() {
//        ContainerProperties cp = new ContainerProperties("topic1", "topic2");
//        cp.setMessageListener(new AcknowledgingMessageListener<String, String>() {
//            @Override
//            public void onMessage(ConsumerRecord<String, String> consumerRecord, Acknowledgment acknowledgment) {
//                // 消费数据
//                logger.info("receive: " + consumerRecord.value());
//            }
//        });
//
//        Map<String, Object> props = new HashMap<>();
//        props.put(ConsumerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
//        props.put(ConsumerConfig.GROUP_ID_CONFIG, "test");
//        props.put(ConsumerConfig.ENABLE_AUTO_COMMIT_CONFIG, true); // 自动提交
//        props.put(ConsumerConfig.AUTO_COMMIT_INTERVAL_MS_CONFIG, "100");
//        props.put(ConsumerConfig.SESSION_TIMEOUT_MS_CONFIG, "15000");
//        props.put(ConsumerConfig.KEY_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        props.put(ConsumerConfig.VALUE_DESERIALIZER_CLASS_CONFIG, StringDeserializer.class);
//        DefaultKafkaConsumerFactory<String, String> cf = new DefaultKafkaConsumerFactory<String, String>(props);
//
//        KafkaMessageListenerContainer<String, String> container = new KafkaMessageListenerContainer<>(cf, cp);
//        container.setBeanName("testAuto");
//        container.start();
    }
}
