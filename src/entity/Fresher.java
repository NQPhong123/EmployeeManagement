package entity;

import java.time.LocalDate;
import java.util.List;

public class Fresher extends Employee {

    LocalDate graduateDate;
    String graduateRank;
    String graduateSchool;

    public Fresher(LocalDate graduateDate, String graduateRank, String graduateSchool, LocalDate birthDay, List<Certificate> certificate, String email, String fullName, String id, String phone) {
        super(birthDay, certificate, email, fullName, id, phone);
        this.graduateDate = graduateDate;
        this.graduateRank = graduateRank;
        this.graduateSchool = graduateSchool;
    }

    public LocalDate getGraduateDate() {
        return graduateDate;
    }

    public void setGraduateDate(LocalDate graduateDate) {
        this.graduateDate = graduateDate;
    }

    public String getGraduateRank() {
        return graduateRank;
    }

    public void setGraduateRank(String graduateRank) {
        this.graduateRank = graduateRank;
    }

    public String getGraduateSchool() {
        return graduateSchool;
    }

    public void setGraduateSchool(String graduateSchool) {
        this.graduateSchool = graduateSchool;
    }

    @Override
    public String showInfo() {

        return super.showInfo()
                + "graduateDate " + graduateDate
                + "graduateRank " + graduateRank
                + "graduateSchool " + graduateSchool;
    }
}
