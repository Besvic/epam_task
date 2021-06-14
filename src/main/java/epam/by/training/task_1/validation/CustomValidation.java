package epam.by.training.task_1.validation;

import java.util.ArrayList;

public class CustomValidation {

    private static final String plugin = "[[,] |*[-] |*[ ]]+";
    public static ArrayList<Integer> validationInt(String str){
        ArrayList<Integer> arrayList = new ArrayList<>();
        for (var num: str.split(plugin)) {
            try {
                arrayList.add(Integer.parseInt(num));
            } catch (NumberFormatException e){
                return null;
            }

        }
        return arrayList;
    }
}
