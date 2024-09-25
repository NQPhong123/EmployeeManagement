package entity;

import java.time.LocalDate;
import java.util.List;

public class Intern extends Employee {

    String major;
    int semester;
    String universityName;

    public Intern(String major, int semester, String universityName, LocalDate birthDay, List<Certificate> certificate, String email, String fullName, String id, String phone) {
        super(birthDay, certificate, email, fullName, id, phone);
        this.major = major;
        this.semester = semester;
        this.universityName = universityName;
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        this.major = major;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public String getUniversityName() {
        return universityName;
    }

    public void setUniversityName(String universityName) {
        this.universityName = universityName;
    }
    @Override
    public String showInfo() {

        return super.showInfo()
                + "major " + major
                + "semester " + semester
                + "universityName " + universityName;
    }
}
