package gr.aueb.cf.exercise.bank.model;

public final class Holder {
    private Long id;
    private String firstname;
    private String lastname;
    private String ssn;

    public Holder() {
        id = 0L;
        firstname = " ";
        lastname = " ";
        ssn = " ";
    }

    public Holder(Long id, String firstname, String lastname, String ssn) {
        this.id = id;
        this.firstname = firstname;
        this.lastname = lastname;
        this.ssn = ssn;
    }

    public Holder(String janeSmith) {
    }

    public Long getId() {
        return id;
    }

    public String getFirstname() {
        return firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public String getSsn() {
        return ssn;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public String convertToString() {
        return id + ", " + firstname + ", " + lastname + ", " + ssn;
    }

}

