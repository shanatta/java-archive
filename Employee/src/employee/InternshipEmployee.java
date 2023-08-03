package employee;
public class InternshipEmployee extends Employee {
    private final int length;
    private int Length;
    
    public InternshipEmployee(String name, int length) {
        this.length = length;
        this.name = name;
    }
    public int getlength() {
        return length;  
    }
    public void setlength(int length) {
        this.Length = length;
    }
    @Override
    public String getEmployeeInfo() {
        String info = super.getEmployeeInfo();
        info += "Registered as intership employee for "+length+" month/s\n";
        return info;
    }
}
