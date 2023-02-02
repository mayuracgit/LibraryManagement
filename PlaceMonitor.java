import java.lang.*;
import java.util.*;

class PlaceMonitor
{
    public LinkedList <Place> nobj;

    public PlaceMonitor()
    {
       nobj = new LinkedList<>();
    }

    public void insertData(int bookId,String name,int rackNo)
   {
      Place pobj = new Place(bookId, name, rackNo);
      this.insertData(pobj);
   }

   public void insertData(Place place)            
   {
      nobj.add(place);
   }

   public void displayData()
   {
         for(Place place:nobj)  
         {
            display(place); 
         }                                       
   }

   private void display(Place place)
   {
      //System.out.println("--------------------------------------------------------------------------------------------------");
      System.out.println(place.getBookId() + "\t" + place.getName() + "\t" + place.getRackNo() + "\t" + place.getType());
      System.out.println("--------------------------------------------------------------------------------------------------");
   }

   public void search(String name, String searchType)
     {
       for(Place place:nobj) 
       {
          if((place.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(place);
          }
          else if((place.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(place);
          }
          else if((place.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(place);
          }
          else if((place.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(place);
          } 
          
       }
       
    }

}

