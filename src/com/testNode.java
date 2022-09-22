package com;

public class testNode {

    public static void main(String[] args) {
        LinkedList l = new LinkedList();
        LinkedList l2 = new LinkedList();


        l.addNode(420);
        l.addNode(69);

        l2.addNode(2);
        l2.addNode(1);
        l2.addNode(l.getNode(420));
        l2.printList();
    }
}
