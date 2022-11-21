import java.util.Scanner;

public class Serie {
    String titulo;
    int numeroTemporadas=3;
    Boolean entregado=false;
    String genero;
    String creador;
    Serie series[]= new Serie[5];
    //Serie s=new Serie("",3," "," ");
    Scanner sc=new Scanner(System.in);

    public void ingresar()
    {
        for(int i=0; i<1;i++) {
            System.out.println("---------------Datos Serie" + (i + 1) + "---------------");
            series[i] = new Serie("",10," "," ");
            System.out.println("Cual es el titulo de la serie: ");
            titulo = sc.nextLine();
            series[i].setTitulo(titulo);
            System.out.println("Numero de temporadas: ");
            numeroTemporadas = sc.nextInt();
            series[i].setNumeroTemporadas(numeroTemporadas);
            System.out.println("Cual es el genero de la serie: ");
            genero = sc.next();
            series[i].setGenero(genero);
            System.out.println("Quien es el creador: ");
            creador = sc.next();
            series[i].setCreador(creador);

        }
    }
    public void mostrarDatos()
    {
        for (Serie serie :series ) {

        }

        for(int j=0; j<5;j++)
        {

            System.out.println(" ----------- Serie "+(j+1)+"-----------");
            System.out.println("Titulo: "+series[j].getTitulo()+"\nNumero Temporadas: "+series[j].getNumeroTemporadas()+"\nGenero: "+series[j].getGenero()+"\nCreador: "+series[j].getCreador());
        }
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

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumeroTemporadas() {
        return numeroTemporadas;
    }

    public void setNumeroTemporadas(int numeroTemporadas) {
        this.numeroTemporadas = numeroTemporadas;
    }


    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCreador() {
        return creador;
    }

    public void setCreador(String creador) {
        this.creador = creador;
    }

    public Serie(String titulo, String creador) {
        this.titulo = titulo;
        this.creador = creador;
    }

    public Serie(String titulo, int numeroTemporadas, String genero, String creador) {
        this.titulo = titulo;
        this.numeroTemporadas = numeroTemporadas;
        this.genero = genero;
        this.creador = creador;
    }

    @Override
    public String toString() {
        return "Serie{" +
                "titulo='" + titulo + '\'' +
                ", numeroTemporadas=" + numeroTemporadas +
                ", entregado=" + entregado +
                ", genero='" + genero + '\'' +
                ", creador='" + creador + '\'' +
                '}';
    }
}
