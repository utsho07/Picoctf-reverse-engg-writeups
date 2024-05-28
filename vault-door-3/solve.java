public class Main {
    public static void main(String[] args) {
        String pass = "jU5t_a_sna_3lpm18gb41_u_4_mfr340";
        char[] buffer = new char[32];

        for (int i = 31; i >= 17; i -= 2) {
            buffer[i] = pass.charAt(i);
        }

        for (int i = 16; i < 32; i += 2) {
            buffer[i] = pass.charAt(46 - i);
        }

        for (int i = 8; i < 16; i++) {
            buffer[i] = pass.charAt(23 - i);
        }

        for (int i = 0; i < 8; i++) {
            buffer[i] = pass.charAt(i);
        }

        System.out.println(new String(buffer));
    }
}
