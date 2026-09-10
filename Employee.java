class Employee {
    void work(){
        System.out.println("employee is working");
    }
}
class Developer extends Employee {
    @Override
    void work(){
        System.out.println("Developer is writting code");
    }
}
class Tester extends Employee {
    @Override
    void work(){
        System.out.println("Tester is the Testing a Software");
    }
}
 class Main  {
    public static void main(String[] args) {
        Developer d = new Developer();
        Tester t = new Tester();
        d.work();
        t.work();
    }
}