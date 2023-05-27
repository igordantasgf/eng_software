package GerenciadorTributario;
import java.util.List;

import Venda.Venda;

public interface Calculador{
  List<Venda> calcular_imposto(List<Venda> vendasMes);
}
