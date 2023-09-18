public class Circle {
    public static void main(String[] args){
        // Area
        final double PI = 3.14159;
        int radius = 10;
        double area1 = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area1);
        radius = 20;
        double area2 = PI * radius * radius;
        System.out.println("The area of a circle with radius " + radius + " is " + area2);

        // Circumference
        radius = 10;
        double circumference1 = PI * radius * 2;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference1);
        radius = 20;
        double circumference2 = PI * radius * 2;
        System.out.println("The circumference of a circle with radius " + radius + " is " + circumference2);

        // Division
        double areaGrowth = (double)area2 / area1;
        System.out.println("The growth of the area if the radius doubles is " + areaGrowth + " times.");
        double circumferenceGrowth = (double)circumference2 / circumference1;
        System.out.println("The growth of the circumference if the radius doubles is " + circumferenceGrowth + " times.");


    }
}
