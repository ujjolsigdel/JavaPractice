package com.example.helloworld;

public class Artwork {
    public static void main(String[] args){

//        Artwork aa = new Artwork("Anonymouz","Myster-y","Scifistic Experimentalism");
//        System.out.println(aa.toString());
//        System.out.println();
//
//        Book b = new Book("Harari","Nexus","Non-fiction prose",492);
//        System.out.println(b.toString());
//        System.out.println();
//
//        Song s = new Song("Sami Yaffa","Rotten Roots","Rock",257,123);
//        System.out.println(s.toString());
//        System.out.println();
//
//        Painting p = new Painting("asfd","sdfg","asdg",50000.23);
//        System.out.println(p.toString());
    }
    private String author;
    private String name;
    private String genre;

    public Artwork(String author, String name, String genre){
        this.author = author;
        this.name = name;
        this.genre = genre;
    }

    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName() {
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getGenre() {
        return genre;
    }
    public void setGenre(String genre){
        this.genre = genre;
    }


    public String toString(){
        return "Author:" + this.author + "\n"
                + "Name:" + this.name + "\n"
                + "Genre:" + this.genre;
    }
}
class Book extends Artwork {
    private int pages;

    public Book(String author, String name, String genre, int pages) {
        super(author, name, genre);
        this.pages = pages;
    }
    public int getPages() {
        return pages;
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public String toString() {
        return super.toString() + "\nPages:" + pages;
    }
}

// Write your implementation of subclass Song below
// (In real life, this code belongs to file Song.java)
class Song extends Artwork {
    private int seconds;
    private int timesPlayed;

    public Song(String author, String name, String genre, int seconds, int timesPlayed) {
        super(author, name, genre);
        this.seconds = seconds;
        this.timesPlayed = timesPlayed;
    }
    public int getSeconds() {
        return seconds;
    }
    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }
    public int getTimesPlayed() {
        return timesPlayed;
    }
    public void setTimesPlayed(int timesPlayed) {
        this.timesPlayed = timesPlayed;
    }
    public String toString() {
        return super.toString() + "\nSeconds:" + seconds +
                "\nTimes played:" + timesPlayed;
    }
}



// Write your implementation of subclass Painting below
// (In real life, this code belongs to file Painting.java)

class Painting extends Artwork {
    private double price;
    public Painting(String author, String name, String genre, double price) {
        super(author, name, genre);
        this.price = price;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String toString() {
        return super.toString() + "\nPrice:" + price;
    }

}