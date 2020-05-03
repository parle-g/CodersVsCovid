/*
    Copyright (c) 2020
    All rights reserved. Patents pending.

    Responsible: Vikram Singh Chouhan

 */
package com.example.springboot;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DeviceRestService
{
    @Autowired
    private DeviceService deviceService;

    @GetMapping(value = "/rtmts/status/{deviceId}")
    public ResponseEntity<DeviceStatusResponse> getPayloadData (
           @PathVariable(value = "deviceId") String deviceId)
    {
        DeviceStatusResponse response = new DeviceStatusResponse();
        
        response = deviceService.getDeviceStatus(deviceId);
        
        if (response.getStatus().equals(Response.Status.ERROR)
            || response.getStatus().equals(Response.Status.ALREADY_EXISTS))
        {
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }

        return new ResponseEntity<>(response, HttpStatus.OK);
    }
}
