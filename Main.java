class User {
    // Private attributes
    private String id;
    private String name;
    private String email;
    private static int userCount = 0;
    private static String organization = "Kalvium";

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
        userCount++;
    }

    // Getter methods
    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    // Setter methods
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
    // Private attributes
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

    // Getter methods
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

    // Setter methods
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
        User[] users = {
                new User("S101", "Abhinav", "abhinav.singh@kalvium.community"),
                new User("S102", "Ayush Ghodke", "ayush.ghodke@kalvium.community"),
                new User("S103", "Shriyans Jindal", "shriyans.jindal@kalvium.community"),
                new User("S104", "Dhruv Patil", "dhruv.patil@kalvium.community"),
                new User("M101", "Manu", "manu.a@kalvium.community"),
                new User("M102", "Deepakshi", "deepakshi.sharma@kalvium.community")
        };

        Assignment[] assignments = {
                new Assignment("K101", "EPS Assignment", "Write a case study report on SriLanka Bankruptcy", "30-08-2024"),
                new Assignment("K102", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024"),
                new Assignment("K103", "Dojo Assignment", "Solve 5 Problems in Dojo Workout.", "10-09-2024")
        };

        for (User user : users) {
            user.displayUserInfo();
        }

        users[0].setName("Abhishek");
        users[0].setEmail("abhishek@kalvium.community");
        users[0].displayUserInfo();

        for (Assignment assignment : assignments) {
            assignment.displayAssignmentInfo();
        }

        assignments[0].setDueDate("02-09-2024");
        assignments[0].displayAssignmentInfo();

        System.out.println("Organization: " + User.getOrganization());
        System.out.println("Total Users: " + User.getUserCount());
        System.out.println("Total Assignments: " + Assignment.getAssignmentCount());
    }
}
