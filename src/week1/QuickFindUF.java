package week1;

/**
 * Created by Matrix on 12.09.2014.
 */
public class QuickFindUF {

    private int[] id;

    public QuickFindUF(int n) {
        id = new int[n];

        for (int i = 0; i < id.length; i++) {
            id[i] = i;
        }
    }

    public boolean conected(int p, int q){
        return id[p] == id[q];
    }

    public void union(int p, int q){
        int pId = id[p];
        int qId = id[q];

        for (int i = 0; i < id.length; i++) {
            if (id[i] == pId) id[i] = qId;

        }
    }
}
