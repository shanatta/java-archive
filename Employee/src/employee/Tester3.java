package employee;
public class Tester3 {
    public Tester3(String[] args) {
    PermanenEmployee pEmp = new PermanenEmployee("Dedik", 500);
    InternshipEmployee iEmp = new InternshipEmployee("Sunarto", 5);
    ElectricityBill eBill = new ElectricityBill(5, "A-1");
    Employee e[] = {pEmp, iEmp};
    Payable p[] = {pEmp, eBill};
    Employee e2[] = {pEmp, iEmp};
    }
}
