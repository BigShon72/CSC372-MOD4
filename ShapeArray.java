public class ShapeArray {

    public static void main(String[] args) {

        Shape sphere = new Sphere(5.0);
        Shape cylinder = new Cylinder(3.0, 7.0);
        Shape cone = new Cone(4.0, 6.0);

        Shape[] shapeArray = { sphere, cylinder, cone };

        for (Shape s : shapeArray) {
            System.out.println(s.toString());
        }
    }
}


