interface MyInterface
{
    void iMethod();
}
class MyClass1 implements MyInterface
{
    public void iMethod() {
        System.out.println("Interface");
    }
    void myMethod(){
        System.out.println("Method.");
    }
}
class MyClass2 implements MyInterface
{
    public void iMethod(){
        System.out.println("Package.");
    }
}
class InterfaceDemo{
    public static void main(String[] args){
        MyClass1 mc1 = new MyClass1();
        MyClass2 mc2 = new MyClass2();
        mc1.myMethod();
        mc2.iMethod();
    }
}

