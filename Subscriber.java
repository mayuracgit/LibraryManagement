import java.lang.*;
import java.util.*;

class Subscriber
{
    private int subscriberId;
    private String name;
    private String bookIsued;
    private String address;
    private String subscription;
   
    public Subscriber(int subscriberId, String name, String subscription)    
    {
        this.subscriberId = subscriberId;
        this.name = name;
        this.subscription = subscription;
    }

    public void setsubScriberId(int subscriberId)
    {
        this.subscriberId = subscriberId;
    }

    public int getSubscriberId()
    {
         return subscriberId;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
         return name;
    }

    public void setBookIsued(String bookIsued)
    {
        this.bookIsued = bookIsued;
    }

    public String getBookIsued()
    {
         return bookIsued;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
         return address;
    }
    public void setSubsciption(String subscription)
    {
        this.subscription = subscription;
    }

    public String getSubsciption()
    {
         return subscription;
    }
}