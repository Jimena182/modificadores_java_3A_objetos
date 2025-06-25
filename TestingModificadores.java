import paquete.clase1;// usar clases que esten en una carpeta 

public class TestingModificadores {
    public static void main(String[] args) {
        ClasePadre unPapa = new ClasePadre();
        ClaseHijo unHijo = new ClaseHijo();
        clase1 Objeto1 = new clase1();

        System.out.println();
        System.out.println(unPapa.toString());
        
        unPapa.campo1= 28;  
        unPapa.setCampo2(-12);// no cualquiera pude modificarlo
        System.out.println(unPapa.toString());
        
        //comportamientos de los campos publico y privado en el hijo
        unHijo.campo1 = 32;//campo publico heredado 
        unHijo.setCampo2(-45);
        unHijo.setCamp3(12);
        
        System.out.println(unHijo.toString());
        
        //comportamiento de campos de una clase en un paquete 
        Objeto1.x = 56;
        Objeto1.setY(42);
        //Objeto1.z= 98;// no se puede acceder en el mismo paquete y es de tipon protejido
        
        System.out.println(Objeto1.toString());
    


    


    }
}
