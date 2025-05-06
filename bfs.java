import java.io.*;
import java.util.*;

class Graph {
    private int Vertices;

    private LinkedList<Integer> adj[];

    Graph(int v) {
        Vertices = v;
        adj = new LinkedList[v];
        for (int i = 0; i < v; i++) {
            adj[i] = new LinkedList();
        }
    }

    void addEdges(int v, int edge) {
        adj[v].add(edge);
    }

    void bfs(int s) {
        boolean visited[] = new boolean[Vertices];

        LinkedList<Integer> queue = new LinkedList<Integer>();

        visited[s] = true;

        queue.add(s);

        while (queue.size() != 0) {
            s = queue.poll();
            System.out.print(s + " ");

            Iterator<Integer> i = adj[s].listIterator();
            while (i.hasNext()) {
                int n = i.next();
                if (!visited[n]) {
                    visited[n] = true;
                    queue.add(n);
                }
            }
        }

    }

    public static void main(String args[]) {
        Graph g = new Graph(4);

        g.addEdges(0, 1);
        g.addEdges(0, 2);
        g.addEdges(1, 2);
        g.addEdges(2, 0);
        g.addEdges(2, 3);
        g.addEdges(3, 3);

        Scanner input = new Scanner(System.in);
        int start = input.nextInt();
        System.out.println("Following the BFS(starting point " + start + ") : ");

        g.bfs(start);

    }
}
