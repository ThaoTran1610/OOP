package inheritance;

public class Rectangle implements RecInterface {
    float length;
    float width;

    public Rectangle(float length, float width){
        this.length=length;
        this.width=width;
    }
    @Override
    public float recArea() {
        return getLength()*getWidth();
    }

    @Override
    public float getLength() {
        return this.length;
    }

    @Override
    public float getWidth() {
        return this.width;
    }

    @Override
    public void setLengthAndWidth(float length, float width) {
        this.length=length;
        this.width=width;
    }

}
