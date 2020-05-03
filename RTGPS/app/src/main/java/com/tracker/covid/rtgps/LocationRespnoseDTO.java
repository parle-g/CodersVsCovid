package com.tracker.covid.rtgps;

/**
 * Created by chouhan on 3/5/20.
 */

public class LocationRespnoseDTO {
    private String latitude;
    private String longitude;
    private String androidId;

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getAndroidId() {
        return androidId;
    }

    public void setAndroidId(String androidId) {
        this.androidId = androidId;
    }
}
