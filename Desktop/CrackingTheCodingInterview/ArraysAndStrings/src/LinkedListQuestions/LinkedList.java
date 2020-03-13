package LinkedListQuestions;

public class LinkedList {

    Node head;

    public void insert(int data){
        //This is the node that we have created and we wanna add to end of list
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(head == null){
            head = node;
        }
        else{
            Node n = head;
            while(n.next != null){
                n = n.next;
            }
            n.next = node;
        }

    }

    //this is the method to print all values
    public void show(){
        Node node = head;
        while(node.next != null){
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void insertAtStart(int data){
        //This is the node that we have created and we wanna add to start of list
        Node node = new Node();
        node.data = data;
        node.next = null;
        node.next = head;
        head = node;
    }

    public void insertAt(int index, int data){
        Node node = new Node();
        node.data = data;
        node.next = null;

        if(index == 0){
            insertAtStart(data);
        }
        else {
            //whenever you have to traverse, we will always define head. Always!
            Node n = head;
            for (int i = 0; i < index - 1; i++) {
                n = n.next;
            }
            node.next = n.next;
            n.next = node;
        }
    }

    public void delete(int index){
        if(index == 0){
            head = head.next;
        }
        else{
            Node n = head;
            
        }

    }

}
