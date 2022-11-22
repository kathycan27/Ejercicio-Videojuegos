import java.util.Scanner;
public class Videojuego {
    String titulos;
    int horasE=10;
    Boolean entregado=false;
    String genero;
    String compania;
    Scanner sc=new Scanner(System.in);
    Videojuego videojuegos[]=new Videojuego[5];
    //Videojuego vi=new Videojuego(" ", 10, " "," ");
    public void ingresar()
    {
        for(int i=0; i<1;i++) {
            System.out.println("---------------Datos Videojuego " + (i + 1) + "---------------");
            videojuegos[i] = new Videojuego("",10," "," ");
            System.out.println("Cual es el titulo del videojuego: ");
            titulos = sc.nextLine();
            videojuegos[i].setTitulos(titulos);
            System.out.println("Tiempo de duracion del videojuego en horas: ");
            horasE = sc.nextInt();
            videojuegos[i].setHorasE(horasE);
            System.out.println("Cual es el genero del videojuego: ");
            genero = sc.next();
            videojuegos[i].setGenero(genero);
            System.out.println("Cual es la compañia del videojuego: ");
            compania = sc.next();
            videojuegos[i].setCompania(compania);

        }
    }
    public void mostrarDatos()
    {
        for (Videojuego videojuego :videojuegos ) {

        }

        for(int j=0; j<5;j++)
        {

            System.out.println(" ----------- Videojuegos "+(j+1)+"-----------");
            System.out.println("Titulo: "+videojuegos[j].getTitulos()+"\nNumero Horas: "+videojuegos[j].getHorasE()+"\nGenero: "+videojuegos[j].getGenero()+"\nCompañia: "+videojuegos[j].getCompania());
        }
    }
    public void compareTo() {
        for (Videojuego videojuego :videojuegos ) {

        }
        int m=0;
        int mayor = 0;
        // Recorrer arreglo y ver si no es así
        // (comenzar desde el 1 porque el 0 ya lo tenemos contemplado arriba)
        for (int i = 0; i < 5; i++) {
            if (videojuegos[i].getHorasE() > videojuegos[mayor].getHorasE()) {
                mayor = i;
            }
            m = videojuegos[mayor].getHorasE();


        }
        System.out.println("La serie con mas temporadas es: " + m + " De la serie "+ videojuegos[mayor].getTitulos());

    }
public void entregar()
{
    entregado=true;
    System.out.println(entregado);

}
public void devolver()
{
    entregado=false;
    System.out.println(entregado);
}
public void isEstregado()
{
    if(entregado==true)
    {
        entregado=false;
    } else if (entregado==false) {
        entregado=true;

    }
    System.out.println(entregado);
}
    public Videojuego(String titulos, int horasE) {
        this.titulos = titulos;
        this.horasE = horasE;
    }

    public Videojuego(String titulos) {
        this.titulos = titulos;
    }

    public Videojuego(String titulos, int horasE, String genero, String compania) {
        this.titulos = titulos;
        this.horasE = horasE;
        this.genero = genero;
        this.compania = compania;
    }

    public String getTitulos() {
        return titulos;
    }

    public void setTitulos(String titulos) {
        this.titulos = titulos;
    }

    public int getHorasE() {
        return horasE;
    }

    public void setHorasE(int horasE) {
        this.horasE = horasE;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCompania() {
        return compania;
    }

    public void setCompania(String compania) {
        this.compania = compania;
    }

    @Override
    public String toString() {
        return "Videojuego{" +
                "titulos='" + titulos + '\'' +
                ", horasE=" + horasE +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", compania='" + compania + '\'' +
                '}';
    }

}
