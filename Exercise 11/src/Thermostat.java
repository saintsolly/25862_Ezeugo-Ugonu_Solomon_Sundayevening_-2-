/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class Thermostat extends SmartDevice implements Programmable {
    public Thermostat(String deviceName, double energyConsumption) {
        super(deviceName, energyConsumption);
    }

    @Override
    public void scheduleTurnOn(String time) {
        System.out.println(deviceName + " is scheduled to turn ON at " + time + ".");
    }

    @Override
    public void scheduleTurnOff(String time) {
        System.out.println(deviceName + " is scheduled to turn OFF at " + time + ".");
    }
}
