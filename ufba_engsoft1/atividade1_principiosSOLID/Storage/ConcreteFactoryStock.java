package Storage;

import TiposArmazenamento.BancoDeDados;
import TiposArmazenamento.SistemaWeb;

public class ConcreteFactoryStock extends FactoryStock {

  @Override
  public Stock GetMetodo(String metodo) {
    switch(metodo){
      case "BancoDeDados":
        return new BancoDeDados();
      case "SistemaWeb":
        return new SistemaWeb();
    }
    return null;
  }
  
}
