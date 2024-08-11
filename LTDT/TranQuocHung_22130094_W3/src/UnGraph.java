import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;

public class UnGraph extends Graph {

	public UnGraph() {
		super();
	}

//	Check Ungraph
	@Override
	public boolean checkUnGraph() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i == j) {
					break;
				}

				if (matrix[i][j] != matrix[j][i]) {
					System.out.println("Không phải đồ thị vô hướng.");
					return false;
				}

			}
		}
		System.out.println("Đồ thị vô hướng.");
		return true;

	}

	@Override
//sumDeg
	public int sumDeg() {
		int resutt = 0;
		for (int[] is : matrix) {
			resutt += Arrays.stream(is).sum();
		}
		return resutt;
	}

//	numEdges 
	@Override
	public int numEdges() {
		return sumDeg() / 2;
	}
	
	
	
	
	
	
	//checkConnect for ungraph
	
	@Override 
	public boolean checkConnect() {
		daTham = new boolean[matrix.length];
		daTham[0] = true;
		int count = 1;
		for (int i = 0; i < daTham.length; i++) {
			if (daTham[i]) {
				for (int j = 0; j < daTham.length; j++) {
					if (matrix[i][j] != 0 && !daTham[j]) {
						daTham[j] = true;
						count++;
					}
					if (count == matrix.length) {
						return true;
					}
				}
			}

		}
		return false;
	}

	
	
	
	
	

	@Override
	public boolean checkStrongConnect() {
		System.out.println("Đồ thị vô hướng! Không có liên thông mạnh - yếu ");
		return false;
	}

	
	
	
	
//	checkEuler
	@Override
	public void checkEuler() {
		if (checkConnect()) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (Arrays.stream(matrix[i]).mapToDouble(x -> x).sum() % 2 != 0) {
					count++;
				}

			}

			if (count == 2) {
				System.out.println("Đồ thị chỉ có đường đi");
			}

			if (count == 0) {
				System.out.println("Đồ thị có chu trình.");
			}

			else {
				System.out.println("KO có đường đi và chu trình.");
			}

		} else {
			System.out.println("Đồ thị ko liên thông, ko xét đường đi.");
		}
	}

	
	
	
//	isEulerGraph
	public boolean isEulerGraph() {
		if (checkConnect()) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (Arrays.stream(matrix[i]).mapToDouble(x -> x).sum() % 2 != 0) {
					count++;
				}
			}
			if (count == 0) {
				return true;
			} else {
				return false;
			}

		}

		return false;

	}

//	isHalfEulerGraph
	@Override
	public boolean isHalfEulerGraph() {
		if (checkConnect()) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (Arrays.stream(matrix[i]).mapToDouble(x -> x).sum() % 2 != 0) {
					count++;
				}
			}
			if (count == 2) {
				return true;
			} else {
				return false;
			}

		} else {
			return false;
		}
	}

//	findEulerCycle
	public void findEulerCycle() {
		if (checkDeg()) {
			System.out.print("Đồ thị có chu trình Euler là : ");
			int[][] subMatrix = deepCopy();

			Stack<Integer> previous = new Stack<Integer>();
//			Stack<Integer> CE = new Stack<Integer>();
			Queue<Integer> CE = new LinkedList<Integer>();
			int current = 0;
			previous.add(current);
			while (!previous.isEmpty()) {
				for (int i = 0; i < subMatrix.length; i++) {
					if (subMatrix[current][i] != 0 || subMatrix[i][current] != 0) {
						subMatrix[current][i] = 0;
						subMatrix[i][current] = 0;
						previous.add(current);
						current = i;

						break;
					}

				}
				if (!checkNext(current, subMatrix)) {
					CE.add(current);
					current = previous.pop();
				}

			}
//			System.out.print(CE.toString());
			int size = CE.size();
			for (int i = 0; i < size; i++) {
				System.out.print(" " + CE.poll());

			}

		} else {
			System.out.println("Ko có chu trình euler");
		}
	}

//	sub menthod for findEulerCycle
	private boolean checkDeg() {
		if (checkConnect()) {
			int count = 0;
			for (int i = 0; i < matrix.length; i++) {
				if (Arrays.stream(matrix[i]).mapToDouble(x -> x).sum() % 2 != 0) {
					count++;
				}
			}
			return count == 0 ? true : false;
		} else {
			return false;
		}

	}

//	findEulerPath
	@Override
	public void findEulerPath() {
		if (isEulerGraph()) {
			System.out.println("Vì có chu trình nên có đường đi Euler ");
			findEulerCycle();
		} else {

			if (isHalfEulerGraph()) {
				System.out.print("Đồ thị có đường đi Euler là : ");
				int[][] subMatrix = deepCopy();

				Stack<Integer> previous = new Stack<Integer>();
				Stack<Integer> CE = new Stack<Integer>();
				int current = 0;

				// find start peak
				for (int i = 0; i < subMatrix.length; i++) {
					if (Arrays.stream(matrix[i]).sum() % 2 != 0) {
						current = i;
						break;
					}
				}

				previous.add(current);
				while (!previous.isEmpty()) {
					for (int i = 0; i < subMatrix.length; i++) {
						if (subMatrix[current][i] != 0 || subMatrix[i][current] != 0) {
							subMatrix[current][i] = 0;
							subMatrix[i][current] = 0;
							previous.add(current);
							current = i;

							break;
						}

					}
					if (!checkNext(current, subMatrix)) {
						CE.add(current);
						current = previous.pop();
					}

				}
				System.out.print(CE.toString());

			} else {
				System.out.println("Ko có Euler");
			}
		}

	}

	
	
	
	
	
	
	
	
// SpanningTree bằng DFS + Đệ Qui
	@Override
	public int[][] SpanningTreeByDFS( int[][] matrix, int v) {
		if (checkConnect()) {
			
			int vertrex = v;
			int[][] result = new int[matrix.length][matrix.length];
			daTham = new boolean[matrix.length];
			
			daTham[vertrex] = true;
			recursive(vertrex, result, daTham);
			return result;
		}
		
		else {
			System.out.println("Đồ thị không liên thông");
			return null;
		}
	}
	
	
	
	// sub Đệ qui
	public void recursive(int vertrex, int[][] result, boolean[] datham) {
		if (vertrex > matrix.length +1 ) {
			return;
		}

		else {
			for (int i = 0; i < result.length; i++) {
				if (matrix[vertrex][i] != 0 && !datham[i]) {
					datham[i] = true;
					
					result[vertrex][i] = 1;
					result[i][vertrex] = 1;
					recursive(i, result, datham);
					System.out.println(vertrex + "-" + i);
				}

			}

		}

	
	}
	
	
	
	

	// SpanningTree bằng DFS không dùng Đệ Qui
	public int[][] SpanningTreeByDFS(int v) {
		
		if (checkConnect()) {
			
			Stack<Integer> stack = new Stack<Integer>();
			int vertrex = 0;
			int[][] result = new int[matrix.length][matrix.length];
			daTham = new boolean[matrix.length];
			
			stack.add(vertrex);
			daTham[vertrex] = true;
			
			while (!stack.isEmpty()) {
				
				vertrex = stack.pop();
				for (int i = 0; i < result.length; i++) {
					if (matrix[vertrex][i] != 0 && !daTham[i]) {
						stack.push(i);
						daTham[i] = true;
						result[vertrex][i] = 1;
						result[i][vertrex] = 1;
					}
					
				}
				
			}
			
			return result;
		}
		
		else {
			System.out.println("Đồ thị không liên thông");
			return null;
		}
		

	}

	
	
	
	
	
	// SpanningTree bằng BFS 
	@Override
	public int[][] SpanningTreeByBFS() {
		if (checkConnect()) {
			Queue<Integer> next = new LinkedList<Integer>();
			daTham = new boolean[matrix.length];
			int[][] result = new int[matrix.length][matrix.length];

			int vertrex = 0;
			next.add(vertrex);
			daTham[vertrex] = true;

			while (!next.isEmpty()) {
				vertrex = next.poll();
				for (int i = 0; i < matrix.length; i++) {
					if (matrix[vertrex][i] != 0 && !daTham[i]) {

						result[vertrex][i] = 1;
						result[i][vertrex] = 1;
						daTham[i] = true;
						next.add(i);
					}

				}

			}

			return result;
		}
		
		else {
			System.out.println("Đồ thị không liên thông");
			return null;
		}
	}

	
	
	
	
	
	
	
	
	
	//SpanningTreeByKruskal
	
	@Override
	public int[][] SpanningTreeByKruskal(int[][] matrix) {
		if (!checkConnect()) {
			System.out.println("Đồ thị ko liên thông.");
			return null;

		}

		else {
			int[][] spanningTree = new int[peak][peak];
			int countEdge = 0;
			int indexList = 0;
			int sumTree = 0;

			List<Edge> edges = new ArrayList<Graph.Edge>();

			for (int i = 0; i < matrix.length; i++) {
				for (int j = 0; j < matrix.length; j++) {
					if (matrix[i][j] != 0) {
						edges.add(new Edge(i, j, matrix[i][j]));

					}
				}
			}
			
			
			
			Collections.sort(edges, new Comparator<Edge>() {

				@Override
				public int compare(Graph.Edge o1, Graph.Edge o2) {
					return o1.w - o2.w;
				}
			});

			int[] parent = new int[matrix.length];
			for (int i = 0; i < parent.length; i++) {
				parent[i] = i;

			}

			
			
			
			while (countEdge < peak && indexList < edges.size()) {
				Edge e = edges.get(indexList);
				int u = parent[e.u];
				int v = parent[e.v];
				if (u != v) {
					countEdge++;
					spanningTree[v][u] = spanningTree[u][v] = e.w;
					System.out.printf("( %d %d) - %d \n", e.v + 1, e.u + 1, e.w);
					sumTree += e.w;
					for (int i = 0; i < parent.length; i++) {
						if (parent[i] == v) {
							parent[i] = u;

						}
					}
				}

				indexList++;

			}
			System.out.println("Trọng số cây bao trùm là : " + sumTree);
			printMatrix(spanningTree);
			return spanningTree;
		}

	}
	
	
	
	
	
	// SpanningTreeByPrim 
	
	public int[][] SpanningTreeByPrim() {
		
		if (!checkConnect()) {
			System.out.println("Đồ thị ko liên thông");
			return null;
			
		} else {
			
			System.out.println("peak " + peak);
			List<Integer> Vt = new ArrayList<Integer>();
//			int[] Vg = new int[matrix.length];
			List<Edge> next = new ArrayList<Graph.Edge>();
			List<Edge> resultEdge = new ArrayList<Graph.Edge>();
			int[][] SpanningTreeByPrim = new int[matrix.length][matrix.length];
			int countEdge = 0;
			int vertrex = 0;
			Vt.add(vertrex);

			
			
			while (countEdge < peak - 1) {

				for (int i = 0; i < matrix.length; i++) {
					if (matrix[vertrex][i] != 0 && !Vt.contains(i)) {
						next.add(new Edge(vertrex, i, matrix[vertrex][i]));
					}
				}

//				sap sep danh sach canh ke
				Collections.sort(next, new Comparator<Edge>() {

					@Override
					public int compare(Graph.Edge o1, Graph.Edge o2) {
						return o1.w - o2.w;
					}
				});

//				them canh 
				Edge edge = next.getFirst();
				if (edge.checkNotInto(Vt)) {

					resultEdge.add(edge);
					if (!Vt.contains(edge.getV())) {
						Vt.add(edge.getV());
					}
					SpanningTreeByPrim[edge.u][edge.v] = edge.w;
					vertrex = edge.v;

					System.out.printf("( %d %d) - %d \n", edge.u, edge.v, edge.w);

				}

				for (Iterator<Edge> iterator = next.iterator(); iterator.hasNext();) {
					Edge e = (Edge) iterator.next();
					if (!e.checkNotInto(Vt)) {
						iterator.remove();

					}

				}

				countEdge++;

			}
			return SpanningTreeByPrim;
		}

	}

	
	
	
	
	// Thuật toán dijsktra

	public int[] dijsktra(int[][] matrix) {
		int index = 0;
		int count = 0;

		int[] vertrex = new int[matrix.length];
		int[] len = new int[matrix.length];
		int[] pre = new int[matrix.length];

		// insert data
		for (int i = 0; i < pre.length; i++) {
			vertrex[i] = i;
			len[i] = -1;
			pre[i] = -1;
		}

		len[index] = 0;
		vertrex[index] = -1;

		while (count < matrix.length) {

			for (int j = 1; j < matrix.length; j++) {
				if (matrix[index][j] > 0 && matrix[index][j] > len[j] && vertrex[j] >= 0) {

					vertrex[index] = -1; // xoa dinh
					pre[j] = index;
					len[j] = matrix[index][j] + len[pre[j]];

				}
			}
			

			int flag = -1; // giải quyết trường hợp khi index = 0
			for (int j = 0; j < matrix.length; j++) {
				if (index != j && vertrex[j] >= 0 && pre[j] >= 0) {
					if (len[j] < len[index] || flag < 0) {
						index = j;
						flag = 1;

					}

				}

			}
			count++;

		}

		System.out.println(Arrays.toString(pre));

		return len;

	}

	
	
	
	
	// Thuật toán dijsktra từ 1 điểm
	public int[] dijsktra(int[][] matrix, int startPoint) {

		int index = startPoint;
		int count = 0;

		int[] vertrex = new int[matrix.length];
		int[] len = new int[matrix.length];
		int[] pre = new int[matrix.length];

		// insert data
		for (int i = 0; i < pre.length; i++) {
			vertrex[i] = i;
			len[i] = -1;
			pre[i] = -1;
		}

		len[index] = 0;
		vertrex[index] = -1;

		while (count < matrix.length) {

			for (int j = 0; j < matrix.length; j++) {
				if (matrix[index][j] > 0 && matrix[index][j] > len[j] && vertrex[j] >= 0) {

					vertrex[index] = -1; // xoa dinh
					pre[j] = index;
					len[j] = matrix[index][j] + len[pre[j]];

				}
			}

//			boolean flag = false;
			int flag = -1;
			for (int j = 0; j < matrix.length; j++) {
				if (index != j && vertrex[j] >= 0 && pre[j] >= 0) {
					if (len[j] < len[index] || flag < 0) {
						index = j;
						flag = 1;

					}

				}

			}
			count++;

		}

		System.out.println("Đỉnh liền trước:");
		System.out.println(Arrays.toString(pre));

		return len;
	}

	
	
	
	
	
	
	
	
	
	// Thuật toán dijsktra từ 1 điểm đến 1 điểm
	public int[] dijsktra(int[][] matrix, int startPoint, int endPoint) {

		int index = startPoint;
		int count = 0;

		int[] vertrex = new int[matrix.length];
		int[] len = new int[matrix.length];
		int[] pre = new int[matrix.length];

		// insert data
		for (int i = 0; i < pre.length; i++) {
			vertrex[i] = i;
			len[i] = -1;
			pre[i] = -1;
		}

		len[index] = 0;
		vertrex[index] = -1;

		while (count < matrix.length) {

			for (int j = 0; j < matrix.length; j++) {
				if (matrix[index][j] > 0 && matrix[index][j] > len[j] && vertrex[j] >= 0) {

					vertrex[index] = -1; // xoa dinh
					pre[j] = index;
					len[j] = matrix[index][j] + len[pre[j]];

				}
			}

			if (pre[endPoint] != -1) {
				System.out.println("Đã tìm được đường đi :");
				System.out.println(Arrays.toString(pre));
				System.out.println(Arrays.toString(len));
				return len;
			}

//			boolean flag = false;
			int flag = -1;
			for (int j = 0; j < matrix.length; j++) {
				if (index != j && vertrex[j] >= 0 && pre[j] >= 0) {
					if (len[j] < len[index] || flag < 0) {
						index = j;
						flag = 1;

					}

				}

			}
			count++;

		}

		System.out.println("Đỉnh liền trước:");
		System.out.println(Arrays.toString(pre));

		return len;
	}

	
	
	
	
	
	
	
	
// Thuật toán Floys

	public int[] floyd(int[][] matrix) {
		int infinity = Integer.MAX_VALUE;

		// reset gia tri trong matrix
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 0) {
					matrix[i][j] = infinity;
				}
			}
		}

		int x = 0;
		while (x < matrix.length) {

			for (int y = 0; y < matrix.length; y++) {
				if (matrix[x][y] != infinity && x != y) {

					for (int z = 0; z < matrix.length; z++) {
						if (matrix[z][x] != infinity && (matrix[x][y] + matrix[z][x]) < matrix[z][y] && x != z) {

							matrix[z][y] = matrix[x][y] + matrix[z][x];

						}

					}
				}

			}

			x++;

		}

		printMatrix(matrix);

		return null;
	}

	
	
	
	
	
	
	
	
	public subBellMan[] bellManFord(int v) {

		subBellMan[] result = new subBellMan[matrix.length];
		int current = v;
		int infinity = Integer.MAX_VALUE;
		int next = -1;
		int n = 0;
		daTham = new boolean[matrix.length];
		daTham[current] = true;
		

		for (int i = 0; i < result.length; i++) {
			// reset result
			result[i] = new subBellMan(infinity, -1);

			for (int j = 0; j < matrix.length; j++) {
				// reset matrix
				if (matrix[i][j] == 0) {
					matrix[i][j] = infinity;
				}
			}
		}

		while (true) {
			
			daTham[current] = true;
			subBellMan comp = new subBellMan(infinity, -1);
			
			if (n == peak - 1) {
				System.out.println("Có chu trình âm.");
				
				break;
			}

			
			
			for (int i = 0; i < matrix.length; i++) {

				if (matrix[current][i] != infinity && result[i].getW()  > matrix[current][i] ) {
					
				
					
					
					

					if (result[i].getPre() != -1 ) {
						result[i].setW( result[result[i].getPre()].getW()  + matrix[current][i]);
						result[i].setPre(current);
						
					}
					
					
					else if (result[i].getPre() == -1 && current != v ) {
						int weight =  matrix[current][i];
						int vertrex =  current;
						result[i].setW( matrix[current][i] + result[current].getW());
						result[i].setPre(current);

					}
					
					
					
					else if (result[i].getPre() == -1  ) {
						int weight =  matrix[current][i];
						int vertrex =  current;
						result[i].setW( matrix[current][i]);
						result[i].setPre(current);
						
					}
					
			
				}
			}
			
			for (int i = 0; i < result.length; i++) {
				// tìm cái nhỏ nhất và thay đổi đỉnh
				if (!daTham[i] ) {
					
					
					
					
					
					if (comp.getW() > result[i].getW()) {
						comp.setW(result[i].getW());
						comp.setPre(result[i].getPre());
						next = i;
						
					}
					
					
					
					if (comp.getW() == result[i].getW() && comp.getPre() < result[i].getPre()) {
						comp.setPre(result[i].getPre());
						next = i;
						
						
					}
					
					
				}
				
			}

			current = next;
			n++;

		}

		return result;

	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

	public static void main(String[] args) throws NumberFormatException, IOException {
		Graph graph = new UnGraph();

//		graph.loadGraph("test3.txt");
//		graph.loadGraph("luongphan.txt");
//		if (graph.loadGraph("eulerpath.txt") == true) {
		if (graph.loadGraph("gk.txt") == true) {

			graph.printMatrix();
//			System.out.println("Đồ thị có hợp lí ko ? " + graph.checkValid());
//			
//			graph.checkUnGraph();  // Kiểm tra đồ thị có hướng ko ?
//			
//			System.out.println("Tổng bậc của đỉnh đã cho là : " + graph.deg(3));
//			
//			System.out.println("Tổng bậc của đồ thị là : " + graph.sumDeg());
//			
//			System.out.println("Tổng cạnh của đồ thị : " + graph.numEdges());
//			
//			System.out.println("BFS : " + Arrays.toString(graph.BFSGraph()));
//
//			System.out.println("DFS : " + Arrays.toString(graph.DFSGraph()));
//			
//			System.out.println("BFS input vex : " + Arrays.toString(graph.BFSGraph(2)));
//			
//			System.out.println("DFS input vex : " + Arrays.toString(graph.DFSGraph(2)));
//			
//			System.out.println("checkConnect : " + graph.checkConnect());
//			
//			System.out.println("countConnect : " + graph.countConnect());
//			
//			System.out.print("Các đỉnh liên thông là 			 ");		graph.diTimCacDinhLienThong();
//			
//			System.out.print("Kiểm tra tính liên thông bằng thuật toán BFS thì ");		graph.isConnected();
//	
//			System.out.print("Đường đi từ A đến B là : ");			graph.findPathTwoVexs(3, 0);
//	
//			System.out.println("Kiểm tra tính lưỡng phân  : " + graph.checkBipartiteGraph());  
//			
//			System.out.print("Kiểm tra đồ thị có Euler không ? : ");		graph.checkEuler();
//			
//			System.out.println("Kiểm tra đồ thị có chu trình Euler không ? : " + graph.isEulerGraph() );		
//			
//			System.out.println("Kiểm tra đồ thị có dường đi Euler không ? : " + graph.isEulerGraph() );		
//			 
//			graph.findEulerCycle(); // Tìm chu trình Euler
//			graph.printMatrix();
//			
//			graph.findEulerPath(); // Tìm đường đi Euler
//			
//			System.out.println("Kiểm tra lưỡng phần bằng BFS: " + graph.checkBipartiteGraphWithBFS());
//			
//			System.out.println("Đường đi Hamilton:  " );
//			graph.findHamiltionCycle();
//			
//			graph.color();
//
//			System.out.println("===================Cây bao trùm duyệt theo chiều rộng BFS=========================================" );
//			graph.printMatrix(graph.SpanningTreeByBFS());
//			
//			
			System.out.println("\n\n===================Cây bao trùm duyệt theo chiều sâu DFS sử dụng đệ qui =========================================" );
			graph.printMatrix(graph.SpanningTreeByDFS(graph.matrix, 0));
			
			
			
//			System.out.println("\n\n===================Cây bao trùm duyệt theo chiều sâu DFS KHÔNG sử dụng đệ qui =========================================" );
//			graph.printMatrix(graph.SpanningTreeByDFS(0));

//			System.out.println("\n\n=================== Đường đi ngắn nhất bằng Kruskal =========================================" );
//			graph.SpanningTreeByKruskal(graph.matrix);

//			System.out.println("\n\n=================== Đường đi ngắn nhất bằng Prim =========================================" );

//			graph.SpanningTreeByPrim()	;

//			System.out.println("\n\n=================== Đường đi ngắn nhất bằng Dijsktra =========================================" );
//			System.out.println(Arrays.toString(graph.dijsktra(graph.matrix)));
//			
//			System.out.println("\n\n=================== Đường đi ngắn nhất bằng Dijsktra từ 1 điểm cho trước =========================================" );
//			System.out.println(Arrays.toString(  graph.dijsktra(graph.matrix, 1)));
//			
//			System.out.println("\n\n=================== Đường đi ngắn nhất bằng Dijsktra từ 1 điểm cho trước đến 1 điểm =========================================" );
//			System.out.println(Arrays.toString(  graph.dijsktra(graph.matrix, 1, 3)));

//			System.out.println(
//					"\n\n=================== Đường đi ngắn nhất bằng Floyd =========================================");
//			graph.floyd(graph.matrix);

//			System.out.println(
//					"\n\n=================== Đường đi ngắn nhất bằng BellMan =========================================");
//			System.out.println(Arrays.toString(graph.bellManFord(0)));

		}

	}

}
