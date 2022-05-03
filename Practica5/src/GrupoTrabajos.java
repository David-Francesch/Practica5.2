package Practicas3erTri.Practica5.Practica5.src;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Scanner;

public class GrupoTrabajos {
    
    private ArrayList<Trabajos> trabajo = new ArrayList<>();
    

    public GrupoTrabajos(){
        
    }

    public void newTrabajo() {
        Scanner sc= new Scanner(System.in);
        Scanner sci= new Scanner(System.in);
        String descripcion;
        int opcion;

        System.out.println("Que tipo de trabajo quieres empezar:");
        System.out.println("1. Reparacion mecanica");
        System.out.println("2. Reparacion chapa y pintura");
        System.out.println("3. Revision");
        opcion = sci.nextInt();

        System.out.println("Introduce la descripcion del trabajo");
        descripcion = sc.nextLine();

        
        Trabajos test = new Trabajos(trabajo.size(),opcion, descripcion , 0, false);
        trabajo.add(test);
        mostrarTrabajo();
    }

    public void mostrarTrabajo() {
        System.out.println(trabajo.get(trabajo.size()-1).toString());
    }

    public void aumentaHoras() {
        Scanner sc= new Scanner(System.in);
        int id, horas;

        System.out.println("Introduce el id de trabajo");
        id = sc.nextInt();

        System.out.println("Introduce las horas");
        horas = sc.nextInt();

        for (int i = 0; i < trabajo.size(); i++) {
            if (id == i) {
                if (!trabajo.get(id).getFinalizado()) {
                    if (horas > 0) {
                        trabajo.get(id).setnHoras(horas);     
                    }
                }
            } else {
                System.out.println("El trabajo esta finalizado o las horas son incorrectas");
            }
        }
    }

    public void mostrarTodos() {
        for (int i = 0; i < trabajo.size(); i++) {
            System.out.println(trabajo.get(i).toString());
        }
    }

    public void AumentaCostePiezas() {
        Scanner sc= new Scanner(System.in);
        int id;
        double costePiezas;

        System.out.println("Introduce el id de trabajo");
        id = sc.nextInt();

        System.out.println("Introduce el coste de las piezas");
        costePiezas = sc.nextDouble();

        for (int i = 0; i < trabajo.size(); i++) {
            if (id == i && trabajo.get(i).getTipoTrabajo() == 1 ||trabajo.get(i).getTipoTrabajo() == 2) {
                if (!trabajo.contains(trabajo.get(id))) {
                    System.out.println("La id no existe");
                }
                if (costePiezas < 0) {
                    System.out.println("El coste es incorrecto");
                }
                trabajo.get(i).setCostePiezas(costePiezas);
                trabajo.get(i).calculoTrabajo();
            }
        }
    }

    public void InformeTaller() {
        
        try {
            String path = "C:/Users/Alumno/Desktop/David_Francesch/Github/Practica5.2/fch.txt";
            File arch = new File(path);
    
            FileReader fr = new FileReader(arch);
            BufferedReader bfr = new BufferedReader(fr);
    
            FileWriter wr = new FileWriter(arch);
            BufferedWriter bwr = new BufferedWriter(wr);

            for (int i = 0; i < trabajo.size(); i++) {
                String linea = trabajo.get(i);
                if (linea != null) {
                    bwr.write(linea);
                }
            }
            bwr.close();
            
        } catch (Exception e) {
            //TODO: handle exception
        }
    }

    public void leerFich(String fich) {
        try {
            String frase;
            FileReader r = new FileReader(fich);
            BufferedReader br = new BufferedReader(r);
             while ((frase = br.readLine())!=null) {
                 System.out.println(frase);
             }
             br.close();
        } catch (Exception e) {
            //TODO: handle exception
        }
    }
}
