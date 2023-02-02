import java.lang.*;
import java.util.*;

class PlaceMonitr
{
    public LinkedList <Place> nobj;

    public void insertData(int bookId,String name,int rackNo)
       {
         Place pobj = new Place( bookId, name, rackNo);
         nobj.add(pobj);
       }

      public void displayData()
      {
          for(Place place:nobj)  
          {
             System.out.println(place.getBookId() + "\t" + place.getName() + "\t" + place.getRackNo() + "\t" + place.getType());
          }                                       
      }
}