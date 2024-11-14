interface RoleDisplay {
    void displayUserRole();
}

abstract class User {
    protected String id;
    protected String name;
    protected String email;
    protected static int userCount = 0;
    protected static String organization = "Kalvium";

    public User() {
        this.id = "Default ID";
        this.name = "Default Name";
        this.email = "Default Email";
        userCount++;
    }

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        userCount++;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + getId());
        System.out.println("User Name: " + getName());
        System.out.println("User Email: " + getEmail());
    }

    public static int getUserCount() {
        return userCount;
    }

    public static String getOrganization() {
        return organization;
    }
}

class Student extends User implements RoleDisplay {
    private String studentId;
    private String major;

    public Student(String id, String name, String email, String studentId, String major) {
        super(id, name, email);
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayUserRole() {
        System.out.println("Role: Student");
    }

    public void displayStudentInfo() {
        displayUserInfo();
        displayUserRole();
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

class Mentor extends User implements RoleDisplay {
    private String mentorId;
    private String expertise;

    public Mentor(String id, String name, String email, String mentorId, String expertise) {
        super(id, name, email);
        this.mentorId = mentorId;
        this.expertise = expertise;
    }

    @Override
    public void displayUserRole() {
        System.out.println("Role: Mentor");
    }

    public void displayMentorInfo() {
        displayUserInfo();
        displayUserRole();
        System.out.println("Mentor ID: " + mentorId);
        System.out.println("Expertise: " + expertise);
    }
}

class Assignment {
    private String id;
    private String title;
    private String description;
    private String dueDate;
    private static int assignmentCount = 0;

    public Assignment(String id, String title, String description, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
        assignmentCount++;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public String getDueDate() {
        return dueDate;
    }

    public static int getAssignmentCount() {
        return assignmentCount;
    }

    public void displayAssignmentInfo() {
        System.out.println("Assignment ID: " + getId());
        System.out.println("Assignment Title: " + getTitle());
        System.out.println("Assignment Description: " + getDescription());
        System.out.println("Assignment Due Date: " + getDueDate());
    }
}

class AssignmentReporter {
    private Assignment assignment;

    public AssignmentReporter(Assignment assignment) {
        this.assignment = assignment;
    }

    public void generateReport() {
        System.out.println("Generating report for assignment:");
        assignment.displayAssignmentInfo();
    }
}

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student("S101", "Abhinav", "abhinav.singh@kalvium.community", "ST101", "Computer Science");
        Mentor mentor1 = new Mentor("M201", "Chandan", "chandan@kalvium.community", "MT201", "OOP Concepts");

        student1.displayStudentInfo();
        mentor1.displayMentorInfo();

        System.out.println("Organization: " + User.getOrganization());
        System.out.println("Total Users: " + User.getUserCount());

        Assignment assignment = new Assignment("K101", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024");
        AssignmentReporter reporter = new AssignmentReporter(assignment);
        reporter.generateReport();
    }
}
