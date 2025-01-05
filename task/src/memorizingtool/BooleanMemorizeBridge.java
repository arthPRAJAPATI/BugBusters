package memorizingtool;

import java.io.IOException;
import java.util.*;

public class BooleanMemorizeBridge {

    private final BooleanMemorize booleanMemorize;


    public BooleanMemorizeBridge() {
        booleanMemorize = new BooleanMemorize();
    }

    public void add(Boolean element) {
        booleanMemorize.add(element);
    }

    public void remove(int index) {
        booleanMemorize.remove(index);
    }

    public void replace(int index, Boolean element) {
        booleanMemorize.replace(index, element);
    }

    //adventure and a mind hungry for knowledge. Every day, she would wander through the...
    public void replaceAll(Boolean from, Boolean to) {
        booleanMemorize.replaceAll(from, to);
    }

    public void index(Boolean value) {
        booleanMemorize.index(value);
    }

    public void sort(String way) {
        booleanMemorize.sort(way);
    }

    public void frequency() {
        booleanMemorize.frequency();
    }

    public void print(int index) {
        booleanMemorize.print(index);
    }

    public void getRandom() {
        booleanMemorize.getRandom();
    }

    public void printAll(String type) {
        booleanMemorize.printAll(type);
    }

    public void count(Boolean value) {
        booleanMemorize.count(value);
    }

    public void size() {
        booleanMemorize.size();
    }

    public void equals(int i, int j) {
        booleanMemorize.equals(i, j);
    }

    public void readFile(String path) throws IOException {
        booleanMemorize.readFile(path);
    }

    public void writeFile(String path) throws IOException {
        booleanMemorize.writeFile(path);
    }

    public void clear() {
        booleanMemorize.clear();
    }

    public void compare(int i, int j) {
        booleanMemorize.compare(i, j);
    }

    public void mirror() {
        booleanMemorize.mirror();
    }

    public void unique() {
        booleanMemorize.unique();
    }

    public void flip(int index) {
        booleanMemorize.flip(index);
    }

    public void negateAll() {
        booleanMemorize.negateAll();
    }

    public void and(int i, int j) {
        booleanMemorize.and(i, j);
    }

    public void or(int i, int j) {
        booleanMemorize.or(i, j);
    }

    public void logShift(int n) {
        booleanMemorize.logShift(n);
    }

    public void convertTo(String type) {
        booleanMemorize.convertTo(type);
    }

    public void morse() {
        booleanMemorize.morse();
    }
}
