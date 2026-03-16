import personagem.Heroi;
import personagem.inimigo;

public class Calculator {

public class SistemaCombate {

    public static void lutar(Heroi heroi, inimigo inimigo) {

        while (heroi.getVida() > 0 && inimigo.vida > 0) {

            // HEROI ATACA
            int danoHeroi = heroi.getAtaque() - inimigo.defesa;

            if (danoHeroi <= 0) {
                danoHeroi = 1;
            }

            inimigo.vida -= danoHeroi;

            System.out.println("Heroi atacou e causou " + danoHeroi + " de dano.");

            if (inimigo.vida <= 0) {
                System.out.println("Caranguejo derrotado!");
                break;
            }

            // INIMIGO ATACA
            int danoInimigo = inimigo.ataque - heroi.getDefesa();

            if (danoInimigo <= 0) {
                danoInimigo = 1;
            }

            heroi.setVida(heroi.getVida() - danoInimigo);

            System.out.println("Caranguejo atacou e causou " + danoInimigo + " de dano.");

        }

        if (heroi.getVida() <= 0) {
            System.out.println("O herói morreu.");
        }

    }
}
    
}
