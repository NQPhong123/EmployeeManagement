package entity;

import java.time.LocalDate;
import java.util.List;

public abstract class Employee {

    protected String id;
    protected String fullName;
    protected LocalDate birthDay;
    protected String phone;
    protected String email;
    protected List<Certificate> certificate;
    public Employee() {}
    public Employee(LocalDate birthDay, List<Certificate> certificate, String email, String fullName, String id, String phone) {
        this.birthDay = birthDay;
        this.certificate = certificate;
        this.email = email;
        this.fullName = fullName;
        this.id = id;
        this.phone = phone;
    }

    public String showInfo() {
        return "id: " + id
                + "fullName: " + fullName
                + "birthDay" + birthDay
                +"phone" + phone
                +"email" + email
                +"Certificate" + certificate;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public LocalDate getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(LocalDate birthDay) {
        this.birthDay = birthDay;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public List<Certificate> getCertificate() {
        return certificate;
    }

    public void setCertificate(List<Certificate> certificate) {
        this.certificate = certificate;
    }
}
