package ua.com.alevel.jdbc;

public class OfficeEntity {
    private int officeCode;
    private String city, phone, addsetsLine1, addsetsLine2, state;
    private String country, postalCode, territory;

    public int getOfficeCode() {
        return officeCode;
    }

    public void setOfficeCode(int officeCode) {
        this.officeCode = officeCode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "OfficeEntity{" +
                "officeCode=" + officeCode +
                ", city='" + city + '\'' +
                ", phone='" + phone + '\'' +
                ", addsetsLine1='" + addsetsLine1 + '\'' +
                ", addsetsLine2='" + addsetsLine2 + '\'' +
                ", state='" + state + '\'' +
                ", country='" + country + '\'' +
                ", postalCode='" + postalCode + '\'' +
                ", territory='" + territory + '\'' +
                '}';
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddsetsLine1() {
        return addsetsLine1;
    }

    public void setAddsetsLine1(String addsetsLine1) {
        this.addsetsLine1 = addsetsLine1;
    }

    public String getAddsetsLine2() {
        return addsetsLine2;
    }

    public void setAddsetsLine2(String addsetsLine2) {
        this.addsetsLine2 = addsetsLine2;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public String getTerritory() {
        return territory;
    }

    public void setTerritory(String territory) {
        this.territory = territory;
    }
}
