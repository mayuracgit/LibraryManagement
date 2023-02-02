import java.util.*;
import java.io.*;
   
public class Library
{
     BooksMonitor booksMonitor = new BooksMonitor();                                    //aplyala lagnarya sarv class class che object create karun ghetle.
     SubscriberMonitor subscriberMonitor = new SubscriberMonitor();                     
     SubscriptionMonitor subscriptionMonitor = new SubscriptionMonitor();
     StaffMonitor staffMonitor = new StaffMonitor();
     SellerMonitor sellerMonitor = new SellerMonitor();
     DueMonitor dueMonitor = new DueMonitor();
     PlaceMonitor placeMonitor = new PlaceMonitor();                                 
    
          
    public static void main(String arg[]) throws IOException
    { 
       boolean flag = true;
       Library library = new Library();
       Scanner scanner = new Scanner(System.in);

     while(flag)
     {
       System.out.println("Enter the choice :\n 1--> To insert data\n 2--> To display data\n 3--> Search\n 4-->Exit");
       int choice = library.getInt();

       if(choice == 4)
       {
          flag = false; 
       }
       else
       {

       switch(choice)                
        {
            case 1:
                   library.switchcaseInsert();         
            break;

            case 2:
                   library.switchcaseDisplay();
            break; 

            case 3:
                   library.search();
            break;
               
            default:
                System.out.println("Invalid choice\n");          
        }
       }
     }
    }

    public int getInt()
    {
       Scanner scanner = new Scanner(System.in);
      // System.out.println("Enter book Id:");
                   int intValue ;                  //ithe jr apan value initialize keli tr tch value display table madhe disnar. so ithli value kadhun kakli.

                   try{
                     intValue = scanner.nextInt();
                     scanner.nextLine();        // Aadhychya input cha data save asel tr to cleare karta yava mhanun                   
                     //Alternate option to read int value
                    // intValue = Integer.parseInt(scanner.nextLine());
                   }
                   catch(Exception e)
                   {
                     System.out.println("Please enter correct interger value.\n");
                     intValue = getInt();          //input dileli value incorrect asli tr correct value takta yavi yasathi recurssion use kela aahe.
                   }                                      //intValue = integerInput(); yamule apn dileli new value initialize honar deafilt value janar nahi.
                   return intValue;
    }

//var apan try catch use kela aahe karan jr mi input value integer dili nahi tr tr program  terminate hot hota.
//to compile time error navata but runtime error hota tyala apan exception asa mhnto. 
// for ex. jr bookId integer value takla nahi tr exception yet hota.
//mg apan jya thikani input integer aahe tithe try and catch use karav lagel.
//pratyek thikani asa karav lagu naye mhanun apnn getInt() hi method create keli and garaj asel tithe ti call keli.

    public void switchcaseInsert()
    {   
     boolean flag = true;
     while(flag)
     {
       Scanner scanner = new Scanner(System.in);
       System.out.println("Enter the choice to insert data into:\n 1--> book information\n 2--> subscriber information\n 3--> subscription information\n 4--> staff information\n 5--> seller information\n 6--> dues information\n 7-->place information\n 8--> Exit");
       int choice = getInt();

       if(choice == 8)
       {
          flag = false; 
       }
       else
       {

       switch(choice)                 // ithe apan ji choice input getoy tich dyaychi aste.
        {
            case 1:
                   System.out.println("Enter book Id:");

                   int bookId = this.getInt();                  //ithe apn ji value return kartoy throuh getInt() ti apn bookId la dili.
                   System.out.println("Enter book name:");
                   String bookName = scanner.nextLine();
                   System.out.println("Enter book author:");
                   String authrName = scanner.nextLine(); 
                   System.out.println("Enter book type:");
                   String bookType = scanner.nextLine();
                   System.out.println("Enter seller name:");
                   String sellerNameB = scanner.nextLine();
                   System.out.println("Enter book price:");
                   int price = this.getInt();
                   System.out.println("Enter rack number:");
                   int rackNoB = this.getInt();
                   booksMonitor.insertData(bookId,bookName,authrName,bookType,sellerNameB,price,rackNoB);
               
            break;

            case 2:
              
                   System.out.println("Enter subscriber Id:");
                   int subscriberId = getInt();
                   System.out.println("Enter subscriber name:");
                   String name = scanner.nextLine();
                   System.out.println("Enter subceiption period:");
                   String subscription = scanner.nextLine(); 
                   subscriberMonitor.insertData(subscriberId,name,subscription);
              
            break; 

            case 3:
                   System.out.println("Enter subscriber Id:");
                   int subscriberId1 = getInt();
                   System.out.println("Enter subsciption :");
                   String subscriptionName = scanner.nextLine();
                   System.out.println("Enter subscription fees :");
                   int fees = getInt();
                   subscriptionMonitor.insertData(subscriberId1,subscriptionName,fees);
            break; 

            case 4:
                   System.out.println("Enter staff Id:");
                   int staffId = this.getInt();
                   System.out.println("Enter staff name:");
                   String staffName = scanner.nextLine();
                   System.out.println("Enter staff Address:");
                   String staffAddress = scanner.nextLine();
                   staffMonitor.insertData(staffId, staffName, staffAddress);
            break; 

            case 5:
                   System.out.println("Enter seller Id:");
                   int sellerId = getInt();
                   System.out.println("Enter seller name:");
                   String sellerName = scanner.nextLine();
                   sellerMonitor.insertData(sellerId,sellerName);
            break; 

            case 6:
                   System.out.println("Enter subscriber Id:");
                   int subscriberIdDue = this.getInt();
                   System.out.println("Enter subscriber name:");
                   String subscrierNameDue = scanner.nextLine();
                   System.out.println("Enter amount fined:");
                   int fined = getInt();
                   dueMonitor.insertData(subscriberIdDue, subscrierNameDue, fined);

            break; 

            case 7:
                   System.out.println("Enter book Id:");
                   int bookIdPlace = getInt();
                   System.out.println("Enter book name:");
                   String bookNamePlace = scanner.next();
                   System.out.println("Enter rack number:");
                   int rackNo = getInt();
                   placeMonitor.insertData(bookIdPlace, bookNamePlace, rackNo);
            break; 

            case 8:
               break;
               
            default:
                System.out.println("Invalid choice\n");        
                
        }
       }
     }
    }

    public void switchcaseDisplay()
    {  
     boolean flag = true;
     while(flag)
     {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the choice to Display:\n 1--> book information\n 2--> subscriber information\n 3--> subscription information\n 4--> staff information\n 5--> seller information\n 6--> dues information\n 7--> place information\n  8--> Exit");
        int choice = getInt();

       if(choice == 8)
       {
          flag = false; 
       }
       else
       {

        switch(choice)                 // ithe apan ji choice input getoy tich dyaychi aste.
        {
            case 1: 
                   booksMonitor.displayData();
            break;

            case 2:
                   subscriberMonitor.displayData();
            break; 

            case 3:
                   subscriptionMonitor.displayData();
            break; 

            case 4:
                   staffMonitor.displayData();
            break; 

            case 5:
                   sellerMonitor.displayData();
            break; 

            case 6:
                   dueMonitor.displayData();
            break; 

            case 7:
                   placeMonitor.displayData();
            break;

            case 8:
               break;

            default:
                System.out.println("Invalid choice\n");        
                  
        }
       }
     }
    }

    public void search()
    {

     boolean flag = true;
     while(flag)
     {
       Scanner scanner = new Scanner(System.in);
      
        System.out.println( "Enter the data you want to search:\n A--> Search book and author\n B--> Search subscriber\n C--> Search seller\n D--> Search staff\n E--> Search place \n F--> Search due\n G--> Search subscription\n H--> Exit\n");
        String choice = scanner.nextLine();
        
        if(choice.equals("H"))
       {
          flag = false; 
       }
       else
       {
        switch(choice)                
        {
           case "A":
             {
              System.out.println("To search book and author:\n");
              System.out.println("Enter the choice to Search:\n \n BOOK \n 1--> book name by start \n 2--> book name by end\n 3--> full book name \n 4--> book name by any character\n \n Author \n 5--> Author name by start \n 6--> Author name by end\n 7--> Author full name \n 8--> Author name by any character\n");
              int select = getInt();                             ///// ithe exception hadling chi method call keli.

              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1:
                            booksMonitor.search(data, "startwith");  //apn searchtype dila compare karnyasathi
                     break;

                     case 2:
                            booksMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            booksMonitor.search(data, "equals");
                     break; 

                     case 4:
                            booksMonitor.search(data, "any");
                     break;

                     case 5: 
                            booksMonitor.searchA(data);  
                     break;

                     case 6:
                            booksMonitor.searchB(data);
                     break; 

                     case 7:
                            booksMonitor.searchC(data);
                     break; 

                     case 8:
                            booksMonitor.searchD(data);
                     break;

                     default:
                            System.out.println("Invalid choice\n");
              }
             }
          break;

          case "B":
            {
              System.out.println("To search subscriber:\n");
              int select1 = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select1)
              {
                     case 1: 
                            subscriberMonitor.search(data, "startwith");  //apn searchtype dila compare karnyasathi
                     break;

                     case 2:
                            subscriberMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            subscriberMonitor.search(data, "equals");
                     break; 

                     case 4:
                            subscriberMonitor.search(data, "any");
                     break;

              }
            }
          break;

          case "C":
            {
              System.out.println("To search seller:\n");
              int select = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1: 
                            sellerMonitor.search(data, "startwith");  
                     break;

                     case 2:
                            sellerMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            sellerMonitor.search(data, "equals");
                     break; 

                     case 4:
                            sellerMonitor.search(data, "any");
                     break;


              }
            }
          break;

          case "D":
            {
              System.out.println("To search staff:\n");
              int select = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1: 
                            staffMonitor.search(data, "startwith");  
                     break;

                     case 2:
                            staffMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            staffMonitor.search(data, "equals");
                     break; 

                     case 4:
                            staffMonitor.search(data, "any");
                     break;

              }
            }
          break;

          case "E":
            {
              System.out.println("To search place:\n");
              int select = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1: 
                            placeMonitor.search(data, "startwith");  
                     break;

                     case 2:
                            placeMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            placeMonitor.search(data, "equals");
                     break; 

                     case 4:
                            placeMonitor.search(data, "any");
                     break;
              }
            }
          break;

          case "F":
            {
              System.out.println("To search dues:\n");
              int select = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1: 
                            dueMonitor.search(data, "startwith");  
                     break;

                     case 2:
                            dueMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            dueMonitor.search(data, "equals");
                     break; 

                     case 4:
                            dueMonitor.search(data, "any");
                     break;
              }
            }
          break;

          case "G":
              System.out.println("To search palce:\n");
              int select = getInt();
              
              System.out.println("Enter the data you want to search: ");
              String data = scanner.nextLine();
              switch(select)
              {
                     case 1:
                            subscriptionMonitor.search(data, "startwith");
                     break;

                     case 2:
                            subscriptionMonitor.search(data, "endswith");
                     break; 

                     case 3:
                            subscriptionMonitor.search(data, "equals");
                     break; 

                     case 4:
                            subscriptionMonitor.search(data, "any");
                     break;
              }
          break;

          default:
              System.out.println("Invalid choice\n");
        }
       }
     }
    }
}