package day2;

import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.Map;
import java.util.HashMap;

public class Kyc {
    static Map<String, String> patterns = new HashMap<>();

    static {
        patterns.put("name", "^[A-Za-z]{3,}$");
        patterns.put("password", "^(?=.*[a-z])(?=.*[A-Z])(?=.*\\d)(?=.*[@$!%*?&])[A-Za-z\\d@$!%*?&]{8,}$");
    }

    public static boolean validate(String key, String value) {
        String regex = patterns.get(key);
        if (regex == null) return false;
        return Pattern.matches(regex, value);
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        try {
            System.out.println("KYC");
            System.out.print("Tell us name: ");
            String fullName = scan.nextLine().trim();
            if (!validate("name", fullName)) {
                System.out.println("Invalid name");
                return;
            }

            System.out.print("Enter the password: ");
            String password = scan.nextLine();
            if (!validate("password", password)) {
                System.out.println("Invalid password");
            } else {
                System.out.println("KYC completed");
            }
        } finally {
            scan.close();
        }
    }
}
