import java.util.*;

class BooksMonitor
{
    public LinkedList <Books> lobj;     // LinkedList<data type> LL object.

    public BooksMonitor()
    {
       lobj = new LinkedList<>();          
    }

    public void insertData(int bookId, String name, String author,String type,String sellerName,int price,int rackNo)
    {
         Books bobj = new Books(bookId,name,author,type); 
         bobj.setSellerName(sellerName);                    //setter use kely aahe tyamule apn book class chya constructor madhe kahihi changes n karata BooksMonitor class madhe setter method call karu shakto.
         bobj.setPrice(price);
         bobj.setRackNo(rackNo);
         //this.insertData(bobj);
          lobj.add(bobj);
    }

     public void insertData(Books books)             /////// Books madhe sarva info store asel tyamule insertData cha constructor create karun tyala parameter Books dila.
     {                                               //insertData(Books books) mjanjech (Books = Data Type and books = variable or objec t)
          lobj.add(books);                           //lobj.add(books) asa pan jeva lihito teva apan Book chi ji LL aahe tyat Book linked list cha aobject gheun new book add karto. mhanje apn new node add karto.ase apn multiple books store karu shakto.
     }

     public void displayData()
     {
          for(Books books:lobj)  //(datatype variable:ll object ) for each loop
          {
            display(books);    
          }                                       
     }

     private void display(Books books)
     {
        // System.out.println("--------------------------------------------------------------------------------------------------");
         System.out.println("| "+books.getBookid() + "\t" + "| "+books.getName() + "\t" + "| "+books.getAuthor() + "\t" + "| "+books.getType() + "\t" + "| "+books.getSellerName() + "\t" + "| "+books.getPrice() + "\t" + "| "+books.getRackNo());
         System.out.println("--------------------------------------------------------------------------------------------------");

     }

     public void searchA(String name)
     {
       for(Books books:lobj)
       {
          if((books.getAuthor().toLowerCase().contains(name.toLowerCase())) )
          {
            display(books);
          }
       }
     }

     public void searchB(String name)
     {
       for(Books books:lobj)
       {
          if((books.getAuthor().toLowerCase().startsWith( name.toLowerCase())))
          {
             display(books);
          }
       }
     }

     public void searchC(String name)
     {
       for(Books books:lobj)
       {
          if((books.getAuthor().toLowerCase().endsWith( name.toLowerCase())))
          {
             display(books);
          }
       }
     }

     public void searchD(String name)
     {
       for(Books books:lobj)
       {
          if((books.getAuthor().equalsIgnoreCase( name)))
          {
             display(books);
          }
       }
     }


     public void search(String name, String searchType)
     {
       for(Books books:lobj)
       {
          if((books.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(books);
          }
          else if((books.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(books);
          } 
          else if((books.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(books);
          }
          else if((books.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(books);
          }
       }
       

    }

     public void searchA(String name, String searchType)
     {
       for(Books books:lobj)
       {
          if((books.getAuthor().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(books);
          }
          else if((books.getAuthor().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(books);
          } 
          else if((books.getAuthor().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(books);
          }
          else if((books.getAuthor().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(books);
          }
       }
       

    }
}



         


/**

public void searchBook(bName)
    {
       for(Books books:lobj)
       {
          if(books.getName().equalsIgnoreCase(bName));
          {
            System.out.println(books.getName());
          } 
       }

  
  
                System.out.println("|"+books.getBookid()+"|" + "\t" + "|"+books.getName()+"|" + "\t" + "|"+books.getAuthor()+"|" + "\t" + "|"+books.getType()+"|" + "\t" + "|"+books.getSellerName()+"|" + "\t" + "|"+books.getPrice()+"|" + "\t" + "|"+books.getRackNo()+"|");
public void searchAuthor()
    {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the name of author you want to search: ");
       String author = scanner.nextLine();
       booksMonitor.searchBookAuthor(author);

    }
 */