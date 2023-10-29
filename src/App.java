import br.com.randrade.annotation.Tabela;

//utilizados a anotação @tabela na classe, método e construtor
@Tabela("Nome1")
class App {
    @Tabela("Nome2")
    private String nome;

    @Tabela("Nome2")
    public App(String nome) {
        this.nome = nome;
    }
}
