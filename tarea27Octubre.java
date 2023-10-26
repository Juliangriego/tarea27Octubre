import java.util.Scanner;

public class tarea27Octubre {

    public static void main(String[] args) {
/*
        1 - escrib un programa q dadod un numero del 1 al 7 es criba el correspondiente dia de la semana

        2- realizar un programa q pida una hora por teclado y q muestra la frase buenos dias buenas tardes
        y buenas noches segun la hora se utilizaraN LOS tramos de 6 a 12  de 15 a 20 y de 21 a 05 buenas
        noches (solo se tiene en cuenta las horas, no minutos)

        3- muestra los numeros multiplos de 5 del 0 al 100- esto utulizando un bucle for - white-dowhite,
        muestra los numero del 320 al 160 contando de 20 en 20 hacia atras utilizando el for -white-dowhite
*/
        boolean bandera = true;
        Scanner sc = new Scanner (System.in);
        System.out.println("Ejercicios");
        do {
            System.out.println("Seleccione el ejercicio que desea revisar");
            switch(sc.nextLine()){
                case "1": Ejercicio1();break;
                case "2": Ejercicio2();break;
                case "3": Ejercicio3();break;
                default:  bandera = false;
            }
        } while (bandera);

    }

    public static void Ejercicio1(){
        Scanner sc = new Scanner (System.in);
        boolean bandera = true;
        int valor = 0;
        String[] diasSemana = {"lunes", "martes", "miércoles", "jueves", "viernes", "sábado", "domingo"};
        do {
            System.out.println("Ingrese un número del 1 al 7 inclusive, u otro número para salir");
            valor = sc.nextInt();
            if (valor>=1&&valor<=7){
                valor = valor -1;
                System.out.println("El día es " + diasSemana[valor]);
            } else {
                System.out.println("Saliendo del programa");
                bandera = false;
            }
        } while (bandera);
    }
    public static void Ejercicio2(){
        Scanner sc = new Scanner (System.in);
        int hora = 0;
        boolean bandera = true;
        String[] saludo = {"Buenos días", "Buenas tardes", "Buenas noches"};

        do {
            System.out.println("¿Qué hora será?");
            hora = sc.nextInt();
            if (hora<=23&&hora>=0){
                String saludoResultado;
                saludoResultado = (hora>=6&&hora<=12)? saludo[0] : (hora>12&&hora<=18) ? saludo[1]: saludo[2];
                System.out.println(saludoResultado);
            } else {
                System.out.println("¡Hay que comprar un reloj!");
                bandera = false;
            }
        } while (bandera);

    }
    public static void Ejercicio3(){
        System.out.println("Múltiplos de 5 del 0 al 100");
        for(int i = 0; i<100; i += 5){
            System.out.println(i);
        }

        System.out.println("Contando desde 320 a 160 de 20 en 20");
        for(int i = 320; i>160; i -= 20 ){
            System.out.println(i);
        }
    }
}
