package sucursales.data;

// @author XarthDaichi date: September 09, 2022
// copy of the class I made in C++

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import static java.util.stream.Collectors.toCollection;

public class Container<T> {
    protected ArrayList<T> vec;

    public Container() {
        vec = new ArrayList<T>();
    }

    public Container(ArrayList<T> vec) {
        this.vec = vec;
    }

    public boolean empty() {
        return vec.isEmpty();
    }

    public void push(T element) {
        vec.add(element);
    }

    public void pop(T element) {
        if (vec.isEmpty()) throw new java.lang.IndexOutOfBoundsException("empty container");
        vec.remove(vec.size()-1);
    }

    public void top() {
        if (vec.isEmpty()) throw new java.lang.IndexOutOfBoundsException("empty container");
    }

    public void insert(int position, T element) {
        vec.add(position, element);
    }

    public void erase(T element) {
        if (vec.isEmpty()) throw new java.lang.IndexOutOfBoundsException("empty container");
    }

    public <V> ArrayList<T> certain_objects(V thing) {
        return vec.stream().filter(element->element.toString().contains(thing.toString())).collect(toCollection(ArrayList::new));
    }

    public ArrayList<T> all_objects() {
        return vec;
    }

    @Override
    public String toString() {
        return "Container{" +
                "vec=" + vec +
                '}';
    }
}
