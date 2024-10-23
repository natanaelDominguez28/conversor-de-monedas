import java.io.IOException;
import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner lectura = new Scanner(System.in);
        Conversor conversor = new Conversor();

        String menu = """
                ******************************************************
                Sea bienvenido/a al Conversor de Moneda =]
                
                1) Dólar =>> Peso Argentino
                2) Peso Argentino =>> Dólar
                3) Dólar =>> Real Brasileño
                4) Real Brasileño =>> Dólar
                5) Dólar =>> Peso Colombiano
                6) Peso Colombiano ==> Dólar
                7) Salir
                Elija una opción válida: 
                ******************************************************
                """;
        int opcion = 0;
        try{
            while(opcion != 7){
                System.out.println(menu);
                opcion = Integer.valueOf(lectura.nextLine());
                double valor = 0;
                double total = 0;
                switch(opcion){
                    case 1:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"USD","ARS").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de =>>> "+total+" [ARS]\n");
                        break;
                    case 2:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"ARS","USD").conversion_result();
                        System.out.println("El valor "+valor+" [ARS] corresponde al valor final de =>>> "+total+" [USD]\n");
                        break;
                    case 3:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total = conversor.convertir(valor,"USD","BRL").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de =>>> "+total+" [BRL]\n");
                        break;
                    case 4:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"BRL","USD").conversion_result();
                        System.out.println("El valor "+valor+" [BRL] corresponde al valor final de =>>> "+total+" [USD]\n");
                        break;
                    case 5:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"USD","COP").conversion_result();
                        System.out.println("El valor "+valor+" [USD] corresponde al valor final de =>>> "+total+" [COP]\n");
                        break;
                    case 6:
                        System.out.println("Ingrese el valor que deseas convertir: ");
                        valor = Double.valueOf(lectura.nextLine());
                        total=conversor.convertir(valor,"COP","USD").conversion_result();
                        System.out.println("El valor "+valor+" [COP] corresponde al valor final de =>>> "+total+" [USD]\n");
                        break;
                    case 7:
                        System.out.println("Gracias por usar nuestro servicio de conversión de monedas, hasta luego!!");
                        break;
                    default:
                        System.out.println("Opción fuera de rango, intentelo de nuevo...");
                }
            }
        } catch (NumberFormatException e) {
            System.out.println("Error, se esperaba el ingreso de un número");
            System.out.println("Finalizando la aplicacion");
        }
    }
}
