public class AnimalDomestico {
    String nombreAnimal;
    String tipo;
    int edad;
    String genero;

    public void nombreAnimal() {
        System.out.print(this.nombreAnimal + "\n");
    };

    public void tipoAnimal() {
        System.out.print("tipo:" + this.tipo + "\n");
    };

    public void edadAnimal() {
        System.out.print("edad:" + this.edad + "\n");
    };

    public void genero(String genero) {
        System.out.print("genero:" + genero);
    };
}
