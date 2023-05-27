package Storage;

import Venda.Venda;
import java.util.List;

public interface Stock {
  void armazenar(List<Venda> vendasMes);
}
