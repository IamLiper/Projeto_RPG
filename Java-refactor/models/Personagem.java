package models;
public abstract class Personagem
{
    protected String nome;
    protected Sexo sexo;
    // protected Classe classe;
    protected Status status;
    protected double exp;
    protected double gold;
    
    //Construtor vazio
    public Personagem()
    {

    }

    //Construtor preenchido
    public Personagem(String nome, Sexo sexo, Status status, double exp, double gold)
    {
        this.nome = nome;
        this.sexo = sexo;
        this.status = status;
        this.exp = exp;
        this.gold = gold;
    }

    //Getters
    public String getNome()
    {
        return nome;
    }

    public Sexo getSexo()
    {
        return sexo;
    }

    public Status getStatus()
    {
        return status;
    }

    public double getExp()
    {
        return exp;
    }

    public double getGold()
    {
        return gold;
    }

    @Override
    public String toString()
    {
        return "Personagem [nome=" + nome + ", sexo=" + sexo + ", status=" + status + ", exp=" + exp + ", gold=" + gold
                + "]";
    }

    
    
    // public Personagem() {
    // }
    // public Personagem(String nome, Sexo sexo, Classe classe, Status status) {
    //     this.nome = nome;
    //     this.sexo = sexo;
    //     this.classe = classe;
    //     this.status = status;
    // }
    // public String getNome() {
    //     return nome;
    // }
    // public void setNome(String nome) {
    //     this.nome = nome;
    // }
    // public Sexo getSexo() {
    //     return sexo;
    // }
    // public void setSexo(Sexo sexo) {
    //     this.sexo = sexo;
    // }
    // public Classe getClasse() {
    //     return classe;
    // }
    // public void setClasse(Classe classe) {
    //     this.classe = classe;
    // }
    // public Status getStatus() {
    //     return status;
    // }
    // public void setStatus(Status status) {
    //     this.status = status;
    // }
    // @Override
    // public String toString() {
    //     return "Personagem: \nNome: " + nome + "\nSexo: " + sexo + "\nClasse: " + classe + "\nStatus: " + status;
    // }
}
