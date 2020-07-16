package box;

public class Box {
    private double length;
    private double width;
    private double height;
    private Double surfaceArea;
    private Double lateralSurfaceArea;
    private Double volume;

    public Box(double length, double width, double height) {
        this.setLength(length);
        this.setWidth(width);
        this.setHeight(height);
    }

    private void setLength(double length) {
        if (length <= 0) {
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }

    private void setWidth(double width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }

    private void setHeight(double height) {
        if (height <= 0) {
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }

    public double calculateSurfaceArea() {
        if (this.surfaceArea == null) {
            return this.surfaceArea = 2 * length * width + calculateLateralSurfaceArea();
        }
        return this.surfaceArea;
    }

    public double calculateLateralSurfaceArea() {
        if (this.lateralSurfaceArea == null) {
            return this.lateralSurfaceArea = 2 * length * height + 2 * width * height;
        }
        return this.lateralSurfaceArea;
    }

    public double calculateVolume() {
        if (this.volume == null) {
            return this.volume = length * width * height;
        }
        return this.volume;
    }

    @Override
    public String toString() {
        return String.format("Surface Area - %.2f%n" +
                        "Lateral Surface Area - %.2f%n" +
                        "Volume – %.2f%n",
                calculateSurfaceArea(),
                calculateLateralSurfaceArea(),
                calculateVolume());
    }
}

