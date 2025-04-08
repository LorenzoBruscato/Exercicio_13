package exercicio_13;

import javax.swing.JOptionPane;

public class Exercicio_13 {

    public static void main(String[] args) {
        double Salario_Bruto, Prestacao, resultado;
        Salario_Bruto = Double.parseDouble(JOptionPane.showInputDialog("Insira do Salario:"));
        Prestacao = Double.parseDouble(JOptionPane.showInputDialog("Insira um Prestação:"));
        if (Prestacao > (Salario_Bruto * 0.30)) {
            JOptionPane.showMessageDialog(null, "Prestacao negada");
        } else {
            JOptionPane.showMessageDialog(null, "Prestacao concedida");
        }
    }
}