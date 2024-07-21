package gt.edu.miumg;

public class Enano extends Personaje implements Heroe {
    @Override
    public void atacar() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void mostraPoder() {

    }

    @Override
    public int mostraVida() {
        return 0;
    }

    @Override
    public void recibirAtaque() {

    }

    @Override
    public void defender() {

    }
    public Enano() {
        super(nombre,descripcion,tamano,poder,vida);
    }
}
