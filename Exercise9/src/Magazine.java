/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Magazine.java (Subclass of LibraryItem)
public class Magazine extends LibraryItem {
    private int maxDaysToBorrow;

    public Magazine(String title, String author, String itemId, int maxDaysToBorrow) {
        super(title, author, itemId);
        this.maxDaysToBorrow = maxDaysToBorrow;
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the magazine: " + getTitle() + ". You can borrow it for " + maxDaysToBorrow + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the magazine: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Magazine Details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Item ID: " + getItemId());
        System.out.println("Max Borrow Days: " + maxDaysToBorrow);
    }
}
