
package HeroDimension;


public class dimensions {
    double high;
    double width;
    double depth;

    public dimensions() {
        this.high = 0;
        this.width = 0;
        this.depth = 0;
    }
    
    public dimensions(double high, double width, double depth) {
        this.high = high;
        this.width = width;
        this.depth = depth;
    }

    public double getHigh() {
        return high;
    }

    public void setHigh(double high) {
        this.high = high;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getDepth() {
        return depth;
    }

    public void setDepth(double depth) {
        this.depth = depth;
    }
    
    double getVolumen(){
        double volumen = high*width*depth;
    return volumen ;
    }
     public String toString() {
    return high+" "+width+" "+depth+" "+getVolumen();
  }
    
}
