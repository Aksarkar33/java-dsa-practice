package patterns.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.Stack;

public class TopologicalSort {
    static Map<Integer, List<Integer>> graph = new HashMap<>();

    static void addEdge(int u, int v) {
        graph.computeIfAbsent(u, k -> new ArrayList<>()).add(v);
    }
    static void dfs(int node, Set<Integer> visited, Stack<Integer> stack){
        visited.add(node);

        for(int neighbors : graph.getOrDefault(node, new ArrayList<>())){
            if (!visited.contains(neighbors)) {
                dfs(neighbors, visited, stack);
            }
        }
        stack.push(node);

    }
    static List<Integer> topSort(int n){
        Set<Integer> visited=new HashSet<>();
        Stack<Integer> stack=new Stack<>();

        for (int i=0;i<n;i++){
            if (!visited.contains(i)) {
                dfs(i, visited, stack);
            }
        }
        List<Integer> result=new ArrayList<>();
        while (!stack.isEmpty()) {
            result.add(stack.pop());
        }
        return result;
    }
      public static void main(String[] args) {
       
        addEdge(5, 2);
        addEdge(5, 0);
        addEdge(4, 0);
        addEdge(4, 1);
        addEdge(2, 3);
        addEdge(3, 1);

        System.out.println("Topological order: " + topSort(6));
        
    }

}
