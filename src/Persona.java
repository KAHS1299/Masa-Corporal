public class Persona {

    // Atributos
    private String nombre;
    private double peso;
    private double estatura;

    // Constructor
    public Persona(String nombre, double peso, double estatura) {
        this.nombre = nombre;
        this.peso = peso;
        this.estatura = estatura;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getEstatura() {
        return estatura;
    }

    public void setEstatura(double estatura) {
        this.estatura = estatura;
    }

    public double calcularIMC() {
        return peso / Math.pow(estatura, 2);
    }

    public String determinarSituacion(double imc) {
        if (imc < 18.5) {
            return "Bajo peso";
        } else if (imc >=18.5 && imc <=24.9) {
            return "Normopeso";
        } else if (imc >=25 && imc <=26.9) {
            return "Sobrepeso grado I";
        } else if (imc >=27 && imc <=29.9) {
            return "Sobrepeso grado I";
        } else if (imc >=30 && imc <=34.9) {
            return"Obesidad de tipo I";
        }else if (imc >=35 && imc <=39.9) {
            return"Obesidad de tipo II";
        }else if (imc >=40 && imc <=49.9) {
            return"Obesidad de tipo III (morbida)";
        }else if (imc >50) {
            return"Obesidad de tipo IV (extrema)";
        }
        return "";
    }
    public void mostrarResultados(){
        double imc =calcularIMC();
        String situacion =determinarSituacion(imc);
        System.out.println("Hola "+nombre+ "Tu IMC es: "+imc+ "y estas en la situacion: "+situacion);
    }
    @Override
    public String toString() {
        return "Persona [Nombre=" + nombre + ", Peso= " + peso + " Kg, Estatura= " + estatura + " m]";
    }

}





