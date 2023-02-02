import java.lang.*;
import java.util.*;

class Due
{
    private int id;
    private String name;
    private String issuedDate;
    private String returnDate;
    private int fined;
   

    public Due(int id, String name,int fined)    
    {
        this.id = id;
        this.name = name;
        this.fined = fined;     
    }

    public void setId(int id)
    {
       this.id = id;
    }

    public int getId()
    {
         return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
         return name;
    }

    public void setIssueDate(String issuedDate)
    {
        this.issuedDate = issuedDate;
    }

    public String getIssueDate()
    {
         return issuedDate;
    }

    public void setReturnDate(String returnDate)
    {
        this.returnDate = returnDate;
    }

    public String getReturnDate()
    {
         return returnDate;
    }

    public void setFined(int fined)
    {
        this.fined = fined;
    }

    public int getFined()
    {
         return fined;
    }

}