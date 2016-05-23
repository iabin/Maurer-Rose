import SVG.*;

/**
 * @author iabin
 * @version 1.0
 * Clase que modela a una MaurerRose y la dibuja en SVG
 */
public class MaurerRose implements ImprimeSVG{
     int n;
     int d;

    /**
     * Constructor vacio
     */
    public MaurerRose() {
    }

    /**
     * Constructor con los 2 parametros la n y la d
     * @param n parametro n
     * @param d parametro d
     */
    public MaurerRose(int n, int d){
        this.n = n;
        this.d = d;
    }

    /**
     * Metodo que imprime la rosa en SVG
     */
    @Override
    public void imprimeSVG(){
        double theta=0;//declaramos theta en 0
        double x,r,t,aux;
        Punto old = new Punto(); //declaramos old en 0
        do {
            theta = theta+d; //Sumamos d a theta
            if(theta>=360)
                theta = theta%360; //Si es mayor le hago modulo 360
            aux = (n*theta);
            aux = aux%360;//Multiplico por n y hago modulo con 360
            x = (aux*Math.PI)/180; //aux a radianes
            r = Math.sin(x); //Seno de X
            t = (theta*Math.PI)/180; //Theta a radianes
            CoordenadaPolar polar = new CoordenadaPolar(r,t); //Construyo una variable polar
            Punto nuevo = polar.toVector2D();//Nuevo punto2D con ese punto polar
            LineaSVG linea = new LineaSVG(new Vector2D((int)(nuevo.x*750+750),(int)(nuevo.y*750+750)),new Vector2D((int)(old.x*750+750),(int)(old.y*750+750)));
            linea.imprimeSVG(); //imprimo una linea entre ambos puntos
            old = nuevo; //igualo el viejo al nuevo
        } while(theta!=0);//Siguiente iteracion

    }

}