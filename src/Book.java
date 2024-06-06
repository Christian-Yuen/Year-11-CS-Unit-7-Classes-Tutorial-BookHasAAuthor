public class Book {
    private String name;
    private Author author;
    private int price;
    private int quantity;

    public Book (String name, Author author, int price, int quantity){
        this.name = name;
        this.author = author;
        this.price = price;
        this.quantity = quantity;
    }

    public void setPrice(int price){
        this.price = price;
    }
    public void setQty (int quantity){
        this.quantity = quantity;
    }
    public String getName(){
        return name;
    }

    public String getAuthor(){
        return author.toString();
    }

    public String toString(){
        return "'"+name+"'"+ " by " + author.toString();
    }

    public int getPrice(){
        return price;
    }

    public int getQty(){
        return quantity;
    }



}
