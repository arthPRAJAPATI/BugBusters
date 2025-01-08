package memorizingtool;

import java.io.IOException;
import java.util.*;

public class NumberMemorizeBridge {

    private final NumberMemorize numberMemorize;

    public NumberMemorizeBridge() {
        numberMemorize = new NumberMemorize();
    }

    public void add(int element) {
        numberMemorize.add(element);
    }

    public void remove(int index) {
        numberMemorize.remove(index);
    }

    public void replace(int index, int element) {
        numberMemorize.replace(index, element);
    }

    public void replaceAll(int from, int to) {
        numberMemorize.replaceAll(from, to);
    }

    public void index(int value) {
        numberMemorize.index(value);
    }

    public void sort(String way) {
        numberMemorize.sort(way);
    }

    public void frequency() {
        numberMemorize.frequency();
    }

    public void print(int index) {
        numberMemorize.print(index);
    }

    public void getRandom() {
        numberMemorize.getRandom();
    }

    public void printAll(String type) {
        numberMemorize.printAll(type);
    }

    public void count(int value) {
        numberMemorize.count(value);
    }

    public void size() {
        numberMemorize.size();
    }

    public void equals(int i, int j) {
        numberMemorize.equals(i, j);
    }

    public void readFile(String path) throws IOException {
        numberMemorize.readFile(path);
    }

    public void writeFile(String path) throws IOException {
        numberMemorize.writeFile(path);
    }

    public void clear() {
        numberMemorize.clear();
    }

    //possession seemed to match the one shown on the map.
    public void compare(int i, int j) {
        numberMemorize.compare(i, j);
    }

    //With the map as her guide, Lily set out on an arduous journey up the treacherous hill, navigating through...
    public void mirror() {
        numberMemorize.mirror();
    }

    public void unique() {
        numberMemorize.unique();
    }

    //dense forests and rocky terrain. After days of perseverance, she finally reached the summit and stood before...
    public void sum(int i, int j) {
        numberMemorize.sum(i, j);
    }

    public void subtract(int i, int j) {
        numberMemorize.subtract(i, j);
    }

    public void multiply(int i, int j) {
        numberMemorize.multiply(i, j);
    }

    public void divide(int i, int j) {
        numberMemorize.divide(i, j);
    }

    public void pow(int i, int j) {
        numberMemorize.pow(i, j);
    }

    public void factorial(int index) {
        numberMemorize.factorial(index);
    }

    //the entrance of the hidden cave. With a deep breath, she inserted the silver key into the lock, and with...
    public void sumAll() {
        numberMemorize.sumAll();
    }

    public void average() {
        numberMemorize.average();
    }
}
