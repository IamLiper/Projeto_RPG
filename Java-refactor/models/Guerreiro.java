package models;

public class Guerreiro extends Personagem
{
    private int forca;
    private int defesa;
    private int agilidade;
    private int inteligencia;
    private int defesaMagic;
    
    //Construtor vazio
    public Guerreiro()
    {
        
    }

    //Construtor preenchido
    public Guerreiro(String nome, Sexo sexo, Status status, double exp, double gold, int forca, int defesa, int agilidade, int inteligencia, int defesaMagic)
    {
        super(nome, sexo, status, exp, gold);
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.defesaMagic = defesaMagic;
    }

    //Getters e Setters
    public int getForca()
    {
        return forca;
    }

    public void setForca(int forca)
    {
        this.forca = forca;
    }

    public int getDefesa()
    {
        return defesa;
    }

    public void setDefesa(int defesa)
    {
        this.defesa = defesa;
    }

    public int getAgilidade()
    {
        return agilidade;
    }

    public void setAgilidade(int agilidade)
    {
        this.agilidade = agilidade;
    }

    public int getInteligencia()
    {
        return inteligencia;
    }

    public void setInteligencia(int inteligencia)
    {
        this.inteligencia = inteligencia;
    }

    public int getDefesaMagic()
    {
        return defesaMagic;
    }

    public void setDefesaMagic(int defesaMagic)
    {
        this.defesaMagic = defesaMagic;
    }

    @Override
    public String toString()
    {
        return "Guerreiro [forca=" + forca + ", defesa=" + defesa + ", agilidade=" + agilidade + ", inteligencia="
                + inteligencia + ", defesaMagic=" + defesaMagic + "]";
    }

    
    
}
