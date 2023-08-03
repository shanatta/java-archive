package employee;
public class Owner {
    public void pay(Payable p){
        System.out.println("Total payment = "+p.getPaymentAmount());
        if(p instanceof ElectricityBill){
            ElectricityBill eb = (ElectricityBill) p;
            System.out.println(""+eb.getBillInfo());
        }else if(p instanceof PermanenEmployee){
            PermanenEmployee pe = (PermanenEmployee) p;
            pe.getEmployeeInfo();
            System.out.println(""+pe.getEmployeeInfo());
        }
    }
    public void showMyEmployee(Employee e){
        System.out.println (""+e.getEmployeeInfo());
        if(e instanceof PermanenEmployee)
            System.out.println("You have to pay her/him monthly!!!");
        else
            System.out.println("No need to pay him/her :)");
    }

    void pay(InternshipEmployee iEmp) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
