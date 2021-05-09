package com.company;

import java.util.Scanner;

public class Aplicacion {

          RegistroDeMaterias ver = new RegistroDeMaterias();
          Scanner scan = new Scanner(System.in);
          String nombre;
          String correo;
          String contrasena;
          UsuarioContraseña usuarioContraseña = new UsuarioContraseña(nombre, correo, contrasena);

    public void usuario(){
          System.out.println("Hola \nBienvenido a LICHGHI");
          System.out.println("------------------------------");
          System.out.println("Ingresa tu nombre");
          nombre = scan.nextLine();
          System.out.println("Ingresa tu correo");
          correo = scan.nextLine();
          System.out.println("Ingresa tu contraseña");
          contrasena = scan.nextLine();
          while (!usuarioContraseña.correoUsuario(correo) || !usuarioContraseña.crearContrasena(contrasena)){
              System.out.println("Ingresa tu correo de nuevo");
              correo = scan.nextLine();
              System.out.println("Ingresa tu contraseña de nuevo");
              contrasena = scan.nextLine();
          }
          System.out.println("Gracias por registrarte");

      }
       //metodo para ingresar el sistema por primera vez
      public void primerIngreso(){
          ver.RegistroDeMateria();
          ver.registrarNotas();
          ver.registrarHorario();

      }
       //metodo  para la organizacion de
       //la navegación en el sistema
      public void instrucciones(){
          System.out.println("¡Bienvenido!\n Aqui encontraras un menú con las opciones de navegación");
          System.out.println(" Para ver tu horario: Pon tu <Horario> \n Para ver tus materias y notas pon: <Materias>" +
                  "\n Para ajustar materias, notas o tu horario pon: <Ajustes> \n Para ver tu perfil pon: <Perfil>" +
                  "\n para salir de la apliacación pon: Salir");
          System.out.println("------------------------------");
      }
        //metodo encargado de realizar la separación de los diferentes
        //modulos de organización
      public void App(){
          System.out.println("¿Qué quieres hacer?");
          String hacer = scan.nextLine();
          System.out.println("------------------------------");
          while(!hacer.equalsIgnoreCase("salir")) {
              if (hacer.equalsIgnoreCase("Horario")) ver.verHorario();
              else if (hacer.equalsIgnoreCase("Materias")) ver.mostrarMateriasYNotas();
              else if (hacer.equalsIgnoreCase("Ajustes")) {
                  System.out.println("¿Qué quieres añadir?");
                  String opcion = scan.nextLine();
                  if (opcion.equalsIgnoreCase("añadirMaterias"))
                      ver.RegistroDeMateria();
                  if (opcion.equalsIgnoreCase("añadirNotas")) {
                      ver.registrarNotas();
                  }
                  if (opcion.equalsIgnoreCase("añadirHorario")) {
                      ver.registrarHorario();
                  }
              } else if (hacer.equalsIgnoreCase("Perfil")) {
                  usuarioContraseña.verCorreoYcontrasena();
              }
              System.out.println("------------------------------");
              System.out.println("¿Que quieres hacer?");
              hacer = scan.nextLine();
              System.out.println("------------------------------");
          }
    }
}
