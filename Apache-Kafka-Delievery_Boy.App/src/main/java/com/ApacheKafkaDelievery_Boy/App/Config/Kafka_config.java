package com.ApacheKafkaDelievery_Boy.App.Config;

import org.apache.kafka.clients.admin.NewTopic;
import org.springframework.cache.annotation.CacheConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.config.TopicBuilder;

@CacheConfig
public class Kafka_config {

    @Bean
    public NewTopic newTopic()
    {
        return TopicBuilder.name(App_Constants.LOCATION_TOPIC_NAME)
                .build();
    }

}
