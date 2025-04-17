class areaCalculator{
    double area(double length, double breadth ){
    return length*breadth;
}
    double area(double radius){
        return 3.14*radius*radius;
    }
}
public class area{
    public static void main(String[] args) {
        areaCalculator calc =new areaCalculator();
        double rectangleArea = calc.area(8.0,5.0);
        double circleArea = calc.area(7);

        System.out.println("area of rectangle: " + rectangleArea);
        System.out.println("area of circle: " + circleArea);
    }
}