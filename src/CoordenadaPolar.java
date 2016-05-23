/**
 * @author iabin
 *Clase que modela Vectores con cordenadas polares
 */
public class CoordenadaPolar{
    double radio;
    double angulo;

    /**
     * Constructor vacio
     */
    public CoordenadaPolar() {
        radio = 0;
        angulo = 0;
    }

    /**
     * Constructor que inicializa el vector con el angulo y la norma dada
     * @param radio radio del vector
     * @param angulo angulo del vector
     */
    public CoordenadaPolar(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }

    /**
     * metodo que devuelve al vector como un punto
     * @return Punto el vector en representacion rectangular
     */
    public Punto toVector2D() {
        return new Punto(radio*Math.cos(angulo),radio*Math.sin(angulo));
    }
}