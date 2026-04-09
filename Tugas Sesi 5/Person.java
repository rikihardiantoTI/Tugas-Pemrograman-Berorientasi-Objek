public class Person {
    private String name;
    private String address;

    // Konstruktor [cite: 18]
    public Person(String name, String address) {
        this.name = name;
        this.address = address;
    }

    // Getter untuk nama [cite: 19]
    public String getName() {
        return name;
    }

    // Getter untuk alamat [cite: 20]
    public String getAddress() {
        return address;
    }

    // Setter untuk alamat [cite: 21]
    public void setAddress(String address) {
        this.address = address;
    }

    // Mengembalikan format "nama (alamat)" [cite: 22, 23]
    @Override
    public String toString() {
        return name + " (" + address + ")";
    }
}