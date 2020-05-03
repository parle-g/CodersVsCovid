/*
    Copyright (c) 2020 
    All rights reserved. Patents pending.

    Responsible: Vikram Singh Chouhan

 */
package ariba.dms.core.vik;

//@Entity
public class DeviceAuthentication
{
    private String quarantineStatus = "Unidentified";
    private String deviceId;
    private String registeredWithOrganization;
    private String ownerName;
    private String registeredVehicleNumber;
    private String[] pastOffences;
    
    public DeviceAuthentication ()
    {
        super();
    }
    
    public DeviceAuthentication (String quarantineStatus,
                                 String deviceId,
                                 String ownerName)
    {
        super();
        this.quarantineStatus = quarantineStatus;
        this.deviceId = deviceId;
        this.ownerName = ownerName;
    }
    
    public String getQuarantineStatus ()
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
    
    
}
