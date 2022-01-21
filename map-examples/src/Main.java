import domain.Student;

import java.util.HashMap;
import java.util.Map;

public class Main {

    public final String PRESIDENT_VALUE = "President";
    public final String VICE_PRESIDENT_VALUE = "Vice President";
    public final String FINANCIAL_OFFICER_VALUE = "Financial Officer";
    public final String MARKETING_VALUE = "Head of Marketing";
    public final String BOARD_MEMBER_VALUE = "Board Member";

    private void init() {
        System.out.println("Main initiated");

        var student1 = new Student("S-0461", "2017-08-14", "Aisha", "Swan");
        var student2 = new Student("S-0589", "2019-08-19", "Madiha", "Fuentes");
        var student3 = new Student("S-0599", "2019-08-19", "Ralphie", "Clark");
        var student4 = new Student("S-0412", "2017-08-14", "Hugo", "Forrest");

        Map<String, Student> studentOrganizationStructure = new HashMap<>();
        studentOrganizationStructure.put(PRESIDENT_VALUE, student2);
        studentOrganizationStructure.put(VICE_PRESIDENT_VALUE, student1);
        studentOrganizationStructure.put(FINANCIAL_OFFICER_VALUE, student3);
        studentOrganizationStructure.put(BOARD_MEMBER_VALUE, student4);
        studentOrganizationStructure.put(MARKETING_VALUE, student1); // same value, different keys

        studentOrganizationStructure.forEach((k, v) -> System.out.println(k + ": " + v.getFullName()));
    }

    public static void main(String[] args) {
        new Main().init();
    }
}
