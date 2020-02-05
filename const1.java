/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author student
 */
class Author{
     String name;
     String email;
     char gender;
    Author(String name,String email,char gender){
        this.name=name;
        this.email=email;
        this.gender=gender;
    }
}
class Book{
    private String book;
    private Author auth;
    private double price;
    private int quant;
    void setprice(double pr){
    price=pr;
    }
    void setquantity(int qno){
    quant=qno;
    }
    Book(String bnm,Author au){
    book=bnm;
    auth=au;
    }
    String getbooknm(){
    return book;
    }
    Author getauthor(){
    return auth;
    }
    double getprice(){
    return price;
    }
    int getquantity(){
    return quant;}
}
public class const1 {
    public static void main(String[] args) {
        Author au= new Author("Manya","mg@gmail.com",'f');
        Book b = new Book("Java",au);
        b.setprice(250.0);
        b.setquantity(50);
        System.out.println(b.getauthor().name);
        System.out.println(b.getauthor().email);
        System.out.println(b.getprice());
    }
    
}
