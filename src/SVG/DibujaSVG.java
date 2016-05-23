package SVG;

/**
 *Clase Abstracta para modelar figuras euclideanas y su metodo para imprimir
 * en SVG
 */
public abstract class DibujaSVG implements ImprimeSVG{

    /** El centro de la figura */
    protected Vector2D centro;
    
    /**
     *Regresa el centro del objeto
     *@return Vector2D regresa el centro
     */
    public Vector2D getCentro() {
        return this.centro;
    }
    
    /**
     *Regresa el lado izquierdo del objeto
     *@return Vector2D Regresa el lado izquierdo
     */
    public  abstract Vector2D getIzquierdo();


    /**
     * Regresa el lado derecho del Objeto
     * @return Vector2D regresa el lado derecho
     */
    public abstract Vector2D getDerecho();

    
    

    
} 
