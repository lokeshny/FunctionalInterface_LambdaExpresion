/* Assignment on user registration using functional interface and lambada expression
 * RFP assignment
 * @Author: Lokesh n y
 * @date:12.05.2022
 * */
package com.Bridgelab.FunctionalInterface;

class UserDetails {
    /* Creating object of validator class*/
    Validator validate =  new Validator();

    /* Creating user details variables and making them private*/
    private String F_Name;
    private String L_Name;
    private String emailId;

    /* Creating getters and setters for user details variables*/

    public String getfName() {
        return F_Name;
    }

    public void setfName(String fName) {
        // Validating fName
        if(validate.validateFirstName(fName)) {
            this.F_Name = fName;
        } else {
            System.out.println("Invalid fName");
        }
    }

    public String getlName() {
        return L_Name;
    }

    public void setlName(String lName) {
        // Checking lName
        if(validate.validateLastName(lName)) {
            this.L_Name = lName;
        } else {
            System.out.println("Invalid lName");
        }
    }

    public String getEmailId() {
        return emailId;
    }

    public void setEmailId(String emailId) {
        // Checking emailId
        if(validate.validateEmailId(emailId)) {
            this.emailId = emailId;
        } else {
            System.out.println("Invalid emailId");
        }
    }
}
public class Main {
    public static void main(String[] args) {
        // Creating object of user details class
        UserDetails user = new UserDetails();
        // Calling methods
        user.setfName("Lokesh");
        user.setlName("NY");
        user.setEmailId("lokeshny97@gamil.com");

        System.out.println(user.getfName());
        System.out.println(user.getlName());
        System.out.println(user.getEmailId());
    }
}
