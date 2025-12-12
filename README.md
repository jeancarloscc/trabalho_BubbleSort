# trabalho_BubbleSort

## Descrição

Este projeto apresenta uma versão com princípios de *clean code* do algoritmo Bubble Sort, conforme solicitado no trabalho da disciplina. O objetivo é demonstrar como tornar o código mais legível, organizado e de fácil manutenção.

## O que é Bubble Sort?

Bubble Sort é um algoritmo de ordenação simples que percorre repetidamente a lista, compara elementos adjacentes e os troca de posição se estiverem na ordem errada. O processo é repetido até que a lista esteja ordenada.

## Alterações de Clean Code Realizadas

A partir do código original de Bubble Sort, foram realizadas ao menos três alterações para torná-lo mais aderente aos princípios de *clean code*:

1. **Renomeação de variáveis e funções para nomes descritivos**  
   Variáveis como `i`, `j` e funções genéricas foram renomeadas para nomes que indicam claramente seu propósito, como `currentIndex`, `nextIndex`, `bubbleSort`, etc.

2. **Extração de funções**  
   Trechos de código responsáveis por tarefas específicas, como a troca de elementos, foram extraídos para funções separadas (`swap`), melhorando a legibilidade e a reutilização.

3. **Remoção de comentários desnecessários e código morto**  
   Comentários redundantes e trechos de código não utilizados foram removidos, deixando o código mais limpo e fácil de entender.

## Exemplo de Código Clean Code

```python
def bubble_sort(array):
    n = len(array)
    for current_index in range(n):
        for next_index in range(0, n - current_index - 1):
            if array[next_index] > array[next_index + 1]:
                swap(array, next_index, next_index + 1)

def swap(array, index1, index2):
    array[index1], array[index2] = array[index2], array[index1]

# Exemplo de uso
numbers = [64, 34, 25, 12, 22, 11, 90]
bubble_sort(numbers)
print("Array ordenado:", numbers)
```

## Como executar

1. Copie o código acima para um arquivo `.py`.
2. Execute com Python 3:  
   ```
   python nome_do_arquivo.py
   ```

## Referências

- [Sorting Algorithms - GeeksforGeeks](https://www.geeksforgeeks.org/sorting-algorithms/)
