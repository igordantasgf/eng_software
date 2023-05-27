package Estados;

import java.util.List;
import GerenciadorTributario.Calculador;
import Venda.Venda;

public class Estado_PE implements Calculador{
  @Override
  public List<Venda> calcular_imposto(List<Venda> vendasMes){
    double imposto = 0;
    for (Venda venda: vendasMes){
      if(venda.getValor() < 1000){
        imposto += 0.04 * venda.getValor();
      }
      else{
        imposto += 0.08 * venda.getValor();
      }
      venda.setValorImposto(imposto);
    }
    return vendasMes;
  }
}