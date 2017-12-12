
package exemplometodos;

/**
 *
 * @author dfernandezguerreiro
 */
public class Rectangulo {
    private float base, altura;
    //CONSTRUCTORES :
    public Rectangulo(){
        //Ya toma los valores por defecto.
    }
    //OUTROS CONSTRUCTORES :
    public Rectangulo (float ba, float alt){ //<- Constructor con parametros
        base= ba;
        altura=alt;
        //this para diferenciar cual es cual :
        //this.base=base;
        //this.altura=altura;
    }
    
    //MÉTODOS DE ACCESO :
    public void setBase(float b){ //Son para los atributos. Set: Dar valor al atributo
        base=b;
    }
    public float getBase(){ //Get: retorna el valor (creO)
        return base;
    }
    public void setAltura(float a){
        altura=a;
    }
    public float getAltura(){
        return altura;
    }
    public void amosar(){
        System.out.println("base = "+base+" altura = "+altura);
    }
    //calcular area, no va a devolver nada e vai a recibir dous valores de tipo float un para base e outro para altura
    public void calcularArea(float b, float al){
        float area=b*al;
        System.out.println("area = "+area);
    }
    //Codificade un metodo que se chama CalcularPerimetro, recibir os valores de base e altura e retornar o perimetro
    public float calcularPerimetro(float b, float alt){
        return (b*2+alt*2);
    }

    
    //Non vai a recibir nada e vai a recibir un STRING.
    public String visualizar(){
        return ("base = "+base+" altura = "+altura);
    }
}
