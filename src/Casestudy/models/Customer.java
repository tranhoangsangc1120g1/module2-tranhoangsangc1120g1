package Casestudy.models;

public class Customer {
    private String iD;
    private String customerName;
    private String dateOfBirth;
    private String gender;
    private String type;
    private String phoneNum;
    private String email;
    private String address;
    private Services service;

    public Customer(String iD, String customerName, String dateOfBirth,
                    String gender, String type, String phoneNum, String email, String address) {
        this.iD = iD;
        this.customerName = customerName;
        this.dateOfBirth = dateOfBirth;
        this.gender = gender;
        this.type = type;
        this.phoneNum = phoneNum;
        this.email = email;
        this.address = address;
    }


    public Customer(String[] customer) {
        this.iD = customer[0];
        this.customerName = customer[1];
        this.dateOfBirth = customer[2];
        this.gender = customer[3];
        this.type = customer[4];
        this.phoneNum = customer[5];
        this.email = customer[6];
        this.address = customer[7];

    }

    public Services getService() {
        return service;
    }

    public void setService(Services service) {
        this.service = service;
    }

    public String getiD() {
        return iD;
    }

    public void setiD(String iD) {
        this.iD = iD;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return getiD() + ", " + getCustomerName() + ", " + getDateOfBirth() + ", " +
                getGender() + ", " + getType() + ", " + getPhoneNum() + ", " +
                getEmail() + ", " + getAddress()+", "+ getService();
    }

    public void showCustomerInfor() {
        System.out.println("Customer{" +
                "iD='" + getiD() + '\'' +
                ", customerName='" + getCustomerName() + '\'' +
                ", dateOfBirth='" + getDateOfBirth() + '\'' +
                ", gender='" + getGender() + '\'' +
                ", type='" + getType() + '\'' +
                ", phoneNum='" + getPhoneNum() + '\'' +
                ", email='" + getEmail() + '\'' +
                ", address='" + getAddress() + '\'' +
                ", service='" + getService() + '\'' +
                '}'
        );
    }
}
