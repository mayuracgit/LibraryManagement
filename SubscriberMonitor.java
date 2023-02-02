import java.lang.*;
import java.util.*;

class SubscriberMonitor
{
    public LinkedList <Subscriber> mobj;

    public SubscriberMonitor()
    {
       mobj = new LinkedList<>();
    }

       public void insertData(int subscriberId, String name, String subscription)
       {
         Subscriber sobj = new Subscriber(subscriberId,name,subscription);
         this.insertData(sobj);
      }

      public void insertData(Subscriber subs)
      {
          mobj.add(subs);
      }

      public void displayData()
     {
          for(Subscriber subs:mobj)  
          {
             display(subs);
          }                                       
    }

    private void display(Subscriber subs)
     {
         //System.out.println("--------------------------------------------------------------------------------------------------");
         System.out.println("| "+subs.getSubscriberId() + "\t" + "| "+subs.getName() + "\t" + "| "+subs.getSubsciption() + "\t" + "| "+subs.getAddress() + "\t" + "| "+subs.getBookIsued()); 
         System.out.println("--------------------------------------------------------------------------------------------------");
     }

     public void search(String name, String searchType)
     {
       for(Subscriber subs:mobj)
       {
          if((subs.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(subs);
          }
          else if((subs.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(subs);
          }
          else if((subs.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(subs);
          }
          else if((subs.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(subs);
          } 
          
       }
       

    }

}
