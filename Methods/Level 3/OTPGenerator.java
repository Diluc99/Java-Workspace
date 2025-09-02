import java.util.Scanner;

public class OTPGenerator {
    public static void main(String[] args) {
        int[] otps = new int[10];
        for (int i = 0; i < 10; i++) {
            otps[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + ": " + otps[i]);
        }
        System.out.println("All OTPs unique: " + areOTPsUnique(otps));
    }

    static int generateOTP() {
        int otp = 0;
        while (otp < 100000) {
            otp = (int)(Math.random() * 1000000);
        }
        return otp;
    }

    static boolean areOTPsUnique(int[] otps) {
        Set<Integer> set = new HashSet<>();
        for (int otp : otps) {
            if (!set.add(otp)) return false;
        }
        return true;
    }
}
