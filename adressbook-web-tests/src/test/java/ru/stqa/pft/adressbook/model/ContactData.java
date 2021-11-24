package ru.stqa.pft.adressbook.model;

public class ContactData {
    private final String firstName;
    private final String lastName;
    private final String nickName;
    private final String title;
    private final String company;
    private final String address;
    private final String homeTel;
    private final String mobileTel;
    private final String workTel;
    private final String email;
    private final String homePage;
    private final String bday;
    private final String bmonth;
    private final String byear;
    private final String group;


    public ContactData(String firstName, String lastName, String nickName, String title, String company, String address, String homeTel, String mobileTel, String workTel, String email, String homePage, String bday, String bmonth, String byear, String group) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.nickName = nickName;
        this.title = title;
        this.company = company;
        this.address = address;
        this.homeTel = homeTel;
        this.mobileTel = mobileTel;
        this.workTel = workTel;
        this.email = email;
        this.homePage = homePage;
        this.bday = bday;
        this.bmonth = bmonth;
        this.byear = byear;
        this.group = group;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getNickName() {
        return nickName;
    }

    public String getTitle() {
        return title;
    }

    public String getCompany() {
        return company;
    }

    public String getAddress() {
        return address;
    }

    public String getHomeTel() {
        return homeTel;
    }

    public String getMobileTel() {
        return mobileTel;
    }

    public String getWorkTel() {
        return workTel;
    }

    public String getEmail() {
        return email;
    }

    public String getHomePage() {
        return homePage;
    }

    public String getGroup() {
        return group;
    }

    public String getBday() {
        return bday;
    }

    public String getBmonth() {
        return bmonth;
    }

    public String getByear() {
        return byear;
    }
}
