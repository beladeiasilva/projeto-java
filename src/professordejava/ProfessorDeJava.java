
package professordejava;

import javax.swing.JOptionPane;


public class ProfessorDeJava {


    public static void main(String[] args) {
        int nivel, quantidade, resultado = 0;

        JOptionPane.showMessageDialog(null, "Olá! Vamos Calcular o Seu Salário Nesta Semana! ");
        nivel = Integer.parseInt(JOptionPane.showInputDialog("Digite o Seu Nivel de Professor:"));
        quantidade = Integer.parseInt(JOptionPane.showInputDialog("Digite a Quantidade de Aulas que Você Deu Essa Semana:"));

        if (nivel == 1) {
            resultado = quantidade * 12;
        } else if (nivel == 2) {
            resultado = quantidade * 17;
        } else if (nivel == 3) {
            resultado = quantidade * 25;
        } else {
            JOptionPane.showMessageDialog(null, "Erro!");
        }

        JOptionPane.showMessageDialog(null,"Seu Salário essa semana é R$"+ resultado);

    }

}
//	Professor Nível 1 - R$ 12,00 por hora/aula
//	Professor Nível 2 - R$ 17,00 por hora/aula
//	Professor Nível 3 - R$ 25,00 por hora/aula
