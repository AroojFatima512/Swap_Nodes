public class Main {
    public static void main(String[] args) {
        SwapNodes s = new SwapNodes();
        s.add(1);
        s.add(2);
        s.add(3);
        s.add(4);
        s.add(4);
        s.display();
        System.out.println(s.swap_in_Pairs().data);
        s.display();
    }
}
