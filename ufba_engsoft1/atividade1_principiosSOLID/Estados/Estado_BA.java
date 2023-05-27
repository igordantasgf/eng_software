package Estados;

import java.util.List;
import GerenciadorTributario.Calculador;
import Venda.Venda;

public class Estado_BA implements Calculador{
  @Override
  public List<Venda> calcular_imposto(List<Venda> vendasMes){
    double imposto = 0;
    for (Venda venda: vendasMes){
      if(venda.getValor() < 1000){
        imposto += 0.05 * venda.getValor();
      }
      else{
        imposto += 0.07 * venda.getValor();
      }
      venda.setValorImposto(imposto);
    }
    return vendasMes;
  }
}

