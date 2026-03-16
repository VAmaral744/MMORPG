public enum Item {

    ESPADA(5,0,0),
    ESCUDO(0,5,0),
    ARCO(6,0,0),
    FLECHA(2,0,0),
    CAJADO(0,0,6);

    public final int ataque;
    public final int defesa;
    public final int poder;

    Item(int ataque, int defesa, int poder){
        this.ataque = ataque;
        this.defesa = defesa;
        this.poder = poder;
    }
}


