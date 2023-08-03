package project;
public class Arsipku implements Biodata, Nilai{
    public static void main(String []args){
        Arsipku br = new Arsipku();
        br.nama();
        br.tempatLahir();
        br.hobi();
        br.agama();
        br.bahasaIndonesia();
        br.matematika();
    }
    @Override
    public void nama(){
        System.out.println("Namaku adalah Sindi Aprilia Hapsari");
}   
    @Override
    public void tempatLahir(){
        System.out.println("Tempat Lahirku di Semarang");
}   
    @Override
    public void hobi(){
        System.out.println("Hobiku adalah Membaca");
}   
    @Override
    public void agama(){
        System.out.println("Nilai Agama: 100");
}   
    @Override
    public void bahasaIndonesia(){
        System.out.println("Nilai Bahasa Indonesia: 100");
}   
    @Override
    public void matematika(){
        System.out.println("Nilai Matematika: 100");
}   
    
}