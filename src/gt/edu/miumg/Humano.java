package gt.edu.miumg;

public class Humano extends Personaje implements Heroe{
    @Override
    public void recibirAtaque() {

    }

    @Override
    public void mostraPoder() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void defender() {

    }

    @Override
    public int mostraVida() {
        return 0;
    }

    @Override
    public void atacar() {

    }
    public Humano() {
        super(nombre,descripcion,tamano,poder,vida);
    }
}
