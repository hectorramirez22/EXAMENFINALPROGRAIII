//package org.example.Servicio;
//
//import org.example.Modelo.NodoContacto;
//
//import java.io.*;
//
//public class Persistencia {
//    private static final String ARCHIVO_DATOS = "C:\\P3FINAL\\TREEAGENDA\\agenda.dat";
//
//    public static void guardarAgenda(Agenda agenda) {
//        try (FileOutputStream fileOut = new FileOutputStream(ARCHIVO_DATOS);
//             ObjectOutputStream out = new ObjectOutputStream(fileOut)) {
//            out.writeObject(agenda.getRaiz());
//            System.out.println("Agenda guardada con éxito en " + ARCHIVO_DATOS);
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//    }
//
//    public static Agenda cargarAgenda() {
//        Agenda agenda = new Agenda();
//        try (FileInputStream fileIn = new FileInputStream(ARCHIVO_DATOS);
//             ObjectInputStream in = new ObjectInputStream(fileIn)) {
//            NodoContacto raiz = (NodoContacto) in.readObject();
//            agenda.setRaiz(raiz);
//            System.out.println("Agenda cargada con éxito desde " + ARCHIVO_DATOS);
//        } catch (IOException | ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return agenda;
//    }
//}
//

package org.example.Servicio;

import org.example.Modelo.NodoContacto;

import java.io.*;
import java.io.ObjectOutputStream;


public class Persistencia {

    private static final String ARCHIVO_DATOS = "C:\\P3FINAL\\TREEAGENDA\\agenda.dat";

    public static void guardarAgenda(Agenda agenda) {

        try {

            NodoContacto c = agenda.getRaiz();

            FileOutputStream fileOut = new FileOutputStream(ARCHIVO_DATOS);
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(agenda.getRaiz());
            out.close();
            fileOut.close();
            System.out.println("Agenda guardada con exito" + ARCHIVO_DATOS);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static Agenda cargarAgenda() {
        Agenda agenda = new Agenda();
        try{
            FileInputStream filein = new FileInputStream(ARCHIVO_DATOS);
            ObjectInputStream in = new ObjectInputStream(filein);
            NodoContacto raiz = (NodoContacto) in.readObject();
            agenda.setRaiz(raiz);
            in.close();
            System.out.println("Agenda cargada con exito" + ARCHIVO_DATOS);
        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
        return agenda;
    }
}

