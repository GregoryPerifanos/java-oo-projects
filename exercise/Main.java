package gr.aueb.cf.exercise;

import gr.aueb.cf.exercise.User;
import gr.aueb.cf.exercise.userCredentials;

public class Main {
    public static void main(String[] args) {
        User userOne = new User(1, "Grigoris", "Perifanos");
        userCredentials userOneCredentials = new userCredentials(1, "GrigPer", "1223SSd");

        System.out.println(userOne.getId() + "," + userOne.getFristName() + "," + userOne.getLastname());
        System.out.println(userOneCredentials.getId() + "," + userOneCredentials.getFirstname() + "," + userOneCredentials.getPassword());
    }
}
