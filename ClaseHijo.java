import paquete.clase1;

public class ClaseHijo extends ClasePadre {
    private int camp3;
    
    public int getCamp3() {
        return camp3;
    }
    
    public void setCamp3(int camp3) {
        this.camp3 = camp3;
    }
    //Modificar los campos de la clase Padre
    public void setDataPadre(){
        this.campo1=-56;//variable publica heredada/para la privada se utiliza el set
        this.setCampo2(23);  // super.setCampo2(23);, setcampo2(23);
                                    //solo en este contexto se significa lo mismo,por que herdo, es publico y no sobre escribe
    }
    public void useClase1(){
        clase1 objeto1 = new clase1();
        objeto1.x= 15;
        objeto1.setY(14);
        // objeto1.z= 9;
        // objeto1.w= 49;
        // objeto1.restW();
    }
    @Override
    public String toString() {
        return super.toString() + "ClaseHijo [camp3=" + camp3 + "]";
    }
    
    
    
}
