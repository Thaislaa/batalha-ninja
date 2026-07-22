public class Jutsu {
    private int chakra;
    private int dano;

    public Jutsu(int chakra, int dano) {

        if (chakra <= 5 && chakra >= 1) {
            this.chakra = chakra;
        } else {
            System.out.println("Erro, chakra inválido.");
        }

        if (dano <= 10 && dano >= 1) {
            this.dano = dano;
        } else {
            System.out.println("Erro, dano inválido.");
        }
    }

    public int getChakra() {
        return chakra;
    }

    public int getDano() {
        return dano;
    }
}
