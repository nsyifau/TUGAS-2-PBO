public class DriverClass {
    public static void main(String[] args) {
        Asdos fairuz = new Asdos("fairuzikun", 24, 1);
        Dosen rajaOp = new Dosen("Raja Op Damanik", 5);
        Asdos angelChan = new Asdos("angel-chan", 20, 4);
        mahasiswa firman = new mahasiswa("firman", 20);
        mahasiswa nid = new mahasiswa("nid to pass this sem", 23);
        Dosen nivot = new Dosen("nivotko", 3);
        
        fairuz.send();
        rajaOp.send();
        angelChan.send();
        firman.send();
        nid.send();
        nivot.send();

        int totalJamSibuk = fairuz.jamSibuk + rajaOp.jamSibuk + angelChan.jamSibuk + firman.jamSibuk + nid.jamSibuk
        + nivot.jamSibuk;
        System.out.println("Total jam sibuk elemen fasilkom adalah "+ totalJamSibuk);
    }
}
