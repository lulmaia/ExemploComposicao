public class Main {
    public static void main(String[] args) {
        Equipamento equipamento = new Equipamento("Mixer", "Pioneer");
        DJ dj = new DJ("Luís Maia", equipamento);
        dj.tocar();
    }
}