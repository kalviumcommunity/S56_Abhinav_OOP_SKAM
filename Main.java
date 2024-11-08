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
        System.out.println();
    }

    public static int getUserCount() {
        return userCount;
    }

    public static String getOrganization() {
        return organization;
    }

    // Abstract method (Virtual Function) to be implemented by subclasses
    public abstract void displayUserRole();
}

class Student extends User {
    private String studentId;
    private String major;

    public Student() {
        super();
        this.studentId = "Default Student ID";
        this.major = "Default Major";
    }

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
        System.out.println();
    }
}

class Mentor extends User {
    private String mentorId;
    private String expertise;

    public Mentor() {
        super();
        this.mentorId = "Default Mentor ID";
        this.expertise = "Default Expertise";
    }

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
        System.out.println();
    }
}


abstract class Report {
    protected String reportId;
    protected String reportTitle;

    public Report() {
        this.reportId = "Default Report ID";
        this.reportTitle = "Default Report Title";
    }

    public Report(String reportId, String reportTitle) {
        this.reportId = reportId;
        this.reportTitle = reportTitle;
    }

    public abstract void generateReport();

    public void displayReportDetails() {
        System.out.println("Report ID: " + reportId);
        System.out.println("Report Title: " + reportTitle);
    }
}

class AssignmentReport extends Report {
    private String assignmentDetails;

    public AssignmentReport() {
        super();
        this.assignmentDetails = "Default Assignment Details";
    }

    public AssignmentReport(String reportId, String reportTitle, String assignmentDetails) {
        super(reportId, reportTitle);
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for assignment: " + assignmentDetails);
    }
}

class Assignment {
    private String id;
    private String title;
    private String description;
    private String dueDate;
    private static int assignmentCount = 0;

    public Assignment() {
        this.id = "Default Assignment ID";
        this.title = "Default Title";
        this.description = "Default Description";
        this.dueDate = "Default Due Date";
        assignmentCount++;
    }

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

    public void setDueDate(String dueDate) {
        this.dueDate = dueDate;
    }

    // original method
    public void displayAssignmentInfo() {
        System.out.println("Assignment ID: " + getId());
        System.out.println("Assignment Title: " + getTitle());
        System.out.println("Assignment Description: " + getDescription());
        System.out.println("Assignment Due Date: " + getDueDate());
        System.out.println();
    }

//method overloading
    public void displayAssignmentInfo(boolean showDueDate) {
        System.out.println("Assignment ID: " + getId());
        System.out.println("Assignment Title: " + getTitle());
        System.out.println("Assignment Description: " + getDescription());
        if (showDueDate) {
            System.out.println("Assignment Due Date: " + getDueDate());
        }
        System.out.println();
    }

    public static int getAssignmentCount() {
        return assignmentCount;
    }
}


public class Main {
    public static void main(String[] args) {
//        Student student1 = new Student("S101", "Abhinav", "abhinav.singh@kalvium.community", "ST101", "Computer Science");
//        Mentor mentor1 = new Mentor("M201", "Chandan", "chandan@kalvium.community", "MT201", "OOP Concepts");
//
//        student1.displayStudentInfo();
//        mentor1.displayMentorInfo();
//
//        AssignmentReport defaultReport = new AssignmentReport();
//        defaultReport.displayReportDetails();
//        defaultReport.generateReport();
//
//        AssignmentReport report = new AssignmentReport("R101", "OOP Assignment Report", "Details of the OOP Assignment");
//        report.displayReportDetails();
//        report.generateReport();
//
//        Assignment defaultAssignment = new Assignment();
//        defaultAssignment.displayAssignmentInfo();
//
//        Assignment[] assignments = {
//                new Assignment("K101", "EPS Assignment", "Write a case study report on Sri Lanka Bankruptcy", "30-08-2024"),
//                new Assignment("K102", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024")
//        };
//
//        for (Assignment assignment : assignments) {
//            assignment.displayAssignmentInfo();
//        }

        Student student1 = new Student("S101", "Abhinav", "abhinav.singh@kalvium.community", "ST101", "Computer Science");
        Mentor mentor1 = new Mentor("M201", "Chandan", "chandan@kalvium.community", "MT201", "OOP Concepts");

        student1.displayStudentInfo();
        mentor1.displayMentorInfo();

        System.out.println("Organization: " + User.getOrganization());
        System.out.println("Total Users: " + User.getUserCount());

    }
}