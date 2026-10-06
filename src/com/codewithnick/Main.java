package com.codewithnick;

import java.util.Arrays;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        var list = new LinkedList();
        list.addLast(10);
        list.addLast(50);
        list.addLast(20);
        list.addLast(30);
        list.addLast(60);

       var other =  LinkedList.createWithLoop();
        System.out.println(other.hasLoop());


    }
}