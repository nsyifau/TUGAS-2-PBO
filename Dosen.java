public class Dosen extends elemen {
    private int jmlHariKerja;
    public int jamSibuk;

    public Dosen(String nama, int jmlHariKerja){
        super (nama); //Downcasting
        jamSibuk = jmlHariKerja * 8;
    }

    public void send (){
        System.out.println(this.nama + " adalah seorang dosen dengan jam sibuk " + jamSibuk);

    }
    // Polymophism
    public int getjamSibuk (){
        return jamSibuk;
    }
}
