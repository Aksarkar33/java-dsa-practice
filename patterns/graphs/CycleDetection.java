package patterns.graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class CycleDetection {
    static Map<Integer ,List<Integer>> graph  = new HashMap<>();

    static void addEdge(int u,int v){

        graph.computeIfAbsent(u,k-> new ArrayList<>()).add(v);

    }

   

    static boolean dfs(int node, Set<Integer> visited ,Set<Integer> inRecursionStack){
        visited.add(node);
        inRecursionStack.add(node);
        for(int neighbor : graph.getOrDefault(node, new ArrayList<>())){
            if (inRecursionStack.contains(neighbor)) {
                return true;

            }
            else if (!visited.contains(neighbor)) {
                boolean hasCycle =dfs(neighbor, visited, inRecursionStack);
                if (hasCycle) {
                    return true;
                }
            }


        }
        inRecursionStack.remove(node);
        return false;
    }

    static boolean hasCycle(int n){
        Set<Integer> visited = new HashSet<>();
        Set<Integer> inRecursionStack =new HashSet<>();

        for(int i=0;i<n;i++){
            if (!visited.contains(i)) {
                if (dfs(i, visited, inRecursionStack)) {
                    return true;
                }
            }
        }
        return false;
    }
     public static void main(String[] args) {
        addEdge(0, 1);
        addEdge(1, 2);
        addEdge(2, 0); 

        System.out.println("Has cycle: " + hasCycle(3));
        
    }
}
