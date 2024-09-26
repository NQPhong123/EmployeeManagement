package service;

import exception.BirthDayException;
import exception.EmailException;
import exception.FullNameException;
import exception.PhoneException;
import java.time.LocalDate;
import java.util.regex.Pattern;

public class ValidatorService {

    // Birthday validation: The user must be at least 18 years old
    public static void birthdayCheck(LocalDate birthday) throws BirthDayException {
        LocalDate today = LocalDate.now();
        if (birthday.isAfter(today)) {
            throw new BirthDayException("Birthday cannot be in the future.");
        }
        LocalDate adultThreshold = today.minusYears(18);
        if (birthday.isAfter(adultThreshold)) {
            throw new BirthDayException("User must be at least 18 years old.");
        }
    }

    // Phone validation: Must follow a specific pattern, e.g., 10 digits long
    public static void phoneCheck(String phone) throws PhoneException {
        if (!Pattern.matches("\\d{10}", phone)) {
            throw new PhoneException("Phone number must be 10 digits long.");
        }
    }

    // Email validation: Must follow a basic email pattern
    public static void emailCheck(String email) throws EmailException {
        String emailPattern = "^[\\w._%+-]+@[\\w.-]+\\.[a-zA-Z]{2,6}$";
        if (!Pattern.matches(emailPattern, email)) {
            throw new EmailException("Invalid email format.");
        }
    }

    // Name validation: Must not be empty and must contain at least two words
    public static void nameCheck(String name) throws FullNameException {
        if (name == null || name.trim().isEmpty()) {
            throw new FullNameException("Name cannot be empty.");
        }
        String[] parts = name.trim().split("\\s+");
        if (parts.length < 2) {
            throw new FullNameException("Full name must contain at least a first and last name.");
        }
    }
}
