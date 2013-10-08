/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package bookcompany;
import java.sql.*;

/**
 *
 * @author user
 */
public class Customer extends Person {
    
    private String Address;
    private String Phone;
   
    public void setAddress(String ad)
    {
        Address = ad;
    }
    
    public void setPhone(String ph)
    {
        Phone = ph;
    }
    
    public String getAddress()
    {
        return Address ;
    }
    
    public String getPhone()
    {
        return Phone;
    }
    /*
    * Purpose: To add the record for the customer   
    * Input  : Connection
    * Output : String
    * Getting Values: FName, LName, Age, Address, Phone
    * Setting Values: None
    */
    public String add(Connection con)
    {
        //Try block for Exceptions
        try {
            //creation of Statement object from the connection
            Statement S = con.createStatement();
            //initialization of variable n which is used as pointer to ID lists
            int n = 0;
            //SQL string for insert to Person Table
            String Query = "INSERT INTO Person (FName, LName, Age) VALUES ('" + getFName() + "', '"+ getLName() + "', "+ getAge() + ")";
            //execution of above SQL query
            S.executeUpdate(Query);
            
            //SQL Query to select the ID's
            Query = "SELECT ID FROM PERSON";
            //Execute to get all ID's from Person Table
            ResultSet rs = S.executeQuery(Query);
            //While loop to iterate through the resultset
            while (rs.next()){
                //Retrieve ID's from the result set
               n = rs.getInt("ID");
            }
            //Query to insert data into the Customer Table using the last retrieved ID
            Query = "INSERT INTO Customer VALUES ('" + Address + "', '"+ Phone + "' ," + n +")";
            //Execution of the Insert Statement
            S.executeUpdate(Query);
            
            //Return message for success
            return "The Customer Has Been Added";
            
       }
        //Catch block to catch for all Exceptions(super-class)
        catch (Exception e)
       {
           //String to store the Error e
           String Error = "Error " + e;
           //Returning the error string
           return Error;
           //return "Null Pointer Exception raised";
       }           
    }  
    /*
    * Purpose: To update the record for the customer   
    * Input  : Connection
    * Output : String
    * Getting Values: ID, FName, LName, Age, Address, Phone
    * Setting Values: None
    */
    public String update(Connection con)
    {
        try {
            //Creation of Statement Object
            Statement S = con.createStatement();
            String Query;
            
            //Update query for Person table
            Query = "UPDATE Person SET FName = '" + getFName() + "', LName = '" + getLName() + "', Age = " + getAge()+ " WHERE ID = " + getID() ;
            S.executeUpdate(Query);    
            
            //Update query for Customer table
            Query = "UPDATE Customer SET Address = '" + Address + "', Phone = '" + Phone + "' WHERE ID = " + getID() ;
            S.executeUpdate(Query);
            
            return "The Record Was Updated";
       }catch (Exception e)
       {
           String Error = "Error: " + e;
           return Error;
       }
    }
    /*
    * Purpose: To search for the records for the passed ID    
    * Input  : Connection
    * Output : String
    * Getting Values: ID
    * Setting Values: FName, LName, Age, Address, Phone
    */
    public String find(Connection con)
    { 
        try {
            Statement S = con.createStatement();
            String Query;
            ResultSet rs;
            
            //Select statement to get values that match the ID            
            Query = "SELECT * FROM Person WHERE ID = " + getID() + " ;" ;
            rs = S.executeQuery(Query);  
            //Iterate through the resultset to set the retrieved data
            while (rs.next())
            {
                setFName(rs.getString("FName"));
                setLName(rs.getString("LName"));
                setAge(rs.getInt("Age"));
            }
            
            Query = "SELECT * FROM Customer WHERE ID = " +getID() ;
            rs = S.executeQuery(Query);
            while (rs.next())
            {
                Address = rs.getString("Address");
                Phone = rs.getString("Phone");
            }
            
            return "The Above Record Was Found";
       }catch (Exception e)
       {
           String Error = "Error: " + e;
           return Error;
       }
    }
    /*
    * Purpose: To delete the record for the customer   
    * Input  : Connection
    * Output : String
    * Getting Values: ID
    * Setting Values: None
    */    
    public String delete(Connection con)
    {
        try {
            Statement S = con.createStatement();
            String Query;
            
            Query = "DELETE FROM Customer WHERE ID = " + getID();
            S.executeUpdate(Query);    
           
            Query = "DELETE FROM Person WHERE ID = " + getID();
            S.executeUpdate(Query);
            
            return "The Record Was Deleted";
       }catch (Exception e)
       {
           String Error = "Error: " + e;
           return Error;
       }
    }
   
    public void createNewOrder()
           {;}
    public void showAllOrders()
           {;}
}
