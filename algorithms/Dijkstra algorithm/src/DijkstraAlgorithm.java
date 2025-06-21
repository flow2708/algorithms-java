import java.util.*;

public class DijkstraAlgorithm {

    // Граф будет представлен как Map<String, Map<String, Integer>>
    private Map<String, Map<String, Integer>> graph = new HashMap<>();
    private Map<String, Integer> costs = new HashMap<>();
    private Map<String, String> parents = new HashMap<>();
    private Set<String> processed = new HashSet<>();

    public void initializeGraph() {
        // Инициализация графа как в примере
        graph.put("start", new HashMap<>());
        graph.get("start").put("a", 6);
        graph.get("start").put("b", 2);

        graph.put("a", new HashMap<>());
        graph.get("a").put("fin", 1);

        graph.put("b", new HashMap<>());
        graph.get("b").put("a", 3);
        graph.get("b").put("fin", 5);

        graph.put("fin", new HashMap<>());

        // Инициализация costs
        costs.put("a", 6);
        costs.put("b", 2);
        costs.put("fin", Integer.MAX_VALUE);

        // Инициализация parents
        parents.put("a", "start");
        parents.put("b", "start");
        parents.put("fin", null);
    }

    public String findLowestCostNode() {
        int lowestCost = Integer.MAX_VALUE;
        String lowestCostNode = null;

        for (Map.Entry<String, Integer> entry : costs.entrySet()) {
            String node = entry.getKey();
            int cost = entry.getValue();

            if (cost < lowestCost && !processed.contains(node)) {
                lowestCost = cost;
                lowestCostNode = node;
            }
        }

        return lowestCostNode;
    }

    public void dijkstra() {
        String node = findLowestCostNode();

        while (node != null) {
            int cost = costs.get(node);
            Map<String, Integer> neighbors = graph.get(node);

            for (String neighbor : neighbors.keySet()) {
                int newCost = cost + neighbors.get(neighbor);

                if (costs.get(neighbor) > newCost) {
                    costs.put(neighbor, newCost);
                    parents.put(neighbor, node);
                }
            }

            processed.add(node);
            node = findLowestCostNode();
        }
    }

    public void printResults() {
        System.out.println("Минимальные стоимости:");
        System.out.println(costs);

        System.out.println("\nРодители:");
        System.out.println(parents);

        System.out.println("\nКратчайший путь до конечного узла:");
        printPath("fin");
    }

    private void printPath(String node) {
        if (node == null) return;
        printPath(parents.get(node));
        System.out.print(node + (node.equals("fin") ? "" : " -> "));
    }

    public static void main(String[] args) {
        DijkstraAlgorithm dijkstra = new DijkstraAlgorithm();
        dijkstra.initializeGraph();
        dijkstra.dijkstra();
        dijkstra.printResults();
    }
}