package models;
public class Status {
    // Atributos
    private int forca = 5;
    private int defesa = 5;
    private int agilidade = 5;
    private int inteligencia = 5;
    private int defesaMagic = 5;
    private int exp = 0;
    private double gold = 500;

    // Construtor framework
    public Status() {
    }


    //Contrutor
    public Status(int forca, int defesa, int agilidade, int inteligencia, int defesaMagic, int exp, double gold) {
        this.forca = forca;
        this.defesa = defesa;
        this.agilidade = agilidade;
        this.inteligencia = inteligencia;
        this.defesaMagic = defesaMagic;
        this.exp = exp;
        this.gold = gold;
    }

    // Getters and Setters
    public int getForca() {
        return forca;
    }


    public void setForca(int forca) {
        this.forca = forca;
    }


    public int getDefesa() {
        return defesa;
    }


    public void setDefesa(int defesa) {
        this.defesa = defesa;
    }


    public int getAgilidade() {
        return agilidade;
    }


    public void setAgilidade(int agilidade) {
        this.agilidade = agilidade;
    }


    public int getInteligencia() {
        return inteligencia;
    }


    public void setInteligencia(int inteligencia) {
        this.inteligencia = inteligencia;
    }


    public int getDefesaMagic() {
        return defesaMagic;
    }


    public void setDefesaMagic(int defesaMagic) {
        this.defesaMagic = defesaMagic;
    }


    public int getExp() {
        return exp;
    }


    public void setExp(int exp) {
        this.exp = exp;
    }


    public double getGold() {
        return gold;
    }


    public void setGold(double gold) {
        this.gold = gold;
    }

    // toString
    @Override
    public String toString() {
        return "Status: \nForça: " + forca + "\nDefesa: " + defesa + "\nAgilidade: " + agilidade + "\nInteligencia: " + inteligencia + "\nDefesa Magic: " + defesaMagic + "\nExp: " + exp + "\nGold: " + gold;
    }
}