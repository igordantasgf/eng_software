//Princípio aberto-fechado

abstract class Storage{
  public abstract void save(int ano, int mes, double valor);
}

class store_BancoDeDados extends Storage{
  public override void save(int ano, int mes, double valor){
    System.out.println("Simulando o registro em banco de dados: " + ano + "/" + mes + " " + valor);
  }
}

class store_Arquivo extends Storage{
  public override void save(int ano, int mes, double valor){
    System.out.println("Simulando o registro em arquivo: " + ano + "/" + mes + " " + valor);
  }
}