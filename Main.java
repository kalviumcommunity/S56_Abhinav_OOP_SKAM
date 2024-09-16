abstract class Report {

    protected String reportId;
    protected String reportTitle;

    public Report() {
        // Default constructor
        this.reportId = "Default Report ID";
        this.reportTitle = "Default Report Title";
    }

    public Report(String reportId, String reportTitle) {
        // Parameterized constructor
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
        // Default constructor
        super();
        this.assignmentDetails = "Default Assignment Details";
    }

    public AssignmentReport(String reportId, String reportTitle, String assignmentDetails) {
        // Parameterized constructor
        super(reportId, reportTitle);
        this.assignmentDetails = assignmentDetails;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating report for assignment: " + assignmentDetails);
    }
}

class User {
    private String id;
    private String name;
    private String email;
    private static int userCount = 0;
    private static String organization = "Kalvium";

    // Default constructor
    public User() {
        this.id = "Default ID";
        this.name = "Default Name";
        this.email = "Default Email";
        userCount++;
    }

    // Parameterized constructor
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
}

class Assignment {
    private String id;
    private String title;
    private String description;
    private String dueDate;
    private static int assignmentCount = 0;

    // Default constructor
    public Assignment() {
        this.id = "Default Assignment ID";
        this.title = "Default Title";
        this.description = "Default Description";
        this.dueDate = "Default Due Date";
        assignmentCount++;
    }

    // Parameterized constructor
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

    public void displayAssignmentInfo() {
        System.out.println("Assignment ID: " + getId());
        System.out.println("Assignment Title: " + getTitle());
        System.out.println("Assignment Description: " + getDescription());
        System.out.println("Assignment Due Date: " + getDueDate());
        System.out.println();
    }

    public static int getAssignmentCount() {
        return assignmentCount;
    }
}

public class Main {
    public static void main(String[] args) {
        //default constructors
        User defaultUser = new User();
        defaultUser.displayUserInfo();

        Assignment defaultAssignment = new Assignment();
        defaultAssignment.displayAssignmentInfo();

        AssignmentReport defaultReport = new AssignmentReport();
        defaultReport.displayReportDetails();
        defaultReport.generateReport();

        //parameterized constructors
        User[] users = {
                new User("S101", "Abhinav", "abhinav.singh@kalvium.community"),
                new User("S102", "Ayush Ghodke", "ayush.ghodke@kalvium.community")
        };

        Assignment[] assignments = {
                new Assignment("K101", "EPS Assignment", "Write a case study report on Sri Lanka Bankruptcy", "30-08-2024"),
                new Assignment("K102", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024")
        };

        for (User user : users) {
            user.displayUserInfo();
        }

        for (Assignment assignment : assignments) {
            assignment.displayAssignmentInfo();
        }

        AssignmentReport report = new AssignmentReport("R101", "OOP Assignment Report", "Details of the OOP Assignment");
        report.displayReportDetails();
        report.generateReport();

        System.out.println("Organization: " + User.getOrganization());
        System.out.println("Total Users: " + User.getUserCount());
        System.out.println("Total Assignments: " + Assignment.getAssignmentCount());
    }
}
