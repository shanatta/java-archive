//hal 210

class mandiri {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("AYARAKGNALAP");
        System.out.println("4. String awal= " + a);

        a.reverse();
        System.out.println("- String setelah reverse= " + a);

        StringBuffer b = new StringBuffer("Nama saya Seffy Kusuma Ningrum");
        int p = b.length();
        System.out.println("5. Jumlah karakter= " + p);

        StringBuffer c = new StringBuffer("BALIKPAPAN");
        System.out.println("10. String awal= " + c);

        c.replace(5, 10, "HUTAN");
        System.out.println("- String setelah replace= " + c);
    }
}
