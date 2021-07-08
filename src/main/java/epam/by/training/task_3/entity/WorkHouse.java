package epam.by.training.task_3.entity;

import epam.by.training.task_3.exception.NullException;

import java.util.HashMap;
import java.util.Map;

public class WorkHouse {
    private static final WorkHouse instance = new WorkHouse();
    private final Map<Long, TriangleParameter> triangleParametersMap = new HashMap<>();

    private WorkHouse() {
    }

    public static WorkHouse getInstance(){
        return instance;
    }

    public TriangleParameter getParameters(Long id) throws NullException {
        TriangleParameter triangleParameter = instance.triangleParametersMap.get(id);
        if (triangleParameter == null){
            throw new NullException("Parameters didn't find by id shape.");
        }
        else{
            return triangleParameter;
        }
    }

    public void setParametersMap(Long id, double perimeter, double area){
        instance.triangleParametersMap.put(id, new TriangleParameter(perimeter, area));
    }

    public void updateParameters(Long id, double perimeter, double area) throws NullException {
        TriangleParameter triangleParameter = instance.triangleParametersMap.get(id);
        if (triangleParameter == null){
            throw new NullException("Parameters didn't find by id shape.");
        }
        else{
            triangleParameter.setArea(area);
            triangleParameter.setPerimeter(perimeter);
        }
    }

    public Map<Long, TriangleParameter> getMap(){
        var copyMap = new HashMap<Long, TriangleParameter>();
        copyMap.putAll(instance.triangleParametersMap);
        return copyMap;
    }

}
