import java.lang.*;
import java.util.*;

class Place
{
    private int bookId;
    private String name;
    private String type;
    private int rackNo;


    public Place(int bookId,String name,int rackNo)    
    {
        this.bookId = bookId;
        this.name = name;
        this.rackNo = rackNo;
    }

    public void setBookId(int bookId)
    {
        this.bookId = bookId;
    }

    public int getBookId()
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

    public void setType(String type)
    {
        this.type = type;
    }

    public String getType()
    {
         return type;
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