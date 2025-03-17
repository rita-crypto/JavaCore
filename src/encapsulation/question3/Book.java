package encapsulation.question3;

public class Book {
    private String title;
    private String author;
    private double price;

    public void setTitle(String title){
        this.title = title;
    }

    public String getTitle(){
        return title;
    }

    public void setAuthor(String author){
        this.author = author;
    }

    public String getAuthor(){
        return author;
    }

    public void setPrice(double price){
        this.price = price;
    }

    public double getPrice(){
        return price;
    }

    public void applyDiscount(double percentage){
       if(percentage >=0 && percentage <= 100){
           price *= (1-percentage/100);
        }
       else{
           System.out.println("Invalid discount");
       }
    }
}
