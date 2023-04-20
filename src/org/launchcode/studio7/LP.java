package org.launchcode.studio7;

public class LP extends BaseDisc implements OpticalDisc{
    public LP(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
    }

    public LP(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
    }

    @Override
    public void spinDisc() {

    }

    @Override
    public void storeData(String data) {

    }

    @Override
    public boolean isFull() {
        return false;
    }
}
