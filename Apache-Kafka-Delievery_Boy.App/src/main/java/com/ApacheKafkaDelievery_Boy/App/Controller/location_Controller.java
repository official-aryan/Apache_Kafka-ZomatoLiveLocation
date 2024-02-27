package com.ApacheKafkaDelievery_Boy.App.Controller;

import com.ApacheKafkaDelievery_Boy.App.Service.DB_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@RequestMapping("/location")
public class location_Controller {

    @Autowired
    private DB_Service dbService;
    @PostMapping
    public ResponseEntity<?> updatelocation()
    {

        this.dbService.updateLocation("location of deliveryBoy : " + "( " + Math.round(Math.random()*100) + " , " + Math.round(Math.random()*100) + " " +  ")");
        return new ResponseEntity<>(Map.of("message","location updated of delivery boy"), HttpStatus.OK);
    }

}
