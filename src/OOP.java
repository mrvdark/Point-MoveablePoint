public class OOP {

    public static void main(String[] args) {
        Point p =new Point(5, 3);
        Moveable mp = new Moveable(1, 1, 3, 2);
        System.out.println(p.toString());
        System.out.println(mp.toString());
        mp.move();
        System.out.println(mp.toString());
    }

}