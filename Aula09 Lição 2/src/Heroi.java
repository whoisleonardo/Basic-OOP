public class Heroi {

    //Crie a classe Heroi com os seguintes atributo
    private String nomeHeroi;
    private String raca;
    private String golpeespecial;

    //Crie os construtores padrão e parametrizado, bem como getters e setters e o métdodo "toString" que mostrará todos os dados do herói na tela e o método "atacar" que mostrara na tela a seguinte mensagem:

    public Heroi (String nomeHeroi, String raca, String golpeespecial){
        this.nomeHeroi = nomeHeroi;
        this.raca = raca;
        this.golpeespecial = golpeespecial;
    }
    public Heroi (){}
    public String getNomeHeroi() {
        return nomeHeroi;
    }
    public void setNomeHeroi(String nomeHeroi) {
        this.nomeHeroi = nomeHeroi;
    }
    public String getRaca() {
        return raca;
    }
    public void setRaca(String raca) {
        this.raca = raca;
    }
    public String getGolpeespecial() {
        return golpeespecial;
    }
    public void setGolpeespecial(String golpeespecial) {
        this.golpeespecial = golpeespecial;
    }

    public void atacar() {
        System.out.println("O herói " + nomeHeroi + " atacou o inimigo com seu golpe especial " + golpeespecial + "!");
    }

    @Override
    public String toString() {
        
        String dados = "Nome do herói: " + nomeHeroi + "\n" +
                        "Raça: " + raca + "\n" +
                        "Golpe Especial: " + golpeespecial + "\n";

        return dados;
    }

}
