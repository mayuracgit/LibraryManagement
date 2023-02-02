import java.lang.*;
import java.util.*;

class Seller
{
    public int id;
    public String name;
    public String address;
    public long contact;

    public Seller(int id, String name)    
    {
        this.id = id;
        this.name = name;
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

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
         return address;
    }

    public void setContact(int contact)
    {
        this.contact = contact;
    }

    public long getContact()
    {
         return contact;
    }

}