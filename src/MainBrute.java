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

        long totalTime = 0;
        int numExecutions = 6; // Número de execuções a serem realizadas
        for (int i = 0; i < numExecutions; i++) {
            long startTime = System.currentTimeMillis();
            Permutation.func_perm(sz, p, 0);

            long endTime = System.currentTimeMillis();
            long elapsedTime = endTime - startTime;
            totalTime += elapsedTime;
        }

        // Calcula o tempo médio de execução em milissegundos
        double averageTime = (double) totalTime / numExecutions;

        System.out.println("\nAverage execution time: " + averageTime + " milliseconds");
    }
}


