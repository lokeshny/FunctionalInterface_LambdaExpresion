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
    private String fName;
    private String lName;

    /* Creating getters and setters for user details variables*/

    public String getfName() {
        return fName;
    }

    public void setfName(String fName) {
        // Validating fName
        if(validate.validateFirstName(fName)) {
            this.fName = fName;
        } else {
            System.out.println("Invalid fName");
        }
    }

    public String getlName() {
        return lName;
    }

    public void setlName(String lName) {
        // Checking lName
        if(validate.validateLastName(lName)) {
            this.lName = lName;
        } else {
            System.out.println("Invalid lName");
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

        System.out.println(user.getfName());
        System.out.println(user.getlName());
    }
}
