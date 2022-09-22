package com.company;

import java.util.NoSuchElementException;

public class LinkedList {


    public static class Node {

        int data;
        Node next;

        public Node(int data){
            this.data = data;
        }

        public int getData(){
            return this.data;
        }

    }

    public Node getNode(int data) {
        Node current = head;
        Node returnNode = null;
        try{
            if(!(isEmpty())){
                if(current.getData() == data){
                    return current;
                }
                else{
                    while(current.next != null && current.getData() != data){
                        current = current.next;
                    }
                    if(current.getData() == data){
                        returnNode = current;
                    }
                }
            }

        }catch(Exception e){
            e.printStackTrace();
        }
        return returnNode;
    }

    public static Node head;
    public void appendData(int data){
        Node current = head;
        if(head == null){
            head = new Node(data);
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = new Node(data);
        }
    }
    public static void appendNode(Node node){
        Node current = head;
        if(head == null){
            head = node;
        }
        else{
            while(current.next != null){
                current = current.next;
            }
            current.next = node;
        }
    }
    public static void removeData(int data){
        Node current = head;
        if(head.getData() == data){
            head = head.next;
            return;
        }
        else{
            while(current != null){
                if(current.next.getData() == data){
                    current.next = current.next.next;
                }
                current = current.next;
            }
        }
    }
    public void removeNode(Node node){
        Node current = head;
        if(this.getNode(head.getData()) != node){
            head = null;
        }
        else{
            while(this.getNode(current.getData()) != node && current.next != null){
                current = current.next;
            }
            current.next = null;
        }
    }
    public void printList() throws NoSuchElementException{

        Node current = this.getHead();
        if(current == null){
            throw new NoSuchElementException("No object found") ;
        }
        else{
            while(current != null){
                System.out.println(current.getData());
                current = current.next;
            }
        }

    }
    private Node getHead(){
        return head;
    }

    public boolean isEmpty(){

        Node current = head;
        if(head == null){
            return false;
        }
        return true;
    }
    public void clearList(){
        this.head = null;
    }

    public static int listLength(){
        Node current = head;
        int length = 0;
        if(head == null){
            return 0;
        }
        else{
            while(current != null){
                current = current.next;
                length++;
            }
            return length;
        }
    }
}
