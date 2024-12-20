/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// DigitalBook.java (Subclass of Book and implements DigitalAccess)
public class DigitalBook extends Book implements DigitalAccess {
    public DigitalBook(String title, String author, String itemId, int maxDaysToBorrow) {
        super(title, author, itemId, maxDaysToBorrow);
    }

    @Override
    public void onlineReading() {
        System.out.println("You can read the digital book online: " + getTitle());
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the digital book: " + getTitle() + " for " + getMaxDaysToBorrow() + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the digital book: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Digital Book Details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Item ID: " + getItemId());
    }
}
