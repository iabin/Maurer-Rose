package SVG;

/**
 * Clase que Modela un Vector2D de con atributos de tipo int
 */
public class Vector2D{
    private int x;
    private int y;

    /**Constructor Vacio inicializa el Vector2D en el origen*/
    public Vector2D(){
	x = 0;
	y = 0;
    }

    /**Constructor que inicializa el Vector2D en el punto dado
     *@param x el punto x
     *@param y el punto y
     */
    public Vector2D(int x, int y){ 
    	this.x = x;
    	this.y = y;
    }


    /**
     * Regresa el punto medio entre 2 vectores2D
     * @param v Vector 2
     * @return Vector2D punto medio
     */
    public Vector2D puntoMedio(Vector2D v){ 
        int x1 = ((this.x+v.getX())/2);
        int y1 = ((this.y+v.getY())/2);
        return new Vector2D(x1,y1);
    }

    /**
     * Regresa el parametro X
     * @return int Regresa la componente X
     */
    public int getX(){ 
    	return this.x;
    }
    /**
     * Regresa el parametro Y
     * @return int Regresa la componente Y
     */
    public int getY(){ 
    	return this.y;
    }

} 
