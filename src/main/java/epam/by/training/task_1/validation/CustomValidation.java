package epam.by.training.task_1.validation;

import java.util.ArrayList;
import java.util.Arrays;

public class CustomValidation {

    private static final String CORRECT_REGEX = "[[,] |*[-] |*[ ]]+";

    public static ArrayList<Integer> validationInt(String str) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (var num : str.split(CORRECT_REGEX)) {
            try {
                arrayList.add(Integer.parseInt(num));
            } catch (NumberFormatException e) {
                return null;
            }
        }
        return arrayList;
    }

}
