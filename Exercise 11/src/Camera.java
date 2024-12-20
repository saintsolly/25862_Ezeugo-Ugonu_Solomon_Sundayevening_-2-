/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class Camera extends SmartDevice {
    public Camera(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The camera is recording.");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The camera is no longer recording.");
    }
}

