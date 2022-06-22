package aula4;

/**
 *
 * @author franciele
 */
public class AreaRetangulo {
    
    private double base;
    private double altura;

    
    public AreaRetangulo() {
    
    }
    
    public AreaRetangulo(double base, double altura) {
        this.base = base;
        this.altura = altura;
    }
    

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }
    
    public double calcularArea() {
        return (base * altura);
    }
     
    
}
