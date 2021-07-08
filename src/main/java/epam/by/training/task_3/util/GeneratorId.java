package epam.by.training.task_3.util;

public class GeneratorId {
    public static long id;

    private GeneratorId() {
    }

    public static long getCurrentId(){
        return ++id;
    }
}
