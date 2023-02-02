import java.lang.*;
import java.util.*;

class Books                           // Books class aahe
{
    private int bookId;                              // private kelyamule kunalahi baherun aaceess karta yenar nahi. access sathi apan get set use karu shkto
    private String name;
    private String author;
    private String type;                       
    private String sellerName;                 
    private int price;                       
    private int rackNo;

    public Books(int bookId, String name, String author,String type)    //Books constructor aahe.
    {
        this.bookId = bookId;                     
        this.name = name;
        this.author = author;
        this.type = type;
         
    }

    public void setBookid(int bookId)    //ithe apn value set karnyasathi input denar mhanun parameter dila aahe.
    {
        this.bookId = bookId; 
    }

    public int getBookid()            //getId mule apn to variable garaj asel tithe milvu shakto.
    {
         return bookId;                      
    }

    public void setName(String name )
    {
        this.name = name;
    }

    public String getName()
    {
         return name;
    }

    public void setAuthor(String author)
    {
        this.author = author;
    }

    public String getAuthor()
    {
         return author;
    }

    public void seType(String type)
    {
        this.type = type;                     
    }

    public String getType()
    {
         return type;                         
    }

    public void setSellerName(String sellerName)
    {
        this.sellerName = sellerName;
    }

    public String getSellerName()
    {
         return sellerName;
    }

    public void setPrice(int price)
    {
        this.price = price;
    }

    public int getPrice()                    
    {
         return price;
    }

    public void setRackNo(int rackNo)
    {
        this.rackNo = rackNo;
    }

    public int getRackNo()
    {
         return rackNo;
    }
}