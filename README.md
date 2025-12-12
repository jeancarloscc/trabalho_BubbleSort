# Bubble Sort em Java — Clean Code

## Descrição

Este projeto apresenta uma versão refatorada do algoritmo Bubble Sort em Java, seguindo princípios de _clean code_ conforme solicitado no trabalho da disciplina. O objetivo é demonstrar como tornar o código mais legível, organizado e de fácil manutenção.

## O que é Bubble Sort?

Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente o array, compara elementos adjacentes e os troca de posição se estiverem na ordem errada. O processo é repetido até que o array esteja ordenado.

## Alterações de Clean Code Realizadas

Foram realizadas ao menos três alterações principais para tornar o código mais aderente aos princípios de _clean code_:

1. **Nomenclatura clara e padronizada**  
   Variáveis e métodos foram renomeados para nomes descritivos e em português, como `valores`, `houveTroca`, `realizarPassada`, `trocarAdjacentes` e `imprimirArray`, facilitando o entendimento do código.

2. **Remoção de parâmetros e métodos redundantes**  
   O método de ordenação agora recebe apenas o array, calculando o tamanho internamente. Métodos intermediários e verificações desnecessárias foram eliminados, deixando o fluxo mais direto.

3. **Early exit otimizado**  
   O laço externo é interrompido imediatamente quando não há mais trocas, evitando iterações desnecessárias e melhorando a eficiência.

## Exemplo de Código Java Refatorado

```java
class BubbleSort {
   static void bubbleSort(int[] valores) {
      int ultimoIndice = valores.length - 1;
      for (int passada = 0; passada < ultimoIndice; passada++) {
         boolean houveTroca = realizarPassada(valores, passada, ultimoIndice);
         if (!houveTroca) break;
      }
   }

   private static boolean realizarPassada(int[] valores, int passada, int ultimoIndice) {
      boolean houveTroca = false;
      for (int i = 0; i < ultimoIndice - passada; i++) {
         if (valores[i] > valores[i + 1]) {
            trocarAdjacentes(valores, i);
            houveTroca = true;
         }
      }
      return houveTroca;
   }

   private static void trocarAdjacentes(int[] valores, int indice) {
      int temporario = valores[indice];
      valores[indice] = valores[indice + 1];
      valores[indice + 1] = temporario;
   }

   static void imprimirArray(int[] valores) {
      for (int valor : valores) {
         System.out.print(valor + " ");
      }
      System.out.println();
   }

   public static void main(String[] args) {
      int[] valores = {64, 34, 25, 12, 22, 11, 90};
      bubbleSort(valores);
      System.out.println("Array ordenado:");
      imprimirArray(valores);
   }
}
```

## Como executar

1. Compile o arquivo Java:
   ```
   javac trabalho_jean.java
   ```
2. Execute o programa:
   ```
   java BubbleSort
   ```

## Referências

- [Sorting Algorithms - GeeksforGeeks](https://www.geeksforgeeks.org/sorting-algorithms/)
