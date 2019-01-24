/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pirana
 */
class User {
    private int Contact_No;
    private String Id,First_Name,Batch,Department,Email;
    
    public User (String Id,String First_Name,String Batch,String Department,int Contact_No,String Email){
        this.Id = Id;
        this.Batch =Batch;
        this.First_Name =First_Name;
        this.Department = Department;
        this.Contact_No = Contact_No;
        this.Email = Email;
    }
    public int getContact_No(){
        return Contact_No;
    }
    public String getId(){
        return Id;
    }
     public String getFirst_Name(){
        return First_Name;
    }
     public String getBatch(){
        return Batch;
    }
     public String getDepartment(){
        return Department;
    }
     public String getEmail(){
        return Email;
    }
    
    
    
    
    
    
}
