class Hitung {
    public static void main(String[] args) {
        StringBuffer a = new StringBuffer("Nama saya Seffy Kusuma Ningrum");
        int p = a.length();

        String data1 = "zakaria adiwibowo";
        int searchIndex = data1.indexOf("z");

        StringBuffer b = new StringBuffer("Mas'ul Fauzi");

        System.out.println("1. Jumlah karakter= " + p);
        System.out.println("2. Search karakter= " + searchIndex);
        System.out.println("3. Menghapus karakter");
        System.out.println("String awal: " + b);
        b.delete(7, 12);
        System.out.println("String setelah: " + b);

    }
}
