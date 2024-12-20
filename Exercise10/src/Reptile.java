/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Reptile class
public class Reptile extends Animal implements Soundable, Movable {
    public Reptile(String species, String habitat, String diet) {
        super(species, habitat, diet);
    }

    @Override
    public void makeSound() {
        System.out.println(species + " hisses.");
    }

    @Override
    public void move() {
        System.out.println(species + " crawls.");
    }
}
