package patterns.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

public class ConnectedComponents {
    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int v,int u){
        graph.computeIfAbsent(u, k->new ArrayList<>()).add(v);
        graph.computeIfAbsent(v, k->new ArrayList<>()).add(u);
    }

    static void bfs(int start, Set<Integer> visited ){
        
        Queue<Integer> queue= new LinkedList<>();

        queue.add(start);
        visited.add(start);

        while (!queue.isEmpty()) {

            int node = queue.poll();
            System.out.println(node+ " ");

            for (int neighbor : graph.getOrDefault(node, new ArrayList<>())){

                if (!visited.contains(neighbor)) {
                    visited.add(neighbor);
                    queue.add(neighbor);
                }
            }
        }
    }
    static int countComponents(int n){
        Set<Integer> visited =new HashSet<>();
        int count =0;

        for (int i = 0; i < n; i++) {
            if (!visited.contains(i)) {
                bfs(i, visited); 
                count++;       
            }
        }
        return count;
    }

    public static void main(String[] args){
        int n=6;
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(3, 4);

        System.out.println("Components: "+ countComponents(n));
    }
}
