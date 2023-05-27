package GerenciadorTributario;

import Estados.*;

public class ConcreteFactoryEstados extends FactoryEstados{

  @Override
  public Calculador Get_Imposto(String estado){
    switch(estado){
      case "BA":
        return new Estado_BA(); 
      case "PE":
        return new Estado_PE();
    }
    return null;
  }
}

