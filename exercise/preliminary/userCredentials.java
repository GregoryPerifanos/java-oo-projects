package gr.aueb.cf.exercise.preliminary;

public class userCredentials {
    private long id;
    private String firstname;
    private String password;


    //Constructor
    public userCredentials(){}

    //Overloaded Constructor
    public userCredentials(long id, String firstname, String password) {
        this.id = id;
        this.firstname = firstname;
        this.password = password;
    }
    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


}
