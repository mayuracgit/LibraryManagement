import java.lang.*;
import java.util.*;

class DueMonitor
{
    public LinkedList <Due> dobj;

    public DueMonitor()
    {
       dobj = new LinkedList<>();
    }

    public void insertData(int id, String name,int fined)
    {
         Due dcobj = new Due(id, name, fined);
         this.insertData(dcobj);                                               //dobj.add(dcobj);
    }

    public void insertData(Due due)            
    {
       dobj.add(due);
    }

   public void displayData()
   {
         for(Due due: dobj)  
         {
            display(due);
         }                                       
   }

   private void display(Due due)
   {
         {
            System.out.println(due.getId() + "\t" + due.getName() + "\t" + due.getFined() + "\t" + due.getIssueDate() + "\t" + due.getReturnDate());
            System.out.println("--------------------------------------------------------------------------------------------------");

         }                                       
   }

   public void search(String name, String searchType)
     {
       for(Due due: dobj)
       {
          if((due.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(due);
          }
          else if((due.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(due);
          } 
          else if((due.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(due);
          }
          else if((due.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(due);
          }
       }
       

    }
}