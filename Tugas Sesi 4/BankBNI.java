class BankBNI extends Bank {
    @Override
    void sukuBunga() {
        System.out.println("Suku bunga bank BNI adalah 4%");
    }

    @Override
    void transferUang(int jumlah, String rekeningTujuan, String bankTujuan) {
        bankTujuan = "BNI";
        int biaya = hitungBiaya(bankTujuan);

        System.out.println("Transfer Rp" + jumlah + "ke rekening" + rekeningTujuan + "di bank:" + bankTujuan +" | Biaya: RP " + biaya);

    }

    @Override
    int hitungBiaya(String bankTujuan) {
        return 4000;
    }
}