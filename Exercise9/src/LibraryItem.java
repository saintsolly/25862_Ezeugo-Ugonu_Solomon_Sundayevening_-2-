/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author T R U T H
 */
// LibraryItem.java (Abstract Class)
public abstract class LibraryItem implements Lendable {
    private String title;
    private String author;
    private String itemId;

    public LibraryItem(String title, String author, String itemId) {
        this.title = title;
        this.author = author;
        this.itemId = itemId;
    }

    // Getters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public String getItemId() {
        return itemId;
    }

    // Abstract method to display item details
    public abstract void displayItemDetails();
}
