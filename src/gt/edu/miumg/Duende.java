package gt.edu.miumg;

public class Duende extends Personaje implements Villano{
    @Override
    public void destruir() {

    }
    @Override
    public void mostraPoder() {

    }

    @Override
    public void desplazarse() {

    }

    @Override
    public void atacar() {

    }

    @Override
    public int mostraVida() {
        return 0;
    }
    public Duende(){
        super(nombre,descripcion,tamano,poder,vida);
    }
}
