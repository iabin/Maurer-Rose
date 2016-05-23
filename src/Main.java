/**
 * Created by iabin on 21/05/16.
 * @author iabin
 */
public class Main {
    /**
     * Main del programa, lee de la entrada Standard los 2 parametros n y d, respectivamente
     * @param args entrada Standard
     */
    public static void main(String[] args){


        MaurerRose rosa = new MaurerRose(); //CREO UN OBJETO DE TIPO MAURERROSE
        try {
            rosa = new MaurerRose(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }catch (Exception e){
            System.err.println("Ingrese 2 numeros, separados por espacios, representando a n y a d");
            return;
        }
        System.out.println("<title>n="+args[0]+" d ="+args[1]+"</title>");
                System.out.println("<svg width='1500' height='1500'>");
        rosa.imprimeSVG();
        System.out.println("</svg>");
    }

}
