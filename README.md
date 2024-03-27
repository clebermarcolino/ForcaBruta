### Descrição
Este repositório contém implementações em Java de algoritmos para gerar permutações de um conjunto de números. Os algoritmos implementados são o método de força bruta (Brute Force) e o método de geração de permutações utilizando Heap's Algorithm.

### Arquivos

- **MainBrute.java**: Contém a classe principal para a geração de permutações utilizando o método de força bruta. Este algoritmo gera todas as possíveis permutações e imprime na saída padrão.
- **MainBrutedHeap.java**: Contém a classe principal para a geração de permutações utilizando o método de Heap. Este algoritmo gera permutações de forma mais eficiente do que o método de força bruta e também imprime na saída padrão.
- **Permutation.java**: Contém a implementação dos métodos `func_perm` e `func_permHeap` responsáveis por gerar as permutações. Além disso, possui métodos auxiliares para troca de elementos e impressão das permutações.

### Utilização
Para utilizar os programas, compile os arquivos Java utilizando o compilador Java (javac). Por exemplo:
```
javac MainBrute.java
javac MainBrutedHeap.java
javac Permutation.java
```
Após a compilação, execute os programas desejados, fornecendo o tamanho da permutação como argumento de linha de comando. Por exemplo:
```
java MainBrute 4
```
ou
```
java MainBrutedHeap 4
```
Isso gerará e imprimirá as permutações de tamanho 4 na saída padrão.

### Contribuições
Contribuições são bem-vindas! Sinta-se à vontade para enviar pull requests com melhorias, correções de bugs ou novos recursos.
