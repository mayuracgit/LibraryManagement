import java.lang.*;
import java.util.*;

class Staff
{
    private int id;
    private String name;
    private String address;
    private int salary;
   

    public Staff(int id, String name, String address)    
    {
        this.id = id;
        this.name = name; 
        this.address = address;    
    }

    public void setId(int id)
    {
       this.id = id;
    }

    public int getId()
    {
         return id;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getName()
    {
         return name;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getAddress()
    {
         return address;
    }

    public void setSalary(int salary)
    {
        this.salary = salary;
    }

    public int getSalary()
    {
         return salary;
    }

}