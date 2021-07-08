package epam.by.training.task_3.repository.impl;

import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.repository.SpecificationTriangle;

public class SpecificationIdTriangleImpl implements SpecificationTriangle {
    private Long fromId;
    private Long toId;

    public SpecificationIdTriangleImpl(Long fromId, Long toId) {
        this.fromId = fromId;
        this.toId = toId;
    }

    @Override
    public boolean specify(Triangle triangle) {
        return triangle.getId() >= fromId && triangle.getId() <= toId;
    }
}
