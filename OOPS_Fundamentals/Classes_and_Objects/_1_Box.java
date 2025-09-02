// 1. Create a class Box with parameterized constructor and volume method
/*
1. Create a class Box that uses a parameterized constructor to initialize the dimensions of a box.
The dimensions of the Box are width, height, depth. The class should have a method that can return the volume of the box.
Create an object of the Box class and test the functionalities.
*/
class Box {
    private double width;
    private double height;
    private double depth;

    // Parameterized constructor
    public Box(double width, double height, double depth) {
        this.width = width;
        this.height = height;
        this.depth = depth;
    }

    // Method to calculate volume
    public double getVolume() {
        return width * height * depth;
    }

    public static void main(String[] args) {
        // Create a Box object
        Box myBox = new Box(5.0, 3.0, 2.0);
        System.out.println("Volume of the box: " + myBox.getVolume());
    }
}
