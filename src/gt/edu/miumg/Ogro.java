package gt.edu.miumg;

public class Ogro extends Personaje implements Villano {
    @Override
    public void desplazarse() {

    }

    @Override
    public void mostraPoder() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public int mostraVida() {
        return 0;
    }

    @Override
    public void destruir() {

    }
    public Ogro() {
        super(nombre,descripcion,tamano,poder,vida);
    }
}
