import javax.swing.JComboBox;
import javax.swing.JOptionPane;

public class ConversorMoeda {
    public static void main(String[] args) {

        boolean continuar = true;

            do {

            String[] opcoes = {"Real para Dólar", "Real para Euro", "Real para Libras Esterlinas", "Real para Peso Argentino", "Real para Peso Chileno", "Dólar para Real", "Euro para Real", "Libras Esterlinas para Real", "Peso Argentino para Real", "Peso Chileno para Real"};

            JComboBox<String> comboBox = new JComboBox<>(opcoes);
            

            JOptionPane.showMessageDialog(null, comboBox, "Selecione a conversão", JOptionPane.QUESTION_MESSAGE);

            String opcaoSelecionada = (String) comboBox.getSelectedItem();
            
            String valorMoedaStr = JOptionPane.showInputDialog(null, "Digite o valor:");
            double valorMoeda = Double.parseDouble(valorMoedaStr);
            
            double valorConvertido = 0;

            if (opcaoSelecionada.equals("Real para Dólar")) {
                valorConvertido = valorMoeda * 0.20;
            } else if (opcaoSelecionada.equals("Real para Euro")) {
                valorConvertido = valorMoeda * 0.19;
            } else if (opcaoSelecionada.equals("Real para Libras Esterlinas")){
                valorConvertido = valorMoeda * 0.16;
            } else if (opcaoSelecionada.equals("Real para Peso Argentino")){
                valorConvertido = valorMoeda * 53.38;
            } else if (opcaoSelecionada.equals("Real para Peso Chileno")){
                valorConvertido = valorMoeda * 164.14;
            } else if (opcaoSelecionada.equals("Dólar para Real")){
                valorConvertido = valorMoeda * 4.87;
            } else if (opcaoSelecionada.equals("Euro para Real")){
                valorConvertido = valorMoeda * 5.30;
            } else if (opcaoSelecionada.equals("Libras Esterlinas para Real")){
                valorConvertido = valorMoeda * 6.21;
            } else if (opcaoSelecionada.equals("Peso Argentino para Real")){
                valorConvertido = valorMoeda * 0.019;
            } else if (opcaoSelecionada.equals("Peso Chileno para Real")){
                valorConvertido = valorMoeda * 0.0061;
            }

            JOptionPane.showMessageDialog(null, "O valor convertido é: " + valorConvertido);

            int resposta = JOptionPane.showConfirmDialog(null, "Deseja realizar a conversão novamente?", "Nova conversão", JOptionPane.YES_NO_OPTION);
            
            if (resposta == JOptionPane.NO_OPTION) {
                continuar = false;
            }
        } while (continuar);
    }

}
