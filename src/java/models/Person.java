
package models;

import java.io.Serializable;

/**
 *
 * @author Rahul Bisht
 */
public class Person implements Serializable 
      
{
    private String firstname;
    private String lastname;
    
    //default constructor
    public Person()
    {
        firstname = "";
        lastname = "";
        
    }
    
    //another ocnstructor
    public Person(String firstname, String lastname)
    {
        this.firstname = firstname;
        this.lastname = lastname;
    }
    
    //getters and setters alt+insert

    public String getFirstname()
    {
        return firstname;
    }
    
    public void setFirstname(String firstname)
    {
        this.firstname = firstname;
    }
    
    public String getLastname()
    {
        return lastname;
    }
    
    public void setLastname()
    {
       this.lastname = lastname;
    }
    
    
    
}
