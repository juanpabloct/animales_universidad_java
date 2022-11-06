
public class AnimalSalvaje implements Animal, tipoAnimal {
    String[] comida;
    int tiempoVida;
    String tipoDeAnimal;
    String genero;
    int edad;
    String nombreAnimal;

    public void nombreAnimal() {
        System.out.println(this.nombreAnimal);
    }

    public void tipoAnimal() {
        System.out.println(this.tipoDeAnimal);
    }

    public void edadAnimal() {
        System.out.println("Edad:" + this.genero);
    }

    public void genero() {
        System.out.println("genero:" + edad);
    };

    public void Alimentacion() {
        String alimentos = "";
        for (String i : this.comida) {
            alimentos += i + ", ";
        }
        System.out.print("comida:" + alimentos + "\n");

    }

    public void tiempoVida() {
        System.out.print(this.tiempoVida + "\n");
    }

    public void mostrarTipoAnimal(String tipo) {
        System.out.println("Tipo:" + tipo);
    };

    public void habitatAnimal(String habitat) {
        System.out.println("habitat:" + habitat);

    };
}
