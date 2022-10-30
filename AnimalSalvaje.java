
public class AnimalSalvaje extends AnimalDomestico {
    String[] comida;
    int tiempoVida;

    public void Alimentacion() {
        String alimentos = "";
        for (String i : this.comida) {
            alimentos += i + ", ";
        }
        System.out.print(alimentos + "\n");

    }

    public void tiempoVida() {
        System.out.print(this.tiempoVida+"\n");
    }
}
