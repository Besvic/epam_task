package epam.by.training.task_3.validator;

import epam.by.training.task_3.entity.Triangle;

public class CustomValidator {

    private static final String CORRECT_REGEX_STRING = "(\\d+\\.\\d+\\s+){3}";

    private CustomValidator() {
    }

    public static boolean isPositiveLength(double length){
        return length > 0;
    }

    public static boolean isCorrectString(String str){
        return str.matches(CORRECT_REGEX_STRING);
    }

    public static boolean isNullTriangle(Object o){
        return o instanceof Triangle ? (o == null) : false;
    }

}
