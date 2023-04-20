package org.launchcode.studio7;

public class CD extends ComputerDisc implements OpticalDisc {
    public CD() {
        super(700, 500);
    }

    @Override
    public void spinDisc() {
        System.out.println("A CD spins at the rate of " + this.getSpinSpeedRPM() + " rpm.");
    }

    @Override
    public void storeData(String data) {
        this.writeData(data);
    }

    @Override
    public boolean isFull() {
        if(this.readData().length() >= this.getStorageCapacityMB()) {
            return true;
        } else {return false;}
    }

    // TODO: Implement your custom interface.

    // TODO: Determine which fields, methods, and constructors can be extended from the base class and which ones
    //  need to be declared separately.

}
