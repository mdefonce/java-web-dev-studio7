package org.launchcode.studio7;

public abstract class ComputerDisc extends BaseDisc{

    private boolean inserted;

    public ComputerDisc(int storageCapacity, int spinSpeed) {
        super(storageCapacity, spinSpeed);
        this.inserted = false;
    }

    public ComputerDisc(int storageCapacity, int spinSpeed, String title) {
        super(storageCapacity, spinSpeed, title);
        this.inserted = false;
    }


    public boolean isInserted() {return this.inserted;}


    public void insert() {
        this.inserted = true;
    }

}
