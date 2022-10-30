public class main {
    public static void main(String[] args) {
        // TU CÓDIGO
        // Domestico
        AnimalDomestico perro = new AnimalDomestico();
        perro.edad = 5;
        perro.genero = "Masculino";
        perro.tipo = "Domestico";
        perro.nombreAnimal = "Perro";
        perro.edad();
        perro.genero();
        perro.nombreAnimal();
        perro.tipoAnimal();
        System.out.print("_______________________\n");

        // Salvaje

        AnimalSalvaje leon = new AnimalSalvaje();
        leon.comida = new String[3];
        leon.comida[0] = "Bufalo";
        leon.comida[1] = "Cebra";
        leon.comida[2] = "Jirafa";
        leon.genero = "Macho";
        leon.edad = 3;
        leon.tipo = "Carnivoro";
        leon.tiempoVida = 20;
        leon.nombreAnimal = "Leon";
        leon.Alimentacion();
        leon.edad();
        leon.genero();
        leon.nombreAnimal();
    }
}
