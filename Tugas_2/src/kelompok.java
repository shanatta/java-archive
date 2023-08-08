class Data {
    String nama, jenis_kelamin, alamat;
    int umur;
    
    public void biodata(String nama, String jenis_kelamin, int umur, String alamat) {
        this.nama = nama;
        this.jenis_kelamin = jenis_kelamin;
        this.umur = umur;
        this.alamat = alamat;

        System.out.println("Nama\t\t: " + nama);
        System.out.println("Jenis Kelamin\t: " + jenis_kelamin);
        System.out.println("Umur\t\t: " + umur);
        System.out.println("Alamat\t\t: " + alamat + "\n");

    }

} 
