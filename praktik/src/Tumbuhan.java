
interface Tumbuhan
{
    public void warna();
}

class Bunga implements Tumbuhan
{
    public void warna() {
        System.out.println("COBA BUAT INTERFACE");
        System.out.println("WARNA MERAH");
    }

public static void main(String args[])
{
    Tumbuhan obj = new Bunga();
    obj.warna();
}
}