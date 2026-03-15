package mid1.lang.immutable.address;

public class ImmutableAddress {
    private final String address;

    public ImmutableAddress(String address) {
        this.address = address;
    }

    public String getAddress() {
        return address;
    }
    
    @Override
    public String toString() {
        return "Address{" +
                "address='" + address + '\'' +
                '}';
    }
}
