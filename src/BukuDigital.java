public class BukuDigital extends Buku {
    private double ukuranMB;

    public BukuDigital(String judul, String penulis, int harga, double ukuranMB) {
        //java: constructor Buku in class Buku cannot be applied to given types;
        //required: java.lang.String,java.lang.String,int
        //found:    no arguments
        //reason: actual and formal argument lists differ in length
        super(judul, penulis, harga);
        this.ukuranMB = ukuranMB;
    }

    @Override
    public int hargaAkhir() {

        return super.hargaAkhir() * 80 / 100;
    }

    @Override
    public void tampilkanInfo() {
        super.tampilkanInfo();
        System.out.println("  Ukuran      : " + ukuranMB + " MB");
        System.out.println("  Harga akhir : " + formatRupiah(hargaAkhir()) + " (diskon 20%)");
    }
}