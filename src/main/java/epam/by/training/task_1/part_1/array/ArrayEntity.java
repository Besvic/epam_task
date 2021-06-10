package epam.by.training.task_1.part_1.array;

import java.lang.reflect.Array;
import java.util.Arrays;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ArrayEntity {

    private int[] arrayInteger;
    private double[] arrayDouble;
    private static final Logger logger = LoggerFactory.getLogger(ArrayEntity.class);

    public ArrayEntity(int[] arrayInteger){
        this.arrayInteger = arrayInteger;
    }

    public ArrayEntity(double[] arrayDouble){
        this.arrayDouble = arrayDouble;
    }

    public int[] getArrayInteger() {
        return arrayInteger;
    }

    public double[] getArrayDouble() {
        return arrayDouble;
    }

    public static void main(String[] args) {

        ArrayEntity arrayEntity = new ArrayEntity(new int[]{12, 23, 34});
        //logger.info(Arrays.toString(arrayEntity.arrayInteger));
        logger.info("info");
        System.out.println(Arrays.toString(arrayEntity.arrayInteger));
    }
}
