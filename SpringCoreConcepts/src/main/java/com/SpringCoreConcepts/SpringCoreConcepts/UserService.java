package com.SpringCoreConcepts.SpringCoreConcepts;

public class UserService {
    MySQLDatabase mySQLDatabase = new MySQLDatabase();
    public void saveUser(String user){
        System.out.println("User service is saving user");
        mySQLDatabase.saveToDB(user);

    }
}
