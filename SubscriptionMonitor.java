import java.lang.*;
import java.util.*;

class SubscriptionMonitor
{
    public LinkedList <Subscription> robj;

    public SubscriptionMonitor()
    {
       robj = new LinkedList<>();
    }

    public void insertData(int subscriberId,String name,int fees)
   {
   Subscription sbobj = new Subscription(subscriberId,name,fees);
   this.insertData(sbobj);
   
   }

   public void insertData(Subscription subscription)
   {
      robj.add(subscription);
   }

   public void displayData()
   {
      for(Subscription subscription: robj)  
      {
         display(subscription);
      }                                       
  }

  private void display(Subscription subscription)
   {
      //for(Subscription subscription: robj)  
      {
         //System.out.println("--------------------------------------------------------------------------------------------------");
         System.out.println(subscription.getSubscriberId() + "\t"+ subscription.getName() + "\t" + subscription.getFees() + "\t" + subscription.getDuration());
         System.out.println("--------------------------------------------------------------------------------------------------");

      }                                       
  }

  public void search(String name, String searchType)
     {
       for(Subscription subscription:robj)
       {
          if((subscription.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(subscription);
          }
          else if((subscription.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(subscription);
          }
          else if((subscription.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(subscription);
          }
          else if((subscription.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(subscription);
          } 
          
       }
       

    }




}