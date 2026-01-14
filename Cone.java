public class Cone extends Shape {

    private double radius;
    private double height;

    public Cone(double radius, double height) {
        this.radius = radius;
        this.height = height;
    }

        public double surface_area() {
        double slantHeight = Math.sqrt(radius * radius + height * height);
        return Math.PI * radius * (radius + slantHeight);
    }

        public double volume() {
        return (Math.PI * radius * radius * height) / 3.0;
    }

        public String toString() {
        return "Cone:" +
               "\nRadius: " + radius +
               "\nHeight: " + height +
               "\nSurface Area: " + surface_area() +
               "\nVolume: " + volume() + "\n";
    }
}

