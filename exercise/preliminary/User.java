package gr.aueb.cf.exercise.preliminary;

public class User {
    private long id;
    private String fristName;
    private String lastname;

    public User(){}

    public User(long id, String fristName, String lastname) {
        this.id = id;
        this.fristName = fristName;
        this.lastname = lastname;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getFristName() {
        return fristName;
    }

    public void setFristName(String fristName) {
        this.fristName = fristName;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }
}
