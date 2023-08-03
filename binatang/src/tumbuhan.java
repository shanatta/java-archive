interface tumbuhan
{
    public void warna();
}

class Bunga implements tumbuhan
{
    public void warna() {
        System.out.println("COBA BUAT INTERFACE");
        System.out.println("WARNA MERAH");
    }

public static void main(String args[])
{
    tumbuhan obj = new Bunga();
    obj.warna();
}
}