package aeropuerto;
import java.util.Scanner;
public class Principal {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    while (true) {
      mostrarMenu();
      byte op = sc.nextByte();
      switch (op) {
        case 1:
          // Lógica para consultar aeropuertos
          break;
        case 2:
          // Lógica para financiación de aeropuertos
          break;
        case 3:
          // Lógica para compañías de los aeropuertos
          break;
        case 4:
          // Lógica para vuelos de la compañía
          break;
        case 5:
          // Lógica para buscar vuelos
          break;
        case 0:
          System.out.println("Saliendo...");
          return;
        default:
          System.out.println("=====================================");
          System.out.println("Opción no válida. Intente de nuevo.");
          System.out.println("=====================================");
      }
    }
  }
  public static void mostrarMenu() {
    System.out.println("1. Consultar Aeropuertos");
    System.out.println("2. Financiación de Aeropuertos");
    System.out.println("3. Compañías de los Aeropuertos");
    System.out.println("4. Vuelos de la Compañía");
    System.out.println("5. Buscar Vuelos");
    System.out.println("0. Salir");
    System.out.print("Ingrese una opción: ");
  }
  
}
