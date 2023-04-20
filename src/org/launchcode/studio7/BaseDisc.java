package org.launchcode.studio7;

import java.util.HashMap;

public abstract class BaseDisc {

    private String discData;
    private HashMap<String, String> discInfo;
    private final int storageCapacityMB;
    private final int spinSpeedRPM;
    private String title;

    public BaseDisc(int storageCapacity, int spinSpeed) {
        this.discData = "";
        this.discInfo = new HashMap<String, String>();
        this.storageCapacityMB = storageCapacity;
        this.spinSpeedRPM = spinSpeed;

        this.discInfo.put("Storage capacity", String.valueOf(storageCapacity));
        this.discInfo.put("Spin speed", String.valueOf(spinSpeed));
    }

    public BaseDisc(int storageCapacity, int spinSpeed, String title) {
        this(storageCapacity, spinSpeed);
        this.discInfo.put("Title", title);
    }



    public int getStorageCapacityMB() {return this.storageCapacityMB;}

    public int getSpinSpeedRPM() {return this.spinSpeedRPM;}

    protected void writeData(String data) {
        this.discData += data;
    }

    public String readData() {
        return this.discData;
    }

    public HashMap<String, String> getInfo() {
        return this.discInfo;
    }



}
