 public class HandPhone {

    String jenis_hp;
    int tahun_pembuatan;

    // Perbaikan 1: sebelumnya "String_public", seharusnya "public void"
    // karena method ini hanya untuk mengisi data dan tidak mengembalikan nilai
    public void setDataHP(String jenis_hp, int tahun_pembuatan){
        this.jenis_hp = jenis_hp;          // Perbaikan 2: menggunakan this agar jelas bahwa ini variabel atribut
        this.tahun_pembuatan = tahun_pembuatan;
    }

    // Perbaikan 3: method harus mengembalikan nilai jenis_hp
    String getJenisHP(){
        return jenis_hp;                   // sebelumnya kosong, sekarang mengembalikan nilai
    }

    // Perbaikan 4: tipe return harus int karena tahun_pembuatan bertipe int
    int getTahunPembuatan(){
        return tahun_pembuatan;            // sebelumnya kosong
    }

    // Perbaikan 5: penulisan method main yang benar adalah
    // public static void main(String args[])
    public static void main(String args[]){

        HandPhone hp = new HandPhone();

        // Perbaikan 6: memberi nilai parameter saat memanggil setDataHP
        hp.setDataHP("Samsung", 2022);

        // Perbaikan 7: menampilkan hasil dengan System.out.println
        System.out.println("Jenis HP : " + hp.getJenisHP());
        System.out.println("Tahun Pembuatan : " + hp.getTahunPembuatan());
    }
}