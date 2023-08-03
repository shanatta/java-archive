package employee;
class PermanenEmployee extends Employee implements Payable{
    private int salary;
    
    public PermanenEmployee(String name, int salary){
        this.name = name;
        this.salary = salary;
    }
    public int getSalary(){
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
    @Override
    public int getPaymentAmount() {
        return (int) (salary+0.05*salary);
    }
    
    Public String getEmployeeInfo() {
        String info = super.getEmployeeInfo()+"\n";
        info +="Registed as permanent employee with salary "+salary+"\n";
        return;
    }
}
        
    


