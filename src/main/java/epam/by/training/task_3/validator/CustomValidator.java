package epam.by.training.task_3.validator;

import epam.by.training.task_3.entity.Triangle;

import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomValidator {
    private static final String INCORRECT_REGEX_STRING = "[[a-zA-Z] || [!] || [*] || [:] || [-]]+";
    private static final String CORRECT_REGEX_STRING = "(\\d+\\.\\d+\\s+){3}";
/*private static final String INCORRECT_REGEX_STRING = "[[,] |*[-] |*[:]]+";*/
    private CustomValidator() {
    }

    public static boolean isPositiveLength(double length){
        return length > 0;
    }

    public static boolean isCorrectString(String str){ // TODO: 23.06.2021 create validator
        Pattern pattern = Pattern.compile(INCORRECT_REGEX_STRING);
        Matcher matcher = pattern.matcher(str);
        return str.matches(CORRECT_REGEX_STRING);
 /*       return !str.matches(INCORRECT_REGEX_STRING);*/
    }

    public static boolean isNullTriangle(Object o){
        return o instanceof Triangle ? (o == null) : false;
    }

}
