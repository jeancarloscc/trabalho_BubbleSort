// Implementação otimizada em Java do Bubble sort
// Código extraído de https://www.geeksforgeeks.org/bubble-sort/

class BubbleSort {

    // An optimized version of Bubble Sort
    static void bubbleSort(int arrayNumero[], int totalArray)
    {
        int i;
        for (i = 0; i < totalArray - 1; i++) {
            // 3ª Modificação: extraí a lógica de troca de elementos para um método separado "realizarTrocas".
            if (realizarTrocas(arrayNumero, totalArray, i)) break;
        }
    }

    private static boolean realizarTrocas(int[] arrayNumero, int totalArray, int i) {
        boolean trocado = false;
        int j;
        for (j = 0; j < totalArray - i - 1; j++) {
            if (arrayNumero[j] > arrayNumero[j + 1]) {
                // 1ª Modificação: criei o método "isTrocado" para realizar a troca de elementos.
                isTrocado(arrayNumero, j);
                trocado = true;
            }
        }
        // 2ª Modificação: criei o método "verificarTroca" para verificar se houve trocas e decidir se o laço externo deve ser interrompido.
        return verificarTroca(trocado);
    }

    private static boolean verificarTroca(boolean trocado) {
        // If no two elements were
        // trocado by inner loop, then break
        if (trocado == false)
            return true;
        return false;
    }

    // 1ª Modificação: método criado para encapsular a lógica de troca de elementos.
    private static void isTrocado(int[] arrayNumero, int i) {
        int temp = arrayNumero[i];
        arrayNumero[i] = arrayNumero[i + 1];
        arrayNumero[i + 1] = temp;
    }

    // Function to print an array
    static void printArray(int arrayNumero[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arrayNumero[i] + " ");
        System.out.println();
    }

    // Driver program
    public static void main(String args[])
    {
        int arrayNumero[] = { 64, 34, 25, 12, 22, 11, 90 };
        int totalArray = arrayNumero.length; // 4ª Modificação: renomeei a variável "n" para "totalArray" para melhorar a legibilidade.
        bubbleSort(arrayNumero, totalArray);
        System.out.println("Array ordenado: ");
        printArray(arrayNumero, totalArray);
    }
}
