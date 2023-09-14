//Menggabungkan String
public class mandiri {
    public static void main(String[] args) throws Exception {
        String kata1 = "SAYA ";
        String kata2 = "SISWA ";
        String kata3 = "SMK ";
        String kata4 = "SAYA ";
        String kata5 = "ANGKATAN ";
        String kata6 = "2024 ";
        String kata7 = "Saya ";
        System.out.println(kata1 + kata2 + kata3 + "\n"
                + kata4 + kata5 + kata6 + "\n"
                + kata7 + ((kata2 + kata5 + kata6 + "\n").toLowerCase())
                + kata7 + ((kata2).toLowerCase()) + kata3);
    }
}
