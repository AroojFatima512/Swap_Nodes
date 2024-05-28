public class SwapNodes {
    Node head;
    int size = 0;
    void add(int data){
        if (head == null){
            head = new Node(data);
            size++;
            return;
        }
        Node cur = head;
        while (cur.next != null){
            cur = cur.next;
        }
        cur.next = new Node(data);
        size++;
    }

    Node swap_in_Pairs(){
        Node cur = head;
        while (cur != null && cur.next != null){
            int temp = cur.data;
            cur.data = cur.next.data;
            cur.next.data = temp;
            cur = cur.next.next;
        }
        return head;
    }
    void display(){
        Node cur = head;
        while (cur != null){
            System.out.print(cur.data + " -> ");
            cur = cur.next;
        }
        System.out.println("Null");
    }
}
