public class Student {
    public String name = "Sidhant";
    private int rollNo = 101;
    protected double marks = 89.5;
    String department = "ECE";

    public void display() {
        System.out.println("Name: " + name);
        System.out.println("Roll No (private, only accessible inside class): " + rollNo);
        System.out.println("Marks (protected): " + marks);
        System.out.println("Department (default/package-private): " + department);
    }
}

