import java.util.logging.Logger;

public class Jutsu {
    private int chakra;
    private int dano;

    Logger  logger  = Logger.getLogger(getClass().getName());

    public Jutsu(int chakra, int dano) {

        if (chakra <= 5 && chakra >= 1) {
            this.chakra = chakra;
        } else {
            logger.warning("Erro, chakra inválido.");
        }

        if (dano <= 10 && dano >= 1) {
            this.dano = dano;
        } else {
            logger.warning("Erro, dano inválido.");
        }
    }

    public int getChakra() {
        return chakra;
    }

    public int getDano() {
        return dano;
    }
}
