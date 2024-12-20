/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class Light extends SmartDevice {
    public Light(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }

    @Override
    public void turnOn() {
        super.turnOn();
        System.out.println("The light is shining brightly!");
    }

    @Override
    public void turnOff() {
        super.turnOff();
        System.out.println("The light is turned off.");
    }
}

