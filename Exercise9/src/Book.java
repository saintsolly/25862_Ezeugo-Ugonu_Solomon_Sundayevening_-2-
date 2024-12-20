/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// Book.java (Subclass of LibraryItem)
public class Book extends LibraryItem {
    private int maxDaysToBorrow;

    public Book(String title, String author, String itemId, int maxDaysToBorrow) {
        super(title, author, itemId);
        this.maxDaysToBorrow = maxDaysToBorrow;
    }

    @Override
    public void borrowItem() {
        System.out.println("You have borrowed the book: " + getTitle() + ". You can borrow it for " + maxDaysToBorrow + " days.");
    }

    @Override
    public void returnItem() {
        System.out.println("You have returned the book: " + getTitle());
    }

    @Override
    public void displayItemDetails() {
        System.out.println("Book Details: ");
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Item ID: " + getItemId());
        System.out.println("Max Borrow Days: " + maxDaysToBorrow);
    }
}

