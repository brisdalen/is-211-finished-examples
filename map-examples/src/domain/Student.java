package domain;

public class Student {

    private String id;
    private String studentSince;
    private String firstName;
    private String lastName;

    public Student(String id, String studentSince, String firstName, String lastName) {
        if(id.isEmpty() || id.isBlank()) {
            throw new IllegalArgumentException("Id must be a valid, non-empty String.");
        }
        /*
        Should also check first and last name, but cba right now
         */

        this.id = id;
        this.studentSince = studentSince;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public String getFullName() {
        return String.format("%s, %s", lastName, firstName);
    }
}
