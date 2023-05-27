import java.util.ArrayList;
import java.util.List;

import GerenciadorTributario.*;
import Storage.*;
import Venda.Venda;


public class Programa {

  public static void main(String[] args) {
	List<Venda> vendas = new ArrayList<Venda>();

  vendas.add(new Venda("10/05/2023", 11.5));
  vendas.add(new Venda("10/05/2023", 8.5));
  vendas.add(new Venda("10/05/2023", 200.5));
  
  FactoryEstados factory_estado = new ConcreteFactoryEstados();

  Calculador Notas = factory_estado.Get_Imposto("BA");
  List<Venda> vendas_i = Notas.calcular_imposto(vendas);

  FactoryStock factory_stock = new ConcreteFactoryStock();

  Stock SistemaWeb = factory_stock.GetMetodo("SistemaWeb");
  SistemaWeb.armazenar(vendas_i);
  }

}
