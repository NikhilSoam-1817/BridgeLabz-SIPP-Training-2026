public class OTPGenerator {

    public static int generateOTP() {
        return (int)(Math.random() * 900000) + 100000;
    }

    public static boolean areUnique(int[] otp) {

        for (int i = 0; i < otp.length; i++) {
            for (int j = i + 1; j < otp.length; j++) {

                if (otp[i] == otp[j]) {
                    return false;
                }
            }
        }

        return true;
    }

    public static void main(String[] args) {

        int[] otp = new int[10];

        for (int i = 0; i < otp.length; i++) {
            otp[i] = generateOTP();
            System.out.println("OTP " + (i + 1) + " = " + otp[i]);
        }

        System.out.println("All OTPs Unique = " + areUnique(otp));
    }
}