/**
 * @author iabin
 *This class represents a complex number in its polar form 
 */
public class CoordenadaPolar{
    double radio;
    double angulo;

    /**
     * Empty constructor
     */
    public CoordenadaPolar() {
        radio = 0;
        angulo = 0;
    }

    /**
     * Constructor that begin a complex number whit a magnitude and an angle
     * @param radio radius
     * @param angulo angle of the number
     */
    public CoordenadaPolar(double radio, double angulo) {
        this.radio = radio;
        this.angulo = angulo;
    }

    /**
     * Backs a vector
     * @return Punto vector
     */
    public Punto toVector2D() {
        return new Punto(radio*Math.cos(angulo),radio*Math.sin(angulo));
    }
}