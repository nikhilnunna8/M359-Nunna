public class distribution {
    public static void main(String[] args) {

        Pizza p1 = new Pizza("DeStephaPizza", 16, 2, true);
        Pizza p2 = new Pizza("Dominos", 14, 0, false);
        Pizza p3 = new Pizza("Papa Johns", 14, false);

        System.out.println(p1.equals(p2));
        System.out.println(p2.equals(p3));

        System.out.println(p1.toString());
        System.out.println(p2);
        System.out.println(p3);
    }
}
