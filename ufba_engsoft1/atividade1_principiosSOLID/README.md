# Exercício para Avaliação


## Correção de seguintes mudanças no sistema

- o sistema poderá, no futuro, ser instalado em outros Estados
- o mecanismo onde o imposto total é registrado pode mudar. Atualmente o registro é feito em banco de dados, mas, no futuro pode ser feito em arquivo, ou em repositório web etc

### Objetivo

Refatore o programa para que, quando for necessário alterar o cálculo do imposto ou o mecanismo de registro do total do imposto, tais mudanças sejam feitas de forma mais fácil, alterando o mínimo de código existente.

### Métodos

- Utilização de factories para mecanismos de registro e Estados
- Princípios SOLID

---

## Referências
- [Segregação de interfaces](https://medium.com/contexto-delimitado/o-princ%C3%ADpio-da-segrega%C3%A7%C3%A3o-de-interfaces-2b673374406e)
- [Inversão de dependência](https://medium.com/contexto-delimitado/o-princ%C3%ADpio-da-invers%C3%A3o-de-depend%C3%AAncia-d52987634fa9)
