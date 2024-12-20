/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
public class SmartHomeSystem {
    public static void main(String[] args) {
        // Create devices
        Light livingRoomLight = new Light("Living Room Light", 60);
        Thermostat homeThermostat = new Thermostat("Home Thermostat", 150);
        Camera securityCamera = new Camera("Security Camera", 10);

        // Test Controllable functionality
        livingRoomLight.turnOn();
        livingRoomLight.turnOff();

        securityCamera.turnOn();
        securityCamera.turnOff();

        // Test Programmable functionality
        homeThermostat.turnOn();
        homeThermostat.scheduleTurnOn("6:00 AM");
        homeThermostat.scheduleTurnOff("10:00 PM");
    }
}

