package Practicas3erTri.Practica5.Practica5.src;

import java.util.Scanner;

public class mainMecanicos {
    public static void main(String[] args) throws Exception {
        menu();
    }

    public static void menu() {
        Scanner sc= new Scanner(System.in);
        boolean menu = true;
        int opcion = 0;
        GrupoTrabajos grupotrabajo = new GrupoTrabajos();

        do {
            System.out.println("Selecciona una opcion");
            System.out.println("1. Registrar trabajo");
            System.out.println("2. Aumentar horas");
            System.out.println("3. Aumenta coste de piezas");
            System.out.println("4. Finalizar trabajo");
            System.out.println("5. Muestra trabajo");
            System.out.println("6. Informe taller");
            opcion = sc.nextInt();

            switch (opcion) {
                case 1:
                    grupotrabajo.newTrabajo();
                    break;
                case 2:
                    grupotrabajo.aumentaHoras();
                    break;
                case 3:
                    grupotrabajo.AumentaCostePiezas();
                    break;
                case 4:
                    
                    break;
                case 5:
                    grupotrabajo.mostrarTodos();
                    break;
                case 6:
                    grupotrabajo.InformeTaller();
                    break;
                case 7:
                    grupotrabajo.leerFich(fich);
                    break;
                default:
                    break;
            }
        } while (menu);
    }

}
