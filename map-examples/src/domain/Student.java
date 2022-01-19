package domain;

public class Student {

    private String id;
    private String studentSince;
    private String firstName;
    private String lastName;
    // 3 most-wanted extra curriculum this student has registered
    private String[] desiredExtraCurriculum;

    public Student(String id, String studentSince, String firstName, String lastName, String[] desiredExtraCurriculum) {
        if(id.isEmpty() || id.isBlank()) {
            throw new IllegalArgumentException("Id must be a valid, non-empty String.");
        }
        /*
        Should also check first and last name
         */
        if(desiredExtraCurriculum.length > 3) {
            throw new IllegalArgumentException("The length of desiredExtraCurriculum cannot exceed 3");
        }

        this.id = id;
        this.studentSince = studentSince;
        this.firstName = firstName;
        this.lastName = lastName;
        this.desiredExtraCurriculum = desiredExtraCurriculum;
    }
}
