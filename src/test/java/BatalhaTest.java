import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertSame;

public class BatalhaTest {
    @Test
    public void deveRetornarNinjaComJutsuMaisForteSeOsDoisGastamOMesmoChakra() {
        Jutsu jutsuNinjaUm = new Jutsu(5, 10);
        Ninja ninjaUm = new Ninja("Naruto", jutsuNinjaUm);

        Jutsu jutsuNinjaDois = new Jutsu(5, 8);
        Ninja ninjaDois = new Ninja("Gaara", jutsuNinjaDois);

        Batalha batalha = new Batalha();

        Ninja ninjaVencedor = batalha.lutar(ninjaUm, ninjaDois);

        assertSame(ninjaUm, ninjaVencedor);
    }

    @Test
    public void deveAtualizarOChakraDoOponenteDeAcordoComODanoDoJutsoQuandoAtacar() {
        Jutsu jutsuNinjaAtacante = new Jutsu(5, 10);
        Ninja ninjaAtacante = new Ninja("Naruto", jutsuNinjaAtacante);

        Jutsu jutsuNinjaOponente = new Jutsu(5, 8);
        Ninja ninjaOponente = new Ninja("Gaara", jutsuNinjaOponente);

        int nivelChakraEsperado = 90;

        ninjaAtacante.atacar(ninjaOponente);

        assertEquals(nivelChakraEsperado, ninjaOponente.getChakra());
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuUm = new Jutsu(5, 5);
        Ninja primeiroNinja = new Ninja("Itachi", jutsuUm);

        Jutsu jutsuDois = new Jutsu(5, 10);
        Ninja segundoNinja = new Ninja("Naruto", jutsuDois);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(primeiroNinja, segundoNinja);

        assertSame(primeiroNinja, vencedor);
    }

    @Test
    public void deveRetornarSegundoNinjaComoVencedorQuandoONomeForItachi() {
        Jutsu jutsuUm = new Jutsu(5, 10);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuUm);

        Jutsu jutsuDois = new Jutsu(5, 5);
        Ninja segundoNinja = new Ninja("Itachi", jutsuDois);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(primeiroNinja, segundoNinja);

        assertSame(segundoNinja, vencedor);
    }

    @Test
    public void deveRetornarPrimeiroNinjaComoVencedorQuandoEmpatar() {
        Jutsu jutsuUm = new Jutsu(5, 10);
        Ninja primeiroNinja = new Ninja("Naruto", jutsuUm);

        Jutsu jutsuDois = new Jutsu(5, 10);
        Ninja segundoNinja = new Ninja("Sasuke", jutsuDois);

        Batalha batalha = new Batalha();

        Ninja vencedor = batalha.lutar(primeiroNinja, segundoNinja);

        assertSame(primeiroNinja, vencedor);
    }

    @Test
    public void deveRetornarErroQuandoDanoForInvalido() {
        int chakraValido = 3;
        int danoInvalido = 15;

        Jutsu jutsu = new Jutsu(chakraValido, danoInvalido);

        assertEquals(0, jutsu.getDano());
    }
}
