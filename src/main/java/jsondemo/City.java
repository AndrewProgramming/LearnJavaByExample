package jsondemo;

public class City {
    private String name;
    private String province;

    public City() {
    }

    public City(String name, String province) {
        this.name = name;
        this.province = province;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    @Override
    public String toString() {
        return "City{" +
                "name='" + name + '\'' +
                ", province='" + province + '\'' +
                '}';
    }
}
