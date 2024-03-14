public class Permutation {
    public void func_print(int[] p, int sz) {
        int i;
        System.out.println();
        for(i = 0;i < sz;i++) {
            System.out.printf("%2d", p[i]);
        }
    }

    public void func_exch(int[] p, int i, int n) {
        int tmp;
        tmp = p[i];
        p[i] = p[n];
        p[n] = tmp;
    }

    public void func_permHeap(int sz, int[] p, int n) {
        int i;
        if(n == 1) {
            func_print(p, sz);
            return;
        }
        func_permHeap(sz, p, n - 1);

        for(i = 0;i < (n - 1);i++) {
            if((n % 2) == 0) {
                func_exch(p, i, n - 1);
            }
            else {
                func_exch(p, 0, n - 1);
            }
            func_permHeap(sz, p, n - 1);
        }
    }

    public void func_perm(int sz,int[] p,int n) {
        int i, j, tmp;
        if(n == sz) {
            func_print(p, sz);
            return;
        }
        for(i = n;i < sz;i++) {
            func_exch(p, n,i);
            func_perm(sz, p, n + 1);
            func_exch(p, i, n);
        }
    }



}
