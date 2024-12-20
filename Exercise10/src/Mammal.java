/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Mammal class
public class Mammal extends Animal implements Soundable, Movable {
    public Mammal(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println(species + " makes a growl.");
    }

    @Override
    public void move() {
        System.out.println(species + " moves by running.");
    }
}

