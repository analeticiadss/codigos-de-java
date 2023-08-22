class Sala {
    int bloco, sala, capacidade;
    boolean acessivel;
    
    Sala () {}
    
    Sala(int bloco, int sala, int capacidade, boolean acessivel) {
        this.bloco = bloco;
        this.sala = sala;
        this.capacidade = capacidade;
        this.acessivel = acessivel;
    }
    
    String getDescricao() {
        if(acessivel == false) {
            return ("Bloco" + bloco + ", Sala " + sala + " (" + capacidade +
        " lugares, não acessivel)");
        } else {
            return ("Bloco" + bloco + ", Sala " + sala + " (" + capacidade +
        " lugares, acessivel)");
        }
        /*return ("Bloco" + bloco + ", Sala " + sala + " (" + capacidade +
        " lugares, " + ehAcessivel + ")");*/
    }
}
