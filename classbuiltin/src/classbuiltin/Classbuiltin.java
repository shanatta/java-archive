package classbuiltin;

public class Classbuiltin {
    public static void main(String[] args) {
        int i1 = -5;
        int i2 = 5;
        System.out.println("Nilai absolut dari -5 : "+Math.abs(i1));
        System.out.println("Nilai absolut dari 5 : "+Math.abs(i2));
        
        int i10 = 25;
        System.out.println("angka acak (nilai maksimal adalah: 25) : ");
        
        int i4 = 7;
        int i5 = 4;
        System.out.println("Nilai maksimal dari 7 dan 4 adalah "+Math.max(i4, i5));
        System.out.println("Nilai maksimal dari 7 dan 4 adalah "+Math.min(i4, i5));
        
        double d1 = 7.9;
        System.out.println("Pembulatan ke atas dari 7.9 yaitu "+Math.ceil(d1));
        System.out.println("Pembulatan ke bawah dari 7.9 yaitu "+Math.floor(d1));
        
        
        System.out.println("e pangkat 3 : ");
        
        int i6 = 10;
        int i7 = 3;
        int i8 = 90;
        int i9 = 5;
        System.out.println("log 10 : "+Math.log(i6));
        System.out.println("10 pangkat 3 : "+Math.pow(i6, i7));
        System.out.println("akar dari 5 : "+Math.sqrt(i9));
        System.out.println("sin 90 : "+Math.sin(i8));
    }
}
