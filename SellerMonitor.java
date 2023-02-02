import java.lang.*;
import java.util.*;

class SellerMonitor
{
    public LinkedList <Seller> tobj;

    public SellerMonitor()
    {
       tobj = new LinkedList<>();
    }

    public void insertData(int id, String name)
    {
       Seller slobj = new Seller(id, name);
       this.insertData(slobj);
    }

   public void insertData(Seller seller)            
   {
      tobj.add(seller);
   }

   public void displayData()
   {
         for(Seller seller: tobj)  
         {
             display(seller);       
         }                                       
   }

   private void display(Seller seller)
   {
         {
           // System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println(seller.getId() + "\t" + seller.getName() + "\t" + seller.getAddress() + "\t" + seller.getContact());
            System.out.println("--------------------------------------------------------------------------------------------------");
         }                                       
   }

   public void search(String name, String searchType)
     {
       for(Seller seller: tobj)
       {
          if((seller.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  
          {
            display(seller);
          }
          else if((seller.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(seller);
          } 
          else if((seller.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(seller);
          }
          else if((seller.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(seller);
          }
       }
       

    }

}
