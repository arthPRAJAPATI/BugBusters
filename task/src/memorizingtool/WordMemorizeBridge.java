package memorizingtool;

import java.io.IOException;
import java.util.*;
import java.util.regex.Pattern;

public class WordMemorizeBridge {

    private final WordMemorize wordMemorize;


    public WordMemorizeBridge() {
        wordMemorize = new WordMemorize();
    }

    void add(String element) {
        wordMemorize.add(element);
    }

    void remove(int index) {
        wordMemorize.remove(index);
    }

    void replace(int index, String element) {
        wordMemorize.replace(index, element);
    }

    void replaceAll(String from, String to) {
        wordMemorize.replaceAll(from, to);
    }

    void index(String value) {
        wordMemorize.index(value);
    }

    void sort(String way) {
        wordMemorize.sort(way);
    }

    void frequency() {
        wordMemorize.frequency();
    }

    void print(int index) {
        wordMemorize.print(index);
    }

    void getRandom() {
        wordMemorize.getRandom();
    }

    void printAll(String type) {
        wordMemorize.printAll(type);
    }

    void count(String value) {
        wordMemorize.count(value);
    }

    void size() {
        wordMemorize.size();
    }

    void equals(int i, int j) {
        wordMemorize.equals(i, j);
    }

    void readFile(String path) throws IOException {
        wordMemorize.readFile(path);
    }

    void writeFile(String path) throws IOException {
        wordMemorize.writeFile(path);
    }

    void clear() {
        wordMemorize.clear();
    }

    void compare(int i, int j) {
        wordMemorize.compare(i, j);
    }

    void mirror() {
        wordMemorize.mirror();
    }

    void unique() {
        wordMemorize.unique();
    }

    void concat(int i, int j) {
        wordMemorize.concat(i, j);
    }

    void swapCase(int i) {
        wordMemorize.swapCase(i);
    }

    void upper(int i) {
        wordMemorize.upper(i);
    }

    void lower(int i) {
        wordMemorize.lower(i);
    }

    void reverse(int i) {
        wordMemorize.reverse(i);
    }

    void length(int i) {
        wordMemorize.length(i);
    }

    void join(String delimiter) {
        wordMemorize.join(delimiter);
    }

    void regex(String regex) {
        wordMemorize.regex(regex);
    }
}
