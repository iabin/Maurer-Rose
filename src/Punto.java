/**
 * Created by iabin on 21/05/16.
 */
public class Punto {
        double x;
        double y;

    /**
     * Constructor Vacio, inicializa las variables en 0
     */
    public Punto() {
            x = 0;
            y = 0;
        }

    /**
     * Constructor que inicializa en x y y
     * @param radio Parametro x
     * @param angulo Parametro Y
     */
        public Punto(double radio, double angulo) {
            x = radio;
            y = angulo;
        }

        public CoordenadaPolar toPolar(){
            return new CoordenadaPolar(Math.sqrt(Math.pow(x,2)+Math.pow(y,2)),Math.atan(y/x));
        }
    }

