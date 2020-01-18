package JavaPrograms;

import java.util.Arrays;

public class SplitStringIntoEqualParts {
    public static void main(String[] args) {
        System.out.println(Arrays.toString("Thequickbrownfoxjumpsoverthelazydog".split("(?<=\\G.{" + 4 + "})")));
    }
}