

Page
1
of 3
package debuggingec;
import java.util.List;
/**
 *
 * @author Kevin Jang
 */
public class BankObject {
    public  int age;
    public  String job;
    public  String marriageStatus;
    public  String education;
    public  boolean defaulted;
    public  double balance;
    public  boolean housing;
    public  boolean loan;
    public  boolean subscribed;
    public  int size;
   
    
    BankObject(List data){
        try{
            if(data.size() == 9){
                this.age = Integer.parseInt(data.get(0).toString());
                this.job = data.get(1).toString();
                this.marriageStatus = data.get(2).toString();
                this.education = data.get(3).toString();
                this.defaulted = data.get(4).toString().equalsIgnoreCase("yes");
                this.balance = Double.parseDouble(data.get(5).toString());
                this.housing = data.get(6).toString().equalsIgnoreCase("yes");
                this.loan = data.get(7).toString().equalsIgnoreCase("yes");
                this.subscribed = data.get(8).toString().equalsIgnoreCase("yes");
                this.size = 9;
                
                
            }
        } catch(NumberFormatException e){
            System.out.println("Wrong array size.");
            e.printStackTrace();
        }
            
    }
    //@Getters 
    public int getAge(){
        return this.age;
    }
    
    public String getJob(){
        return this.job;
    }
    
    public String getMarriageStatus(){
        return this.marriageStatus;
    }
    
    public String getEducation(){
        return this.education;
    }
    
    public boolean getDefaulted(){
        return this.defaulted;
    }
    
    public Double getBalance(){
        return this.balance;
    }
    
    public boolean getHousing(){
        return this.housing;
    }
    
    public boolean getLoan(){
        return this.loan;
    }
    
    public boolean getSubscribed(){
        return this.subscribed;
    }
    
    public int getSize(){
        return this.size;
    }
    
    //@Setters
    public void setAge(int age_Param){
        set.age = age_Param;
    }
    
    public void setJob(String job_Param){
        set.job = job_Param;
    }
    
    public void setMarriageStatus(String marriage_Param){
        set.marriageStatus = marriage_Param;
    }
    
    public void setEducation(String education_Param){
        set.education = education_Param;
    }
    
    public void setDefauled(String defaulted_Param){
        set.defaulted = defaulted_Param.equalsIgnoreCase("yes");
    }
    
    public void setBalance(Double balance_Param){
        set.balance = balance_Param;
    }
    
    public void setHousing(String housing_Param){
        set.housing = housing_Param.equalsIgnoreCase("yes");
        
    }
    
    public void setLoan(String loan_Param){
        set.loan = loan_Param.equalsIgnoreCase("yes");
    }
    
    public void setSubscribed(String subscribed_Param){
        set.subscribed = subscribed_Param.equalsIgnoreCase("yes");        
    }
    
    public double toDouble(int number){
        double returnValue = number;
        return returnValue;
    }
    @Override
    public String toString(){
        return "[Age: " + this.age + ", Job: " + this.job + ", Education: " + 
this.education + ", Defaulted: " + this.defaulted + ", Balance: " + this.balance + 
", Housing: " + this.housing + ", Loan: " + this.loan + ", Subscribed: " + 
this.subscribed + "]";
    }
    
    
}
