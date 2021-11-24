package Projeto;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Pessoa {
    private String nome;
    private LocalDate dtNascimento;
    private double altura;

    public String getNome(){
        return nome;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public LocalDate getdtNascimento() {
        return dtNascimento;
    }

    public void setdtNascimento(LocalDate dtNascimento) {
        this.dtNascimento = dtNascimento;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public int Idade(){
        DateTimeFormatter formtDtYYYY = DateTimeFormatter.ofPattern("yyyy");
        LocalDate dtAtual = LocalDate.now();
        int anoNascimento = Integer.parseInt(dtNascimento.format(formtDtYYYY));
        int anoAtual = Integer.parseInt(dtAtual.format(formtDtYYYY));
        return anoAtual - anoNascimento;
    }

    @Override
    public String toString() {
        return "Pessoa [altura=" + altura + ", dataNascimento=" + dtNascimento + ", nome=" + nome + "]";
    }
    
}
