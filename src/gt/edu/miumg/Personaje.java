package gt.edu.miumg;

public abstract class Personaje {
    private String nombre;
    private String descripcion;
    private long tamaño;
    private int poder;
    private int vida;

    public abstract void desplazarse();
    public abstract int mostraVida();
    public abstract void mostraPoder();
}

