public class MainBrute {
    public static void main(String[] args) {
        int sz = 4; // Tamanho padrão da permutação
        if (args.length > 0) {
            sz = Integer.parseInt(args[0]);
        }

        int[] p = new int[sz];
        for (int i = 0; i < sz; ++i) {
            p[i] = i + 1;
        }

        long totalTime = 0; // Variável para armazenar o tempo total de execução

        // Executa o código várias vezes para calcular o tempo médio
        int numExecutions = 6; // Número de execuções a serem realizadas
        for (int i = 0; i < numExecutions; i++) {
            long startTime = System.currentTimeMillis(); // Tempo de início
            Permutation.func_perm(sz, p, 0);

            long endTime = System.currentTimeMillis(); // Tempo de fim
            long elapsedTime = endTime - startTime; // Tempo decorrido
            totalTime += elapsedTime;

            System.out.println("\n--------------------------------------");
        }

        // Calcula o tempo médio de execução em milissegundos
        double averageTime = (double) totalTime / numExecutions;

        System.out.println("\nAverage execution time: " + averageTime + " milliseconds");
    }
}


