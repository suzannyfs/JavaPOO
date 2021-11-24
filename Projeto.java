import javax.swing.JOptionPane;
import java.time.format.DateTimeFormatter;
import java.time.LocalDate;

public class Projeto {
    public static void main(String[] args) {
        Pessoa objPessoa = new Pessoa();
        objPessoa.setNome(JOptionPane.showInputDialog(null, "Informe seu nome: "));
        DateTimeFormatter brFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String dataNascimento = JOptionPane.showInputDialog(null, "Informe sua data de nascimento: ");
        objPessoa.setdtNascimento(LocalDate.parse(dataNascimento, brFormat));
        objPessoa.setAltura(Double.parseDouble(JOptionPane.showInputDialog(null, "Informe sua altura: ")));

        JOptionPane.showMessageDialog(null,objPessoa.toString());
    }
}