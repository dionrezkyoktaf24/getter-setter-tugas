//Object Class
public class guru {
    private int id;
    private String nama;
    private String mapel;
    private String alamat;


    //constructor nama sama dengan class
    public guru() {
        id = 0;
        nama = "";
        mapel = "";
        alamat = "";
    } 
    //Constructor parameter
    public guru(int id, String nama, String mapel, String alamat){
        this.id = id;
        this.nama = nama;
        this.mapel = mapel;
        this.alamat = alamat;
    }

    //Metdhod
    public void print () {
        System.out.println("-----------------------------");
        System.out.println("ID : "+id);
        System.out.println("Nama: "+nama);
        System.out.println("Mapel: "+mapel);
        System.out.println("alamat: "+alamat);
        System.out.println("-----------------------------");
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getNama() {
        return nama;
    }
    public void setNama(String nama) {
        this.nama = nama;
    }
    public String getMapel() {
        return mapel;
    }
    public void setMapel(String mapel) {
        this.mapel = mapel;
    }
    public String getAlamat() {
        return alamat;
    }
    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }





    
}