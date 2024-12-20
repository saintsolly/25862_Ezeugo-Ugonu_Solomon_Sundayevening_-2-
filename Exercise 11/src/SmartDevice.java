/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public abstract class SmartDevice implements Controllable {
    protected String deviceName;
    protected boolean status; // true for ON, false for OFF
    protected double energyConsumption;

    public SmartDevice(String deviceName, double energyConsumption) {
        this.deviceName = deviceName;
        this.energyConsumption = energyConsumption;
        this.status = false; // Devices are OFF by default
    }

    public String getDeviceName() {
        return deviceName;
    }

    public boolean getStatus() {
        return status;
    }

    public double getEnergyConsumption() {
        return energyConsumption;
    }

    @Override
    public void turnOn() {
        status = true;
        System.out.println(deviceName + " is now ON.");
    }

    @Override
    public void turnOff() {
        status = false;
        System.out.println(deviceName + " is now OFF.");
    }
}

