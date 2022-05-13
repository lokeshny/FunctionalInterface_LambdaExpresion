/* Assignment on user registration using functional interface and lambada expression
 * RFP assignment
 * @Author: Lokesh n y
 * @date:12.05.2022
 * */
package com.Bridgelab.FunctionalInterface;

/* Creating custom exception class which extends exception */
class InvalidUserDetailsException extends Exception {
    public InvalidUserDetailsException(String message) {
        super(message);
    }
}

/* Creating pojo class for userDetails */
class UserDetails {
    /* Creating object of validator class*/
    Validator validate =  new Validator();

    /* Creating user details variables and making them private*/
    private String fName;
    private String lName;
    private String emailId;
    private String number;
    private String password;

    /* Creating getters and setters for user details variables*/

    public String getfName() {
        return fName;
    }
    public boolean setfName(String fName) throws InvalidUserDetailsException {
        // Validating fName
        if(validate.validateFirstName(fName)) {
            this.fName = fName;
            System.out.println("Valid fName");
            return true;
        } else {
            // Throws an object of user defined exception
            throw new InvalidUserDetailsException("Invalid fName");
        }
    }

    public String getlName() {
        return lName;
    }
    public boolean setlName(String lName) throws InvalidUserDetailsException{
        // Checking lName
        if(validate.validateLastName(lName)) {
            this.lName = lName;
            System.out.println("Valid lName");
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid lName");
        }
    }

    public String getEmailId() {
        return emailId;
    }
    public boolean setEmailId(String emailId) throws InvalidUserDetailsException {
        // Checking emailId
        if(validate.validateEmailId(emailId)) {
            this.emailId = emailId;
            System.out.println("Valid emailId");
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid emailId");
        }
    }

    public String getNumber() {
        return number;
    }
    public boolean setNumber(String number) throws InvalidUserDetailsException{
        // Checking mobile number
        if(validate.validateNumber(number)) {
            this.number = number;
            System.out.println("Valid number");
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid number");
        }
    }

    public String getPassword() {
        return password;
    }
    public boolean setPassword(String password) throws InvalidUserDetailsException{
        // Checking password
        if(validate.validatePassword(password)) {
            this.password = password;
            System.out.println("Valid password");
            return true;
        } else {
            throw new InvalidUserDetailsException("Invalid password");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        // Creating object of user details class
        UserDetails user = new UserDetails();
        // Calling methods
        try {
            user.setfName("Lokesh");
        } catch(InvalidUserDetailsException ex) {
            System.out.println("Exception occured: " + ex);
        }

        try {
            user.setlName("Loki");
        } catch(InvalidUserDetailsException ex) {
            System.out.println("Exception occured: " + ex);
        }

        try {
            user.setEmailId("lokeshny@gmail.com");
        } catch(InvalidUserDetailsException ex) {
            System.out.println("Exception ocuured: " + ex);
        }

        try {
            user.setNumber("91 8277541892");
        } catch(InvalidUserDetailsException ex) {
            System.out.println("Exception occured: " + ex);
        }

        try {
            user.setPassword("Getpasswor@26");
        } catch(InvalidUserDetailsException ex) {
            System.out.println("Exception occured: " + ex);
        }

        System.out.println(user.getfName());
        System.out.println(user.getlName());
        System.out.println(user.getEmailId());
        System.out.println(user.getNumber());
        System.out.println(user.getPassword());
    }
}