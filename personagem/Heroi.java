package personagem;

public class Heroi {

    // ATRIBUTOS IMUTÁVEIS
    private final String nome;
    private final String classe;

    // ATRIBUTOS MUTÁVEIS
    private int ataque;
    private int defesa;
    private int poder;
    private int nivel;
    private int xp;

    // CONSTRUTOR
    public Heroi(String nome, String classe) {

        this.nome = nome;
        this.classe = classe;
        this.nivel = 1;
        this.xp = 0;

        definirAtributosIniciais();
    }

    // DEFINE OS ATRIBUTOS BASE DE CADA CLASSE
    private void definirAtributosIniciais() {

        switch (classe) {

            case "Warrior":
                ataque = 10;
                defesa = 15;
                poder = 5;
                break;

            case "Hunter":
                ataque = 15;
                defesa = 10;
                poder = 5;
                break;

            case "Mago":
                ataque = 10;
                defesa = 5;
                poder = 15;
                break;
        }
    }

    // GANHAR XP
    public void ganharXp(int quantidade) {
        xp += quantidade;

        if (xp >= 100) {
            subirNivel();
            xp = 0;
        }
    }

    // SUBIR NÍVEL
    private void subirNivel() {

        nivel++;

        ataque += 1;
        defesa += 1;
        poder += 1;

        System.out.println(nome + " subiu para o nível " + nivel);
    }

    // MOSTRAR STATUS
    public void mostrarStatus() {
        System.out.println("Nome: " + nome);
        System.out.println("Classe: " + classe);
        System.out.println("Nivel: " + nivel);
        System.out.println("Ataque: " + ataque);
        System.out.println("Defesa: " + defesa);
        System.out.println("Poder: " + poder);
        System.out.println("XP: " + xp);
    }
}