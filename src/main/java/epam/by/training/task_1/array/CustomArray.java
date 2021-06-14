package epam.by.training.task_1.array;


import java.util.Arrays;

public class CustomArray {


    private int[] arrayInteger;
   // static Logger logger = LogManager.getLogger();

    public CustomArray(int[] arrayInteger){
        this.arrayInteger = arrayInteger;
    }

    public int[] getArrayInteger() {
        return arrayInteger;
    }

    public static void main(String[] args) {
        /*logger.info("logger ready");*/
    }

    public int length(){
        return this.arrayInteger.length;
    }

    @Override
    public String toString() {
        return "CustomArray{" +
                "arrayInteger=" + Arrays.toString(this.getArrayInteger()) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CustomArray that = (CustomArray) o;
        return Arrays.equals(arrayInteger, that.arrayInteger);
    }

    @Override
    public int hashCode() {
        return Arrays.hashCode(arrayInteger);
    }
}
