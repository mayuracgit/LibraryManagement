import java.lang.*;
import java.util.*;

class Subscription
{
    public int fees;
    public int duration;
    public String name;
    public int subscriberId;

    public Subscription(int subscriberId,String name,int fees)    
    {
        this.fees = fees;
        this.subscriberId = subscriberId;
        this.name = name;
    }

    public void setFees(int fees)
    {
        this.fees = fees;
    }

    public int getFees()
    {
         return fees;
    }

    public void setDuration(int duration)
    {
        this.duration = duration;
    }

    public int getDuration()
    {
         return duration;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
         return name;
    }

    public void setSubscriberId(int subscriberId)
    {
        this.subscriberId = subscriberId;
    }

    public int getSubscriberId()
    {
         return subscriberId;
    }

}
