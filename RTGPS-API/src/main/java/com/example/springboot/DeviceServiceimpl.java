/*
    Copyright (c) 2020
    All rights reserved. Patents pending.

    Responsible: Vikram Singh Chouhan

 */
package com.example.springboot;

import org.springframework.stereotype.Component;

@Component
public class DeviceServiceimpl implements DeviceService
{

    @Override
    public DeviceStatusResponse getDeviceStatus (String deviceId)
    {
        DeviceStatusResponse response = new DeviceStatusResponse();
        if(deviceId == null || deviceId.isEmpty()) {
            response.addErrorMessage("Invalid Device Id");
            response.setStatus(Response.Status.BAD_REQUEST);
            return response;
        }
        
        DeviceAuthentication deviceAuthentication = getDeviceInfo(deviceId);
        if( null != deviceAuthentication) {
            response.setDeviceId(deviceAuthentication.getDeviceId());
            response.setOwnerName(deviceAuthentication.getOwnerName());
            response.setPastOffences(deviceAuthentication.getPastOffences());
            response.setRegisteredVehicleNumber(deviceAuthentication.getRegisteredVehicleNumber());
            response.setRegisteredWithOrganization(deviceAuthentication.getRegisteredWithOrganization());
            response.setStatus(Response.Status.OK);
        }
        return response;
        
    }
    
    
    private DeviceAuthentication getDeviceInfo (String deviceId) {
        
        // logic to database call to get device authentication info
        
        // for now i am gererating random values
        String quarantineStatus = "Unidentified";
        String registeredWithOrganization = "TATA INC.";
        String ownerName = "Shalini Mehra";
        String registeredVehicleNumber = "RJ27SS8580";

       double random = Math.random();
       
       if(random%2 == 0) {
           quarantineStatus = "Authorised";
       }
       else {
           quarantineStatus = "unauthorised";
       }
       DeviceAuthentication deviceAuthentication = new DeviceAuthentication(quarantineStatus,deviceId,ownerName);
       deviceAuthentication.setRegisteredVehicleNumber(registeredVehicleNumber);
       deviceAuthentication.setRegisteredWithOrganization(registeredWithOrganization);
       return deviceAuthentication;
    }

}
