class User {
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

    public void displayUserInfo() {
        System.out.println("User ID: " + this.id);
        System.out.println("User Name: " + this.name);
        System.out.println("User Email: " + this.email);
        System.out.println();
    }

    public void updateName(String newName) {
        this.name = newName;
    }

    public void updateEmail(String newEmail) {
        this.email = newEmail;
    }
    public static int getUserCount() {
        return userCount;
    }
    public static String getOrganization(){
        return organization;
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

    public void displayAssignmentInfo() {
        System.out.println("Assignment ID: " + this.id);
        System.out.println("Assignment Title: " + this.title);
        System.out.println("Assignment Description: " + this.description);
        System.out.println("Assignment Due Date: " + this.dueDate);

        System.out.println();
    }

    public void updateDueDate(String newDueDate) {
        this.dueDate = newDueDate;
    }

    public static int getAssignmentCount() {
        return assignmentCount;
    }
}

public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User("S101", "Abhinav", "abhinav.singh@kalvium.community"),
                new User("S102","Ayush Ghodke","ayush.ghodke@kalvium.community"),
                new User("S103","Shriyans Jindal","shriyans.jindal@kalvium.community"),
                new User("S104","Dhruv Patil","dhruv.patil@kalvium.community"),
                new User("M101", "Manu", "manu.a@kalvium.community"),
                new User("M102","Deepakshi","deepakshi.sharma@kalvium.community")
        };

        Assignment[] assignments = {
                new Assignment("K101", "EPS Assignment", "Write a case study report on SriLanka Bankruptcy", "30-08-2024"),
                new Assignment("K102", "OOP Assignment", "Implement a project using OOP concepts", "05-09-2024"),
                new Assignment("K103", "Dojo Assignment", "Solve 5 Problems in Dojo Workout.", "10-09-2024")
        };

        for (User user : users) {
            user.displayUserInfo();
        }

        users[0].updateName("Abhishek");
        users[0].updateEmail("abhishek@kalvium.community");
        users[0].displayUserInfo();

        for (Assignment assignment : assignments) {
            assignment.displayAssignmentInfo();
        }

        assignments[0].updateDueDate("02-09-2024");
        assignments[0].displayAssignmentInfo();

//        JAVA DOESN'T SUPPORT DELETE KEYWORD
        System.out.println("Organization: "+ User.getOrganization());
        System.out.println("Total Users: " + User.getUserCount());
        System.out.println("Total Assignments: " + Assignment.getAssignmentCount());

    }
}