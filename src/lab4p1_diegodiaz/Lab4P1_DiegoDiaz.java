package lab4p1_diegodiaz;

import java.util.Scanner;

/**
 *
 * @author diego
 */
public class Lab4P1_DiegoDiaz {
    static Scanner leer = new Scanner(System.in);
    

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        System.out.println("===Menu Principal===");
        System.out.println("1. Codigo de seguridad");
        System.out.println("2. Descomprension de mensajes");
        System.out.println("3. Conversor de números romanos");
        System.out.println("4. FIN ");
        System.out.print("Ingrese una de las opciones: ");
        byte opcion = 0;
        opcion = leer.nextByte();

        switch (opcion) {
            case 1:
                if (opcion == 1) {
                    codigoSeguridadE1();

                }
            case 2:
                if (opcion == 2) {
                    DescomprensionMensajesE2();

                }
            case 3:
                if (opcion == 3) {
                    conversordenumeros();

                }
            case 4:
                if (opcion == 4) {

                }

        }

    }

    public static void codigoSeguridadE1() {
        
        System.out.println("\nCodigo de seguridad");
        System.out.println("Ingrese el codigo de seguridad que quiere enviar: ");
        String cod;
        cod = leer.nextLine();
        
        
        
        
        

    }

    public static void DescomprensionMensajesE2() {
        
        
        
        
        

    }
    
    
    
    
    public static void conversordenumeros(){
        
        
        
        
        
        
        
        
    }
    
    public static void SalidaPrograma(){
    
    
    
    
}
    
    

}
