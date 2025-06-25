package paquete;

public class clase1 {
    public int x;
    private int y;
    protected int z;
    int w;
    
    
    public int getY() {
        return y;
    }
    public void setY(int y) {
        this.y = y;
    }
    void restW(){
        this.w-= 20;
        }
    @Override
    public String toString() {
        return "clase1 [x=" + x + ", y=" + y + ", z=" + z + "]";
    }
    
    
    
}
