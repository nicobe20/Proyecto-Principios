package com.company;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Date;

public class RegistroDeMaterias {
    //atributos
    ArrayList<String> materias = new ArrayList<>(); //Guardaremos la materias
    ArrayList<Double> notas = new ArrayList<>();  //Guardaremos las notas
    ArrayList<Integer> horario = new ArrayList<>(); // guardaremos el horario: hora, día. mes y año
    Scanner scan = new Scanner(System.in);

    //metodos
        //Este metodo nos proporciona la entrada
        //de materias
        public void RegistroDeMateria() {
            System.out.println("Ingresa tus materias");
            System.out.println("Para terminar escriba: Finalizar");
            System.out.println("------------------------------");
            String input = scan.nextLine();
            while (!input.equalsIgnoreCase("Finalizar")) {
                 materias.add(input);
                 input= scan.nextLine();
            }
        }
        public void registrarNotas(){
            System.out.println("Ingresa tus notas");
            System.out.println("Para terminar escriba: Finalizar");
            System.out.println("------------------------------");
            for(String materia : materias) {
                System.out.println(materia);
                double nota = scan.nextDouble();
                notas.add(nota);
            }
        }
        public void mostrarMateriasYNotas(){
            for(int i = 0; i < materias.size(); i++){
                 System.out.println("Materia: " + materias.get(i) + " Nota parcial: " + notas.get(i));
                System.out.println("------------------------------");

            }
        }
        public void registrarHorario(){
            for(int y = 0; y < materias.size(); y++) {
                System.out.println("Ingresa tu horario");
                System.out.println("------------------------------");
                String romper = scan.nextLine();
                if(!romper.equals("N")) {
                        System.out.println(materias.get(y));
                    for (int i = 0; !romper.equals("N"); i += 5) {
                        System.out.println("Ingresa la hora");
                        int hora = scan.nextInt();
                        horario.add(i + 0, hora);
                        System.out.println("Ingresa los minutos");
                        int minutos = scan.nextInt();
                        horario.add(i + 1, minutos);
                        System.out.println("Ingresa el dia");
                        int dia = scan.nextInt();
                        horario.add(i + 2, dia);
                        System.out.println("Ingresa el mes");
                        int mes = scan.nextInt() - 1;
                        horario.add(i + 3, mes);
                        System.out.println("Ingresa el año");
                        int año = scan.nextInt() - 1900;
                        horario.add(i + 4, año);
                        System.out.println("------------------------------");
                        break;
                    }
                }
            }
        }
        public void  verHorario(){
            for(int i = 0; i < materias.size(); i++){
                System.out.println("Materia: " + materias.get(i));
                for(int g = 0; g < horario.size(); g +=5) {
                        Date miFecha = new Date(horario.get(g + 4), horario.get(g + 3), horario.get(g + 2),horario.get(g),horario.get(g+ 1));
                        System.out.println("Tu fecha es: " + miFecha);

                }
            }
        }
    }

