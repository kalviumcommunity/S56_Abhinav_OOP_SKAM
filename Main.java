interface Report {
    void generateReport();
}

class BasicAssignmentReport implements Report {
    private Assignment assignment;

    public BasicAssignmentReport(Assignment assignment) {
        this.assignment = assignment;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating a basic report for assignment:");
        assignment.displayAssignmentInfo();
    }
}

class DetailedAssignmentReport implements Report {
    private Assignment assignment;

    public DetailedAssignmentReport(Assignment assignment) {
        this.assignment = assignment;
    }

    @Override
    public void generateReport() {
        System.out.println("Generating a detailed report for assignment:");
        assignment.displayAssignmentInfo();
        System.out.println("Additional report details...");
    }
}

interface Role {
    void displayRoleInfo();
}

class StudentRole implements Role {
    private String studentId;
    private String major;

    public StudentRole(String studentId, String major) {
        this.studentId = studentId;
        this.major = major;
    }

    @Override
    public void displayRoleInfo() {
        System.out.println("Role: Student");
        System.out.println("Student ID: " + studentId);
        System.out.println("Major: " + major);
    }
}

class MentorRole implements Role {
    private String mentorId;
    private String expertise;

    public MentorRole(String mentorId, String expertise) {
        this.mentorId = mentorId;
        this.expertise = expertise;
    }

    @Override
    public void displayRoleInfo() {
        System.out.println("Role: Mentor");
        System.out.println("Mentor ID: " + mentorId);
        System.out.println("Expertise: " + expertise);
    }
}

abstract class User {
    protected String id;
    protected String name;
    protected String email;
    protected Role role;

    public User(String id, String name, String email, Role role) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.role = role;
    }

    public void displayUserInfo() {
        System.out.println("User ID: " + id);
        System.out.println("User Name: " + name);
        System.out.println("User Email: " + email);
        if (role != null) {
            role.displayRoleInfo();
        }
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
    private Report report;

    public AssignmentReporter(Report report) {
        this.report = report;
    }

    public void generateReport() {
        report.generateReport();
    }
}

class Task {
    private String taskId;
    private String taskName;
    private String description;
    private String status;
    private User assignedUser;

    public Task(String taskId, String taskName, String description, String status) {
        this.taskId = taskId;
        this.taskName = taskName;
        this.description = description;
        this.status = status;
    }

    public void assignTask(User user) {
        this.assignedUser = user;
        System.out.println("Task '" + taskName + "' assigned to " + user.name);
    }

    public void updateTaskStatus(String newStatus) {
        this.status = newStatus;
        System.out.println("Task '" + taskName + "' status updated to " + newStatus);
    }

    public void displayTaskInfo() {
        System.out.println("Task ID: " + taskId);
        System.out.println("Task Name: " + taskName);
        System.out.println("Task Description: " + description);
        System.out.println("Task Status: " + status);
        if (assignedUser != null) {
            System.out.println("Assigned to: " + assignedUser.name);
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Role studentRole = new StudentRole("ST101", "Computer Science");
        Role mentorRole = new MentorRole("MT201", "OOP Concepts");

        User student1 = new User("S101", "Abhinav", "abhinav.singh@kalvium.community", studentRole) {};
        User mentor1 = new User("M201", "Chandan", "chandan@kalvium.community", mentorRole) {};

        student1.displayUserInfo();
        mentor1.displayUserInfo();

        Assignment assignment = new Assignment("K101", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024");

        Report basicReport = new BasicAssignmentReport(assignment);
        Report detailedReport = new DetailedAssignmentReport(assignment);

        AssignmentReporter basicReporter = new AssignmentReporter(basicReport);
        basicReporter.generateReport();

        AssignmentReporter detailedReporter = new AssignmentReporter(detailedReport);
        detailedReporter.generateReport();

        Task task1 = new Task("T101", "Task 1", "Implement the core features", "Not Started");
        Task task2 = new Task("T102", "Task 2", "Write documentation", "Not Started");

        task1.assignTask(student1);
        task2.assignTask(mentor1);

        task1.updateTaskStatus("In Progress");
        task2.updateTaskStatus("Completed");

        task1.displayTaskInfo();
        task2.displayTaskInfo();
    }
}
