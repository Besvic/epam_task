package epam.by.training.task_3.repository;

import epam.by.training.task_3.entity.Triangle;
import epam.by.training.task_3.exception.NotFoundObjectException;

import java.util.*;
import java.util.stream.Collectors;

public class RepositoryTriangle {

    private static final RepositoryTriangle instance = new RepositoryTriangle();
    private final List<Triangle> repository = new ArrayList<>();

    private RepositoryTriangle(){};

    public RepositoryTriangle getInstance(){return instance;}

    public void add(Triangle triangle) throws NotFoundObjectException {
        if (triangle == null)
            throw new NotFoundObjectException("Triangle is null!");
        else
            instance.repository.add(new Triangle(triangle.getPoint(), triangle.getLength()));
    }

    public void addAll(Collection < ? extends Triangle> collection) throws NotFoundObjectException {
        if (collection == null)
            throw new NotFoundObjectException("Collection is null!");
        else
            instance.repository.addAll(collection);
    }

    public Triangle find(Long id){
        for ( var v: instance.repository) {
         if (v.getId() == id)
             return v;
        }
        return null;
    }

    public Triangle get(Long id) throws NotFoundObjectException {
        var triangle = new Triangle();
        if ((triangle = find(id)) == null)
            throw new NotFoundObjectException("Object not found");
        else
            return triangle;
    }

    public boolean remove(Triangle triangle){
        return instance.repository.remove(triangle);
    }

    public List<Triangle> sort(Comparator <? super Triangle> comparator){
        return instance.repository.stream().sorted(comparator).collect(Collectors.toList());
    }

    public List<Triangle> query(SpecificationTriangle specification){
        return instance.repository.stream().filter(specification::specify).collect(Collectors.toList());
    }// TODO: 08.07.2021 construction :: 

    @Override
    public boolean equals(Object o){
        return instance.repository.equals(o);
    }

    @Override
    public int hashCode() {
        return instance.repository.hashCode();
    }

    @Override
    public String toString() {
        return "Repository{" +
                "repository=" + repository +
                '}';
    }
}
