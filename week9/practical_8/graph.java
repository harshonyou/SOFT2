import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;
import java.util.Stack;

public class graph {

    int capacity;
    LinkedList<LinkedList<Integer>> list;

    graph() {
        this.capacity = 0;
        this.list = new LinkedList<LinkedList<Integer>>();
    }

    graph(int capacity) {
        this.capacity = capacity;
        this.list = new LinkedList<LinkedList<Integer>>();
    }

    Set<Integer> getVertices() {
        Set<Integer> temp = new HashSet<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            temp.add(this.list.get(i).getFirst());
        }
        return temp;
    }

    Set<HashSet<Integer>> getEdges() {
        Set<HashSet<Integer>> temp = new HashSet<HashSet<Integer>>();
        HashSet<Integer> combination;
        for (int i = 0; i < this.list.size(); i++) {
            // temp.add(list.get(i).getFirst());
            for (int j = 1; j < this.list.get(i).size(); j++) {
                combination = new HashSet<Integer>();
                combination.add(this.list.get(i).getFirst());
                combination.add(this.list.get(i).get(j));
                temp.add(combination);
            }
        }
        return temp;
    }

    boolean containsVertex(int vertex) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getFirst() == vertex)
                return true;
        }
        return false;
    }

    boolean addVertex(int vertex) {
        if (this.containsVertex(vertex))
            return false;
        LinkedList<Integer> temp = new LinkedList<Integer>();
        temp.addFirst(vertex);
        this.list.addLast(temp);
        return true;
    }

    String dFS() {

        Stack<Integer> storage = new Stack<Integer>();
        Set<Integer> visited = new HashSet<Integer>();
        ArrayList<Integer> vertexes;
        storage.push(this.list.getFirst().getFirst());
        int counter = 0;
        int tempO = 0, tempI = 0;
        while (!storage.empty()) {
            System.out.println("____");
            System.out.println(storage);
            visited.add(storage.lastElement());
            vertexes = getVertexes(storage.lastElement());
            for (Integer i : vertexes) {
                tempO++;
                if (!visited.contains(i)) {
                    storage.push(i);
                    tempI++;
                }
            }
            System.out.println(tempI);
            if (tempI == 0) {
                storage.pop();
            }
            tempI = 0;
            // storage.pop();
            System.out.println("----");
            if (counter++ > 10) {
                return visited.toString();
            }
        }
        return visited.toString();
    }

    boolean addEdge(int source, int target) {
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getFirst() == source) {
                this.list.get(i).addLast(target);
                return true;
            }
        }
        return false;
    }

    void test() {
        System.out.println("__STARTS__");
        // int temp = 5;
        String[] temp = new String[this.list.size()];
        System.out.println(recu(5, temp));
        System.out.println(getVertexes(5));
    }

    ArrayList<Integer> getVertexes(int target) {
        ArrayList<Integer> vertexes = new ArrayList<Integer>();
        for (int i = 0; i < this.list.size(); i++) {
            if (this.list.get(i).getFirst() == target) {
                for (int j = 1; j < this.list.get(i).size(); j++) {
                    vertexes.add(this.list.get(i).get(j));
                }
            }
        }
        return vertexes;
    }

    String recu(int i, String[] visited) {
        if (i > 0) {
            return "yes" + recu(--i, visited);
        }
        return "";
    }

    public static void main(String[] args) {
        graph test = new graph();
        // test.addVertex(5);
        // test.addEdge(5, 10);
        // test.addVertex(69);
        // test.addEdge(5, 110);
        // System.out.println(test.containsVertex(69));
        // System.out.println(test.list);
        // System.out.println(test.getEdges());

        test.addVertex(1);
        test.addVertex(2);
        test.addVertex(3);
        test.addVertex(4);
        test.addVertex(5);
        test.addVertex(6);
        test.addVertex(7);
        test.addVertex(8);
        test.addVertex(9);

        test.addEdge(1, 2);
        test.addEdge(2, 3);
        test.addEdge(2, 1);
        test.addEdge(3, 4);
        test.addEdge(3, 2);
        test.addEdge(3, 5);
        test.addEdge(4, 6);
        test.addEdge(4, 3);
        test.addEdge(4, 7);
        test.addEdge(4, 8);
        test.addEdge(5, 7);
        test.addEdge(5, 3);
        test.addEdge(5, 9);
        test.addEdge(7, 4);
        test.addEdge(7, 5);
        test.addEdge(8, 4);
        test.addEdge(8, 9);
        test.addEdge(9, 8);
        test.addEdge(9, 5);

        // System.out.println(test.getVertexes(4));
        System.out.println(test.dFS());
        // test.test();
    }
}