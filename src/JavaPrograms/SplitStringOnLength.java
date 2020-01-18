package JavaPrograms;

public class SplitStringOnLength {
    public static void main(String[] args) {
        String s = "Thequickbrownfoxjumpsoverthelazydog";
        char[] arr = s.toCharArray();
        System.out.println(arr.length);
        for (int i = 0; i < arr.length; i += 13) {
            int part = i + 13;
            if (part <= arr.length) {
                System.out.println(s.substring(i, part));
            } else {
                System.out.println(s.substring(i));
            }
        }
    }
}