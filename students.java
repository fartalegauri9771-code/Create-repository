class students {
    String name;
    int rollNo;
    double marks;
    students(String name, int rollNo, double marks) {
        this.name = name;
        this.rollNo = rollNo;
        this.marks = marks;
}
    void displayStudent() {
           System.out.println("Student Name: " + name);
        System.out.println("Roll No: " + rollNo);
        System.out.println("Marks: " + marks);
       }
 public static void main(String[] args) {
 students s1 = new students("Gauri", 101, 85.5);
        s1.displayStudent();
    }

    
}