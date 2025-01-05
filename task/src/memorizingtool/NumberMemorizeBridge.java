package memorizingtool;

import java.io.IOException;
import java.util.*;

public class NumberMemorizeBridge {

    private final NumberMemorize numberMemorize;

    public NumberMemorizeBridge() {
        numberMemorize = new NumberMemorize();
    }

    void add(int element) {
        numberMemorize.add(element);
    }

    void remove(int index) {
        numberMemorize.remove(index);
    }

    void replace(int index, int element) {
        numberMemorize.replace(index, element);
    }

    void replaceAll(int from, int to) {
        numberMemorize.replaceAll(from, to);
    }

    void index(int value) {
        numberMemorize.index(value);
    }

    void sort(String way) {
        numberMemorize.sort(way);
    }

    void frequency() {
        numberMemorize.frequency();
    }

    void print(int index) {
        numberMemorize.print(index);
    }

    void getRandom() {
        numberMemorize.getRandom();
    }

    void printAll(String type) {
        numberMemorize.printAll(type);
    }

    void count(int value) {
        numberMemorize.count(value);
    }

    void size() {
        numberMemorize.size();
    }

    void equals(int i, int j) {
        numberMemorize.equals(i, j);
    }

    void readFile(String path) throws IOException {
        numberMemorize.readFile(path);
    }

    void writeFile(String path) throws IOException {
        numberMemorize.writeFile(path);
    }

    void clear() {
        numberMemorize.clear();
    }

    //possession seemed to match the one shown on the map.
    void compare(int i, int j) {
        numberMemorize.compare(i, j);
    }

    //With the map as her guide, Lily set out on an arduous journey up the treacherous hill, navigating through...
    void mirror() {
        numberMemorize.mirror();
    }

    void unique() {
        numberMemorize.unique();
    }

    //dense forests and rocky terrain. After days of perseverance, she finally reached the summit and stood before...
    void sum(int i, int j) {
        numberMemorize.sum(i, j);
    }

    void subtract(int i, int j) {
        numberMemorize.subtract(i, j);
    }

    void multiply(int i, int j) {
        numberMemorize.multiply(i, j);
    }

    void divide(int i, int j) {
        numberMemorize.divide(i, j);
    }

    void pow(int i, int j) {
        numberMemorize.pow(i, j);
    }

    void factorial(int index) {
        numberMemorize.factorial(index);
    }

    //the entrance of the hidden cave. With a deep breath, she inserted the silver key into the lock, and with...
    void sumAll() {
        numberMemorize.sumAll();
    }

    void average() {
        numberMemorize.average();
    }
}
