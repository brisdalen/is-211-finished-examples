import domain.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

    private void init() {
        System.out.println("Main initiated");

        var student1 = new Student("S-0001", "2017-08-14", "Aisha", "Swan", new String[]{""})

        Map<String, Student> studentOrganizationStructure = new HashMap<>();
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
