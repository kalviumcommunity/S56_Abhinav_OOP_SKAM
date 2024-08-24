class User{
    private String id;
    private String name;

//    constructor
    public User(String id, String name){
        this.id=id;
        this.name=name;
    }

//    methods
    public void displayUserInfo(){
        System.out.println("User ID: "+id);
        System.out.println("User Name: "+name);
        System.out.println();
    }

    public void updateName(String newName){
        this.name=newName;
    }
}

class Assignment{
    private String id;
    private String title;
    private String description;
    private String dueDate;

//    constructor
    public Assignment(String id, String title, String description, String dueDate){
        this.id=id;
        this.title=title;
        this.description=description;
        this.dueDate=dueDate;
    }
//    methods
    public void displayAssignmentInfo(){
        System.out.println("Assignment ID: "+id);
        System.out.println("Assignment Title: "+title);
        System.out.println("Assignment Description: "+description);
        System.out.println("Assignment Due Date: "+dueDate);
        System.out.println();

    }

    public void updateDueDate(String newDueDate){
        this.dueDate=newDueDate;
    }

}


public class Main {
    public static void main(String[] args) {
        System.out.println("Hello and welcome to SKAM!");
//objects
        User user1=new User("S101","Abhinav");
        User user2= new User("M101","Manu");
        Assignment assignment1= new Assignment("K101","EPS Assignment","Write a case study report on SriLanka Bankruptcy","30-08-2024");

//        display user info
        user1.displayUserInfo();
        user2.displayUserInfo();
        user1.updateName("Abhishek");
        user1.displayUserInfo();
//        display assignment info
        assignment1.displayAssignmentInfo();
        assignment1.updateDueDate("02-09-2024");
        assignment1.displayAssignmentInfo();
    }
}
