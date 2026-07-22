public class Ninja {
    private String nome;
    private int chakra;
    private Jutsu jutsu;

    public Ninja(String nome, Jutsu jutsu) {
        this.nome = nome;
        this.jutsu = jutsu;
        this.chakra = 100;
    }

    public void atacar(Ninja ninjaOponente) {
        ninjaOponente.receberGolpe(this.jutsu.getDano());
        this.chakra = this.chakra - this.jutsu.getChakra();
    }

    public void receberGolpe(int danoRecebido) {
        this.chakra = this.chakra - danoRecebido;
    }

    public String getNome() {
        return nome;
    }

    public int getChakra() {
        return chakra;
    }

    public Jutsu getJutsu() {
        return jutsu;
    }
}