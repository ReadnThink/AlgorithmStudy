package week7;


import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

// DFS는 Stack으로 구현한다.
// DFS Reculsive는 호출을 하면 출력을 먼저 합니다. //Reculsive는 stack에 위에서부터 출력하기 때문
class Graph {
    class Node{
        int data;
        LinkedList<Node> adjacent;
        boolean marked;
        Node(int data) { //생성자에서 data, marked adjacent 초기화
            this.data = data;
            this.marked = false;
            adjacent = new LinkedList<Node>();
        }
    }
    Node[] nodes;
    Graph(int size) {
        nodes = new Node[size];
        for (int i = 0; i < size; i++) {
            nodes[i] = new Node(i); // 0 ~ size - 1까지 들어간다.
        }
    }
    //두 노드의 관계를 정의하는 함수
    void addEdge(int i1, int i2) {//데이터가 인덱스와 같으니 받은 숫자를 인덱스로 사용 할 수 있다.
        Node n1 = nodes[i1]; //객체의 주소를 꺼내기 때문에 값을 여기서 저장해도 nodes전체가 바뀐다.
        Node n2 = nodes[i2];
        if (!n1.adjacent.contains(i1)) {
            n1.adjacent.add(n2);
        }
        if (!n2.adjacent.contains(n1)) {
            n2.adjacent.add(n1);
        }
    }

    void dfs() {
        dfs(0);
    }

    void dfs(int index) {
        Node root = nodes[index]; //받은 index를 꺼낸다. nodes는 0 ~ n-1까지 선언해 놓았음 //marked = false로 초기화
        Stack<Node> stack = new Stack<Node>();
        stack.push(root);
        root.marked = true;
        while (!stack.isEmpty()) { //스택에 데이터가 없을때까지 반복
            Node r = stack.pop(); // 스택에서 데이터를 하나 가져오고
            for (Node n : r.adjacent) {
                if (n.marked == false) { //그 스택이 방문하지 않았다면
                    n.marked = true; //방문표시하고
                    stack.push(n); // 스택에 넣는다.
                }
            }
            visit(r);
        }
    }

    void dfsR(Node r){ //링크드리스트가 노드의 주소를 가지고 있다.
        if(r == null) return;
        r.marked = true;
        visit(r); //자식 호출 전 데이터를 먼저 출력한다.
        for (Node n : r.adjacent) {
            if (n.marked == false) { //호출이 안된 자식들을 호출한다.
                dfsR(n);
            }
        }
    }

    void dfsR(int index) { //배열방의 인덱스를 받는 형태로도 구현해보기
        Node r = nodes[index]; //인덱스를 받으면 노드를 찾아서 해당노드를 시작으로 재귀호출을 진행
        dfsR(r);
    }
    void dfsR(){ //아무것도 넘기지 않았을때는 0부터 시작한다.
        dfsR(0);
    }

    void visit(Node n) {
        System.out.print(n.data + " ");
    }
}
/*
    0
  /
 1 -- 3    7
 |   /| \ /
 |  / |  5
 2 -- 4   \
           6 -- 8
DFS()
0 1 3 5 7 6 8 4 2
DFS(3)
3 5 7 6 8 4 2 1 0
DFS() - Recursive
0 1 2 4 3 5 6 8 7
DFS(3) - Recursive
3 1 0 2 4 5 6 8 7
 */
public class GraphDfs {
    public static void main(String[] args) {
        Graph g = new Graph(9);
        g.addEdge(0,1);
        g.addEdge(1,2);
        g.addEdge(1,3);
        g.addEdge(2,4);
        g.addEdge(2,3);
        g.addEdge(3,4);
        g.addEdge(3,5);
        g.addEdge(5,6);
        g.addEdge(5,7);
        g.addEdge(6,8);
        g.dfs(); //아무것도 안넣으면 0부터시작
//        g.dfs(3); //아무것도 안넣으면 0부터시작
//        g.dfsR();//아무것도 안넣으면 0부터시작
//        g.dfsR(3);
    }
}
