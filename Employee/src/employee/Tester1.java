package employee;
public class Tester1{
    public static void main(String[] args){
        PermanenEmployee pEmp = new PermanenEmployee("Jihoon", 500);
        InternshipEmployee iEmp = new InternshipEmployee("Hyunsuk", 5);
        ElectricityBill eBill = new ElectricityBill(5, "A-1");
        Employee e;
        Payable p;
        e = pEmp;
        e = iEmp;
        p = pEmp;
        p = eBill;
    }
}
