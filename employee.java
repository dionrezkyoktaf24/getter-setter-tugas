//Object Class
public class employee {
    private String nama;
    private double gaji;

	public String getNama() {
		return this.nama;
	}

	public void setNama(String nama) {
		this.nama = nama;
	}

	public double getGaji() {
		return this.gaji;
	}

	public void setGaji(double gaji) {
		this.gaji = gaji;
	}


    /*constructor nama sama dengan nama class */
    public employee(){
        nama = "";
        gaji = 0.00;
    }
    
    //Constructor parameter
    public employee (String nama , double gaji) {
        this.nama = nama;
        this.gaji= gaji;
    }


    //method
    public void print() {
        System.out.println("-------------------------------------------------------------------------");
        System.out.println("Ini Data Dari Karyawan");
        System.out.println("Nama : "+ nama);
        System.out.println("Gaji : "+ gaji);
        System.out.println("-------------------------------------------------------------------------");
    }

}