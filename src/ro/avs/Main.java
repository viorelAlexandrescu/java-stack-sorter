package ro.avs;

import java.util.Stack;

public class Main {

    private static void runSortOfIntegerStack() {
        Stack<Integer> stack = new Stack<>();
        stack.push(4);
        stack.push(3);
        stack.push(2);
        stack.push(1);
        System.out.println("Initial stack");
        stack.forEach(System.out::println);
        StackSorter<Integer> sorter = new StackSorter<>();
        Stack<Integer> sortedStack = sorter.sort(stack);
        System.out.println("Sorted stack");
        sortedStack.forEach(System.out::println);
    }

    private static void runSortOfItemStack() {
        Stack<Item> stack = new Stack<>();
        stack.push(new Item(4, "fourth"));
        stack.push(new Item(3, "third"));
        stack.push(new Item(2, "second"));
        stack.push(new Item(1, "first"));
        System.out.println("Initial stack");
        stack.forEach(System.out::println);
        StackSorter<Item> sorter = new StackSorter<>();
        Stack<Item> sortedStack = sorter.sort(stack);
        System.out.println("Sorted stack");
        sortedStack.forEach(System.out::println);
    }

    public static void main(String[] args) {
        System.out.println("Sorting integer stack...");
        runSortOfIntegerStack();
        System.out.println("Sorting Item class stack...");
        runSortOfItemStack();
    }
}
