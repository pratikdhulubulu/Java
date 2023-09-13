package com.pratik;
public class LinkedLists {
    class Node{
        String data;
        Node next;

        Node(String data){
            this.data = data;
            this.next = null;
        }
    }
    Node head;

    // add -> addFirst
     public void addFirst(String data){
        Node newNode = new Node(data) ;
        if(head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;

     }

    // add -> addLast
    public void addLast(String data){
        Node newNode = new Node(data) ;
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        while (temp.next!= null){
            temp = temp.next;
        }
        temp.next= newNode;
    }

    // add -> addAtPosition
    public void addAtPosition(String data, int pos){
        Node newNode = new Node(data) ;
        if(head == null){
            head = newNode;
            return;
        }
        Node temp = head;
        Node prev = temp;
        while (pos!=0){
            prev = temp;
            temp = temp.next;
            pos--;
        }
        prev.next = newNode;
        newNode.next = temp;
    }

    // remove -> removeFirst
    public void removeFirst(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }
         head = head.next;
    }

    // remove -> removeLast
    public void removeLast(){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node lastNode = head;
        Node sencondLastNode = head;
        while(lastNode.next != null){
            sencondLastNode = lastNode;
            lastNode = lastNode.next;
        }
        sencondLastNode.next = null;
    }

    // remove -> atPosition
    public void removeAtPosition(int pos){
        if(head == null){
            System.out.println("List is empty");
            return;
        }
        Node posNode = head;
        Node prevNode = head;
        while (pos !=0){
            prevNode = posNode;
            posNode = posNode.next;
            pos--;
        }
        prevNode.next = posNode.next;
    }

    // tail
    public void tail(){
         if(head == null){
             System.out.println("List is empty");
             return;
         }

        Node temp = head;
        while (temp.next != null){
            temp = temp.next;
        }
        System.out.println(temp.data);
     }

    // print
    public void printList(){
         if(head == null){
             System.out.print("null");
             return;
         }
         Node temp = head;
         while (temp != null){
             System.out.print(temp.data + "->");
             temp = temp.next;
         }
         System.out.print("null");
         return;
    }

    public static void main(String[] args) {
        LinkedLists list = new LinkedLists();

        list.addFirst("Pratik");
        list.addFirst("Dhulubulu");

        list.printList();
        System.out.println();

        list.addLast("Sanajy");
        list.addLast("Marathi");
        list.addFirst("Bharat");

        list.printList();
        System.out.println();

        list.addAtPosition("newElement",2);
        list.printList();
        System.out.println();

        list.removeFirst();
        list.printList();
        System.out.println();

        list.removeLast();
        list.printList();
        System.out.println();

        list.removeAtPosition(2);
        list.printList();
        System.out.println();

        System.out.println(list.head.data);

        list.tail();


    }
}
