import java.lang.*;
import java.util.*;

class StaffMonitor
{
    public LinkedList <Staff> qobj;

     public StaffMonitor()
    {
      qobj = new LinkedList<>();
    }

    public void insertData(int id, String name, String address)
    {
      Staff stobj = new Staff(id, name, address);
      this.insertData(stobj);
    }

    public void insertData(Staff staff)            
    {
        qobj.add(staff);
    }

    public void displayData()
    {
        for(Staff staff:qobj)  
        {
            display(staff); 
        }                                       
    }

    private void display(Staff staff)
    {  
        {
            //System.out.println("--------------------------------------------------------------------------------------------------");
            System.out.println(staff.getId() + "\t" + staff.getName() + "\t" + staff.getAddress() + "\t" + staff.getSalary());
            System.out.println("--------------------------------------------------------------------------------------------------");

        }                                       
    }

    public void search(String name, String searchType)
     {
       for(Staff staff:qobj)
       {
          if((staff.getName().toLowerCase().contains(name.toLowerCase())) && (searchType.equalsIgnoreCase("any")))  // searchType kashyasobat compare kanar aahot te ithe dile i.e any
          {
            display(staff);
          }
          else if((staff.getName().toLowerCase().startsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("startwith")))
          {
             display(staff);
          } 
          else if((staff.getName().toLowerCase().endsWith( name.toLowerCase())) && (searchType.equalsIgnoreCase("endswith")))
          {
             display(staff);
          }
          else if((staff.getName().equalsIgnoreCase( name)) && (searchType.equalsIgnoreCase("equals")))
          {
             display(staff);
          }
       }
     }
}