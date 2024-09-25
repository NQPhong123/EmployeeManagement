package entity;

import java.time.LocalDate;
import java.util.List;

public class Experience extends Employee {

    int experience;
    String proSkill;

    public Experience(int experience, String proSkill, LocalDate birthDay, List<Certificate> certificate, String email, String fullName, String id, String phone) {
        super(birthDay, certificate, email, fullName, id, phone);
        this.experience = experience;
        this.proSkill = proSkill;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getProSkill() {
        return proSkill;
    }

    public void setProSkill(String proSkill) {
        this.proSkill = proSkill;
    }

    @Override
    public String showInfo() {

        return super.showInfo()
                + "experience " + experience
                + "proSkill " + proSkill;
    }
}
