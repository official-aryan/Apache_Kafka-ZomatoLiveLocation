package com.ApacheKafkaDelievery_Boy.App.Service;

import com.ApacheKafkaDelievery_Boy.App.Config.App_Constants;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

@Service
public class DB_Service {


    private Logger logger= LoggerFactory.getLogger(DB_Service.class);
    @Autowired
    private KafkaTemplate<String ,String > kafkaTemplate;

    public boolean updateLocation(String location)
    {
        this.kafkaTemplate.send(App_Constants.LOCATION_TOPIC_NAME,location);
        this.logger.info("message produced");
        return true;
    }

}
