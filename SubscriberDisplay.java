import java.lang.*;
import java.util.*;

class SubscriberMonitor
{
    public LinkedList <Subscriber> mobj;

       public void insertData(int subscriberId, String name, String subscription)
       {
         Subscriber sobj = new Subscriber(subscriberId,name,subscription);
         mobj.add(sobj);
      }

      public void displayData()
     {
          for(Subscriber subs:mobj)  
          {
             System.out.println(subs.getSubscriberId() + "\t" + subs.getName() + "\t" + subs.getSubsciption() + "\t" + subs.getAddress() + "\t" + subs.getBookIsued());
          }                                       
    }

}