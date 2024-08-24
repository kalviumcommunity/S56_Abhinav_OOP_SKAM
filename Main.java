class User {
    private String id;
    private String name;
    private String email;

    public User(String id, String name, String email) {
        this.id = id;
        this.name = name;
        this.email = email;
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
}

class Assignment {
    private String id;
    private String title;
    private String description;
    private String dueDate;

    public Assignment(String id, String title, String description, String dueDate) {
        this.id = id;
        this.title = title;
        this.description = description;
        this.dueDate = dueDate;
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
}

public class Main {
    public static void main(String[] args) {
        User user1 = new User("S101", "Abhinav", "abhinav.singh@kalvium.community");
        User user2 = new User("M101", "Manu", "manu.a@kalvium.community");
        Assignment assignment1 = new Assignment("K101", "EPS Assignment", "Write a case study report on SriLanka Bankruptcy", "30-08-2024");

        user1.displayUserInfo();
        user2.displayUserInfo();
        user1.updateName("Abhishek");
        user1.updateEmail("abhishek@kalvium.community");
        user1.displayUserInfo();

        assignment1.displayAssignmentInfo();
        assignment1.updateDueDate("02-09-2024");
        assignment1.displayAssignmentInfo();
    }
}
