import java.util.List;

//Modificação:
//   - Pricípio de responsabilidade única: separar calculador de imposto   
//       de armazenamento no banco 
//   - Princípio aberto-fechado: extensão

abstract class GerenciadorTributario{
  public abstract registraTotal(List<Venda> vendasMes);
}

class Estado_BA extends GerenciadorTributario{
  public override registraTotal(List<Venda> vendasMes){
    double imposto = 0;
    for (Venda venda: vendasMes){
      if(venda.getValor() < 1000){
        imposto += 0.05 * venda.getValor();
      }
      else{
        imposto += 0.07 * venda.getValor();
      }
    }
    return imposto;
  }
}

class Estado_PE extends GerenciadorTributario{
  public override registraTotal(List<Venda> vendasMes){
    double imposto = 0;
    for (Venda venda: vendasMes){
      if(venda.getValor() < 2000){
        imposto += 0.08 * venda.getValor();
      }
      else{
        imposto += 0.09 * venda.getValor();
      }
    }
    return imposto;
  }
}