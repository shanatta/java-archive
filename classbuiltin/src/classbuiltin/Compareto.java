package classbuiltin;

public class Compareto {
    public static void main(String[] args) {
        String s1 ="HALO";
        String s2 ="NANA";
        String s3 ="HELLO";
        String s4 ="NINI";
        
        System.out.println(s1.compareTo(s2));
        System.out.println(s1.compareTo(s3));
        System.out.println(s1.compareTo(s4));
        System.out.println(s2.compareTo(s3));
        System.out.println(s2.compareTo(s4));
        System.out.println(s3.compareTo(s4));
    }
}
