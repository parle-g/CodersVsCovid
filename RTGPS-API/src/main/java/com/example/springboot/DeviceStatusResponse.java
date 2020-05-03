/*
    Copyright (c) 2020
    All rights reserved. Patents pending.

    Responsible: Vikram Singh Chouhan

 */
package com.example.springboot;

import java.util.Arrays;

public class DeviceStatusResponse extends Response
{
    
    private String quarantineStatus = "Unidentified";
    private String deviceId;
    private String registeredWithOrganization;
    private String ownerName;
    private String registeredVehicleNumber;
    private String[] pastOffences;
    
    public String getGuarantineStatus ()
    {
        return quarantineStatus;
    }
    public void setQuarantineStatus (String quarantineStatus)
    {
        this.quarantineStatus = quarantineStatus;
    }
    public String getDeviceId ()
    {
        return deviceId;
    }
    public void setDeviceId (String deviceId)
    {
        this.deviceId = deviceId;
    }
    public String getRegisteredWithOrganization ()
    {
        return registeredWithOrganization;
    }
    public void setRegisteredWithOrganization (String registeredWithOrganization)
    {
        this.registeredWithOrganization = registeredWithOrganization;
    }
    public String getOwnerName ()
    {
        return ownerName;
    }
    public void setOwnerName (String ownerName)
    {
        this.ownerName = ownerName;
    }
    public String getRegisteredVehicleNumber ()
    {
        return registeredVehicleNumber;
    }
    public void setRegisteredVehicleNumber (String registeredVehicleNumber)
    {
        this.registeredVehicleNumber = registeredVehicleNumber;
    }
    public String[] getPastOffences ()
    {
        return pastOffences;
    }
    public void setPastOffences (String[] pastOffences)
    {
        this.pastOffences = pastOffences;
    }
    
    @Override
    public String toString ()
    {
        return "DeviceStatusResponse [quarantineStatus=" + quarantineStatus + ", deviceId=" + deviceId
            + ", registeredWithOrganization=" + registeredWithOrganization
            + ", ownerName=" + ownerName + ", registeredVehicleNumber="
            + registeredVehicleNumber + ", pastOffences=" + Arrays.toString(pastOffences)
            + "]";
    }
}
