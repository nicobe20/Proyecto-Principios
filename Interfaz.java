package com.company;

public class Interfaz {
    RegistroDeMaterias mate = new RegistroDeMaterias();
    Aplicacion app = new Aplicacion();

    public void ingreso() {
        app.usuario();
        System.out.println("------------------------------");
    }
    public void desarrollo() {
        app.primerIngreso();
        System.out.println("------------------------------");
        app.instrucciones();
        app.App();
        }

    }

