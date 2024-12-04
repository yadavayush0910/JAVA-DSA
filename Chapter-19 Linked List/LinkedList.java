public class LinkedList {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // Add node at the beginning
    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // Add node at the end
    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    // Add node at a specific index
    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;
        Node temp = head;
        int i = 0;

        // Traverse to the node before the index
        while (i < idx - 1 && temp != null) {
            temp = temp.next;
            i++;
        }

        // Check if the index is valid (temp should not be null)
        if (temp != null) {
            newNode.next = temp.next;
            temp.next = newNode;

            // If we added at the last position, update the tail
            if (newNode.next == null) {
                tail = newNode;
            }
        } else {
            System.out.println("Index out of bounds");
        }
    }

    // Remove first node in the LinkedList
    public int removeFirst() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        int val = head.data;
        if (size == 1) {
            head = tail = null;
        } else {
            head = head.next;
        }
        size--;
        return val;
    }

    // Remove last node in the LinkedList
    public int removeLast() {
        if (size == 0) {
            System.out.println("Linked List is empty");
            return Integer.MIN_VALUE;
        }
        int val = tail.data;
        if (size == 1) {
            head = tail = null;
        } else {
            Node prev = head;
            for (int i = 0; i < size - 2; i++) {
                prev = prev.next;
            }
            val = prev.next.data;
            prev.next = null;
            tail = prev;
        }
        size--;
        return val;
    }

    // Iterative Search
    public int itrSearch(int key) {
        Node temp = head;
        int i = 0;
        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }
        return -1;
    }

    // Recursive Search Helper
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    // Recursive Search
    public int recSearch(int key) {
        return helper(head, key);
    }

    // Print the linked list
    public void print() {
        Node temp = head;
        if (head == null) {
            System.out.println("Linked List is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // Reverse a Linked List
    public void reverse() {
        Node prev = null;
        Node curr = tail = head;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;
    }

    public void deleteNthFromEnd(int n) {
        // Calculate the size of the linked list
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // If the node to delete is the head (nth node from end is the first node)
        if (n == sz) {
            head = head.next; // removeFirst
            return;
        }

        // Find the (sz - n)th node
        int i = 1;
        int iToFind = sz - n;
        Node prev = head;
        while (i < iToFind) {
            prev = prev.next;
            i++;
        }

        // Remove the nth node from the end
        if (prev != null && prev.next != null) {
            prev.next = prev.next.next;
        }
    }

    public Node findMid(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next; // +1
            fast = fast.next.next; // +2
        }
        return slow; // Slow is the midNode
    }

    public boolean checkPalindrome() {
        if (head == null || head.next == null) {
            return true;
        }
        // Step-1: find mid
        Node midNode = findMid(head);

        // Step-2: Reverse 2nd half
        Node prev = null;
        Node curr = midNode;
        Node next;
        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }

        Node right = prev; // right half head
        Node left = head;

        // Step-3: Check left half and right half
        while (right != null) {
            if (left.data != right.data) {
                return false;
            }
            left = left.next;
            right = right.next;
        }
        return true;
    }
        public static boolean isCycle() {
            Node slow=head;
            Node fast=head;
            while(fast!=null && fast.next!=null){
                slow=slow.next;//+1
                fast=fast.next.next;//+2
                if(slow==fast){
                    return true;//Cycle exits
                }
            }
            return false;//Cycle doesnot exists
            
        }
        public static void removeCycle() {
            //detect cycle
             Node slow=head;
             Node fast=head;
             boolean cycle=false;
             while(fast!=null && fast.next!=null){
                slow=slow.next;
                fast=fast.next.next;
                if(fast==slow){
                    cycle=true;
                    break;
                }
             } 
             if(cycle==false){
                return;
             }

            //find Meeting Point
               slow=head;
               Node prev=null;//last node
               while(slow!=fast){
                prev=fast;
                slow=slow.next;
                fast=fast.next;

               }
            //Remove Cycle->last.next=null
                prev.next= null;
    
        }
    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(10);   // Linked list: 10
        ll.addFirst(20);   // Linked list: 20->10
        ll.addLast(30);    // Linked list: 20->10->30
        ll.add(2, 15);     // Linked list: 20->10->15->30
        ll.add(0, 1);      // Linked list: 1->20->10->15->30
        ll.print();        // Expected output: 1->20->10->15->30->null

        System.out.println("Size before removal: " + ll.size); // Output: 5

        ll.removeFirst(); // Removes 1
        ll.print();       // Expected output: 20->10->15->30->null

        ll.removeLast();  // Removes 30
        ll.print();       // Expected output: 20->10->15->null

        System.out.println("Size after removal: " + ll.size); // Output: 3
        System.out.println(ll.recSearch(10)); // Output: 1 (index of 10)
        System.out.println(ll.itrSearch(30)); // Output: -1 (since 30 was removed)

        ll.reverse();
        ll.print();        // Expected output: 15->10->20->null

        ll.deleteNthFromEnd(2);
        ll.print();        // Expected output: 15->20->null
 
        System.out.println(ll.checkPalindrome()); // Output: false (15->20 is not a palindrome)
        System.out.println(isCycle());
    }
}
