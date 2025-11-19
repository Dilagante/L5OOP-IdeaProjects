/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package librarycentre_package;

/**
 *
 * @author b.villarini
 */
public class DVD extends Item{
    
    // instance variable
    private String genre;
    private String director;
    
    // constructor

    public DVD(String title, String ISBN) {
        super(title, ISBN);
    }
    
    // get and set methods

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDirector() {
        return director;
    }

    public void setDirector(String director) {
        this.director = director;
    }
    
    // deascription
    public String toString(){
        return super.toString() + ", genre: " + genre + ", director: " + director;
    }
    
}
