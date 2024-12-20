/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Abstract Class: Animal
public abstract class Animal {
    protected String species;
    protected String habitat;
    protected String diet;

    public Animal(String species, String habitat, String diet) {
        this.species = species;
        this.habitat = habitat;
        this.diet = diet;
    }
     public String getSpecies() {
        return species;
    }

    public String getHabitat() {
        return habitat;
    }

    public String getDiet() {
        return diet;
    }
}
