/**
 * Created by iabin on 21/05/16.
 * @author iabin
 */
public class Main {
    /**
     * Main class, reads from the standard input 2 parameters 'n' and 'd'
     * @param args Standard input
     */
    public static void main(String[] args){
        MaurerRose rosa = new MaurerRose(); //I create an object MaurerRose type
        try {
            rosa = new MaurerRose(Integer.parseInt(args[0]), Integer.parseInt(args[1]));
        }catch (Exception e){ //I know this is awful :v but it doesn't matter
            System.err.println("                       \n \n   Welcome \n"
                                +"    If you want to use this program please enter the following\n"
                                +"                java -jar MaurerRose.jar n d \n"
                                +"              where 'n' and 'd' are integers,\n"
                                +"          the output will be printed on the standard ouput"
                                +"           If you're using a linux system, you can use "
                                +"              java -jar MaurerRose.jar n d > file.html" 
                                +"        if you need more information, please check:\n"
                                +"          https://en.wikipedia.org/wiki/Maurer_rose \n \n");
            return;
        }//It prints the HTML on the  standard output
        System.out.println("<title>Maurer Rose</title>"
                         +"<head><style> *{font-size:80px; text-align:center;}</style><head>"
                         +"<h1>Maurer Rose whit parameters n = "+args[0]+"   d = "+args[1]+"</h1>"
                         +"<svg width='1500' height='1500'>");
        rosa.imprimeSVG();
        System.out.println("</svg>");
    }

}
