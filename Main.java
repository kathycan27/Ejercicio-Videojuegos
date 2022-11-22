import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Videojuego v=new Videojuego(" ",10," "," ");
      Serie serie=new Serie(" ",3," "," ");
        int opcion=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("------------------Bienvenidos -----------------");
        do {
            System.out.println("Escoga la accion que desee realizar \n 1 Ingresar Datos de Videojuegos \n 2 Ingresar Datos series \n " +
                    "3 Mostrar Videojuegos \n 4 Mostrar Series \n " +
                    "5 Comparacion Videojuegos \n 6 Comparacion Series \n 7 Salir");
            opcion = sc.nextInt();
            switch (opcion) {
                case 1:
                    v.ingresar();

                    break;
                case 2:
                    serie.ingresar();
                    break;
                case 3:
                    v.mostrarDatos();
                    break;
                case 4:
                    serie.mostrarDatos();
                    break;
                case 5:
                    v.compareTo();
                    //1
                    // v.toString();
                    break;
                case 6:
                    serie.compareTo();
                    break;
                default:
                    break;

            }

        }while(opcion<6);
        System.out.println("-------------------Gracias por ingresar-------------------");


    }
    public void comparteTo()
    {

    }


    }



