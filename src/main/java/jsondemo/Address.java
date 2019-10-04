package jsondemo;

public class Address {
    public Address() {
    }

    public Address(String location) {
        this.location = location;
    }

    private String location;

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    @Override
    public String toString() {
        return "Address{" +
                "location='" + location + '\'' +
                '}';
    }
}
