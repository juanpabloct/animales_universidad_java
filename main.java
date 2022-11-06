public class main {
    public static void main(String[] args) {
        // TU CÓDIGO
        // Domestico
        AnimalDomestico perro = new AnimalDomestico();
        perro.edad = 5;
        perro.genero = "Masculino";
        perro.tipo = "Domestico";
        perro.nombreAnimal = "Perro";
        perro.edadAnimal();
        perro.nombreAnimal();
        perro.tipoAnimal();
        System.out.print("\n_______________________\n");

        // Salvaje

        AnimalSalvaje leon = new AnimalSalvaje();
        leon.comida = new String[3];
        leon.comida[0] = "Bufalo";
        leon.comida[1] = "Cebra";
        leon.comida[2] = "Jirafa";
        leon.genero = "Macho";
        leon.edad = 3;
        leon.tipoDeAnimal = "Salvaje";
        leon.tiempoVida = 20;
        leon.nombreAnimal = "Leon";
        leon.Alimentacion();
        leon.edadAnimal();

    }
}
