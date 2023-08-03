public static void main (String[] args){
Scanner input = new Scanner (System.in);
double c,f,r;

System.out.println("===============================================");
System.out.println("aplikasi konversi reamur");
System.out.println("===============================================");

System.out.println("Masukan Suhu : ");
r= input.nextDouble();

c= (5.0/4.0)*r;
f= (9.0/4.0*r)+32.0;

System.out.println("Hasil Konversi Adalah : ");
System.out.println("Fahrenheit : "+c+" C");
System.out.println("Reamur : "+f+" F");

}