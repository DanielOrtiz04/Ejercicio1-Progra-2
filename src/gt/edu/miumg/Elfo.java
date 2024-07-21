package gt.edu.miumg;

public class Elfo extends Personaje implements Heroe{
    @Override
    public void atacar(){

    }

    @Override
    public void defender() {

    }

    @Override
    public void recibirAtaque() {

    }

    @Override
    public int mostraVida() {
        return 0;
    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void mostraPoder() {

    }
    public Elfo() {
        super(nombre,descripcion,tamano,poder,vida);
    }
}
