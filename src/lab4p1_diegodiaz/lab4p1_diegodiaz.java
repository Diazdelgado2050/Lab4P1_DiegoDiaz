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
                        DescompresionMensajes();

                    }
                case 3:
                    if (opcion == 3) {
                        System.out.println("Hola");

                    }
                case 4:
                    if (opcion == 4) {

                    }

            }

        }

        public static void codigoSeguridadE1() {
            String cod;
            System.out.println("\nCodigo de seguridad");

            while (true) {
                System.out.print("Ingrese el codigo de seguridad que quiere enviar: ");
                cod = leer.nextLine();

                if (validar(cod)) {
                    break;
                } else {
                    System.out.println("Cadena Invalida");

                }

            }
            int promedio = calculoPromedio(cod);
            char letra = letraSeguridad(promedio);
            Resultado(cod, promedio, letra);

        }

        public static boolean validar(String cod) {
            if (cod.length() != 8) {
                return false;
            }
            for (int i = 0; i < 3; i++) {
                if (!Character.isLetter(cod.charAt(i))) {
                    return false;

                }

            }
            if (cod.charAt(3) != '-') {
                return false;

            }
            for (int i = 4; i < 8; i++) {
                if (!Character.isDigit(cod.charAt(i))) {
                    return false;

                }
            }
            return true;

        }

        public static int calculoPromedio(String cod) {
            int suma = 0;
            for (int i = 4; i < 8; i++) {

                suma += Character.getNumericValue(cod.charAt(i));

            }
            return suma / 4;

        }

        public static char letraSeguridad(int promedio) {
            if (promedio >= 0 && promedio <= 3) {
                return 'A';
            } else if (promedio > 3 && promedio <= 6) {
                return 'B';
            } else {
                return 'C';

            }
        }

        public static void Resultado(String codigo, int promedio, char letra) {

            System.out.println("El promedio de los digitos es:" + promedio);
            System.out.println("El codigo de seguridad es: " + codigo + "-" + letra);
        }

    }

    public static void DescompresionMensajes() {
        String cadena = "";

        while (true) {
            System.out.println("Ingrese la cadena que desea descomprimir");
            if (validarCompresion(cadena)){
                break;
            } else {

                System.out.println("Formato invalido. Intente nuevamente.");
            }
        }

        String cadenaDescomprimida = descomprimir(cadena);
        mostrarMensajeRecuperado(cadenaDescomprimida);
    }

    public static boolean validarCompresion(String cadena) {

        if (cadena.length() == 0) {
            return false;
        }

        if (cadena.length() % 2 != 0) {
            return false;
        }

        for (int i = 0; i < cadena.length(); i++) {
            char caracterActual = cadena.charAt(i);

            if (i % 2 == 0) {

                if (!Character.isLetter(caracterActual)) {
                    return false;
                }
            } else {

                if (caracterActual < '1' || caracterActual > '9') {
                    return false;
                }
            }
        }
        return true;
    }

    public static String descomprimir(String cadena) {
        String resultado = "";

        for (int i = 0; i < cadena.length(); i = i + 2) {
            char letra = cadena.charAt(i);
            int repeticiones = Character.getNumericValue(cadena.charAt(i + 1));

            for (int j = 0; j < repeticiones; j++) {
                resultado = resultado + letra;
            }
        }
        return resultado;
    }

    public static void mostrarMensajeRecuperado(String mensaje) {
        System.out.println(mensaje);
    }
