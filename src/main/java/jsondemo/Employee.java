package jsondemo;

import java.util.Arrays;
import java.util.List;

public class Employee {
    private int id;
    private String name;
    private long[] number;
    private Address address;
    private List<City> cityList;
    private String Role;
    private boolean contractor;

    public Employee() {
    }

    public Employee(int id, String name, long[] number, Address address, List<City> cityList, String role, boolean contractor) {
        this.id = id;
        this.name = name;
        this.number = number;
        this.address = address;
        this.cityList = cityList;
        Role = role;
        this.contractor = contractor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public long[] getNumber() {
        return number;
    }

    public void setNumber(long[] number) {
        this.number = number;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public List<City> getCityList() {
        return cityList;
    }

    public void setCityList(List<City> cityList) {
        this.cityList = cityList;
    }

    public String getRole() {
        return Role;
    }

    public void setRole(String role) {
        Role = role;
    }

    public boolean isContractor() {
        return contractor;
    }

    public void setContractor(boolean contractor) {
        this.contractor = contractor;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", number=" + Arrays.toString(number) +
                ", address=" + address +
                ", cityList=" + cityList +
                ", Role='" + Role + '\'' +
                ", contractor=" + contractor +
                '}';
    }
}
