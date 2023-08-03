package employee;
public class Tester2 {
    public static void main(String[] args){
        PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
        Employee e;
        e = pEmp;
        System.out.println(""+e.getEmployeeInfo());
        System.out.println("------------------");
        System.out.println(""+pEmp.getEmployeeInfo());
    }
}
