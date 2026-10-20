// LC 133. Clone Graph
// https://leetcode.com/problems/clone-graph/

import java.util.List;
import java.util.ArrayList;

class CloneGraph {
    public GraphNode cloneGraph(GraphNode node) {
        // your code here
    }
}

class GraphNode {
    public int val;
    public List<GraphNode> neighbors;
    public GraphNode() { val = 0; neighbors = new ArrayList<>(); }
    public GraphNode(int val) { this.val = val; neighbors = new ArrayList<>(); }
    public GraphNode(int val, ArrayList<GraphNode> neighbors) { this.val = val; this.neighbors = neighbors; }
}
