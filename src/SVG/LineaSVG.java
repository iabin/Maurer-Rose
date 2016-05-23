package SVG;

/**
 * Clase que modela y dibuja una linea en SVG}
 * @author iabin
 */
public class LineaSVG extends DibujaSVG{
    /* Extemo izquierdo */
     Vector2D izquierdo;

    /* Extemo derecho */
     Vector2D derecho;

    /* Color */
    final String color = "black";

    /**
     * Constructor Vacio, inicializa los extremos en el 0,0
     */
    public LineaSVG(){
	centro = izquierdo = derecho = new Vector2D();
    }

    /**
     * Constructor que recibe 2 Vector2D
     * @param izquierda extremo izquierdo
     * @param derecha extremo derecho
     */
    public LineaSVG(Vector2D izquierda, Vector2D derecha){ 
	izquierdo = izquierda;
	derecho = derecha;
	centro = izquierda.puntoMedio(derecha);

    }


    /**
     * Regresa el lado izquierdo de la linea
     * @return Vector2D extremo izquierdo
     */
    @Override
    public Vector2D getIzquierdo(){
    	return izquierdo;
    }


    /**
     * Regresa el lado derecho de la linea
     * @return Vector2D extremo derecho
     */
    @Override
    public Vector2D getDerecho() {
	return derecho;

    }


    /**
     * Metodo que imprime en SVG una representacion de la linea
     */
    @Override
    public void imprimeSVG(){ 

	System.out.println("<line x1='" +izquierdo.getX()+ "' y1='" +izquierdo.getY()+ "' x2='" +derecho.getX()+ "' y2='" +derecho.getY() +"' stroke='" +color+ "' stroke-width='2' />");
	
				
    }
}
