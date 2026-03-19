public class Main {
    public static void main(String[] args) {

        Bank bank = new Bank();
        bank.transferUang(100000, "1234567890");
        bank.transferUang(200000, "9876543210", "Mandiri");
        bank.transferUang(300000, "1122334455", "BRI", " Bayar Kuliah");
        bank.sukuBunga();

        System.out.println();

        BankBNI bni = new BankBNI();
        bni.transferUang(500000, "111222333", "ApaAja");
        bni.sukuBunga();

        System.out.println();

        BankBCA bca = new BankBCA();
        bca.transferUang(750000, "444555666", "ApaAja");
        bca.sukuBunga();
    }
}
