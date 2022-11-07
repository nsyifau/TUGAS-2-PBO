public class mahasiswa extends elemen {
    private int sks;
    public int jamSibuk;

    public mahasiswa(String nama, int sks){
        super (nama);         // Downcasting
        jamSibuk = sks*3;
    }

    public void send (){
        System.out.println(this.nama + " adalah seorang dosen dengan jam sibuk " + jamSibuk);

    }
    // polymorphism
    public int getjamSibuk (){
        return jamSibuk;
    }
}

class Asdos extends mahasiswa{
    private int jamNgasdos;
    public Asdos(String nama, int sks, int jamNgasdos){
        super (nama,sks); // Downcasting
        jamSibuk = jamSibuk + jamNgasdos;
    }
    public void send (){
        System.out.println(this.nama + " adalah seorang asdos dengan jam sibuk " + jamSibuk);

    }
    // Polymophism
    public int getjamSibuk (){
        return jamSibuk;
    }
}
