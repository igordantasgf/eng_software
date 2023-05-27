package TiposArmazenamento;

import java.util.List;
import Storage.Stock;
import Venda.Venda;

public class SistemaWeb implements Stock{

  @Override
  public void armazenar(List<Venda> vendasMes){
    for (Venda venda: vendasMes){
      String data = venda.getData();
      double valor = venda.getValor();
      System.out.println("Simulando o registro em Sistema Web: " + data + " " + valor);
    }
    
  }
}