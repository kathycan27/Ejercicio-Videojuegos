public class Entregable {
    boolean entregado=false;
    public void entregar() {
        entregado = true;
            }

    public void devolver() {
        entregado=false;
    }

    public boolean isEstregado() {
        if (entregado) {
            return true;
        }
        return false;
    }
}
