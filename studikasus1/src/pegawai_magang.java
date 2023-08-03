public class pegawai_magang extends Pegawai {
     private int length;
     
     public pegawai_magang(String name,int length){
         this.length=length;
         this.name=name;
     }
     
     public void setLength(int length){
         this.length = length;
     }
     public int getLength(){
         return length;
     }
     
    @Override
     public String getPegawaiInfo(){
         return "Name = " +name;
     }
}
