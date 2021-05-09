package com.company;

public class UsuarioContraseña {
    //atributos
    String nombre;
    String correo;
    String contrasena;

    //metodos
        public UsuarioContraseña(String nombre, String correo, String constrasena) {
            this.nombre = nombre;
            this.correo = correo;
            this.contrasena = constrasena;
        }
        public boolean correoUsuario(String co) {
          this.correo = co;
          boolean respuesta = false;
            if (correo.contains("@") && correo.contains(".com")) respuesta = true;
            else System.out.println("Correo invalido");
          return respuesta;
        }
        public boolean crearContrasena(String contrasena) {
          this.contrasena = contrasena;
          boolean respuesta = false;
            if (contrasena.length() >= 8)  respuesta = true;
            else System.out.println("Contraseña no es válida");
          return respuesta;
        }
        public void verCorreoYcontrasena() {
         System.out.println( "Tu correo: " + correo + "\nTu contraseña: " + "********");
        }
 }

