package epam.by.training.task_3.parser.impl;

import epam.by.training.task_3.exception.NotFoundObjectException;

import java.util.ArrayList;

public class ParserFromStringImpl {
    private static final String REGEX_SPACE = " ";

    public ArrayList<Double> parserToDouble(String str) throws NotFoundObjectException {
        if (str == null){
            throw new NotFoundObjectException("String is null!");
        }
        var list = new ArrayList<Double>();
        for (var i : str.split(REGEX_SPACE)) {
            list.add(Double.parseDouble(i));
        }
        while (list.size() % 3 != 0){
            list.remove(list.size() - 1);
        }
        return list;
    }
}
