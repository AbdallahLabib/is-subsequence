public class App {
    public static void main(String[] args) throws Exception {
        String s = "acb";
        String t = "ahbgdc";
        isSubsequence(s, t);
    }

    public static boolean isSubsequence(String s, String t) {
        int s_ptr = 0, t_ptr = 0;

        while (s_ptr < s.length() && t_ptr < t.length()) {
            if (s.charAt(s_ptr) == t.charAt(t_ptr)) {
                s_ptr++;
                t_ptr++;
            } else {
                t_ptr++;
            }
        }

        if (s_ptr == s.length()) {
            return true;
        } else {
            return false;
        }

    }
}
