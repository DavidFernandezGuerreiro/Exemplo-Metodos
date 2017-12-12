
package exemplometodos;

import java.util.Scanner;

/**
 *
 * @author dfernandezguerreiro
 */
public class ExemploMetodos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Rectangulo rec1=new Rectangulo();
        Scanner ler=new Scanner (System.in);
        rec1.amosar();
        System.out.println("Escribe base :");
        float base=ler.nextFloat();
        System.out.println("Escribe altura :");
        float altura=ler.nextFloat();
        
        Rectangulo rec2=new Rectangulo(base, altura);
        rec2.amosar();
        rec2.calcularArea(4, 7);
        rec2.setBase(10);
        float valorAltura= rec2.getAltura(); //<- Recibir altura
        System.out.println("Recibir la altura : "+valorAltura);
        
        Rectangulo rec3=new Rectangulo(base, altura);
        rec3.amosar();
        //float pe=rec3.calcularPerimetro(4, 7);
        //System.out.println("preimetro : "+pe); SIMPLIFICADO:
        System.out.println("perimetro : "+rec2.calcularPerimetro(base, altura));
    }
    
}
