import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Stack;
		
 

public class DeGraph extends Graph{

	public DeGraph() {
		super();
	}
	
//	checkUnGraph
	public boolean checkUnGraph() {
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (i==j ) {
					break;
				}
			
				if (matrix[i][j] == matrix[j][i] &&  matrix[j][i] != 0) {
					System.out.println("Không phải đồ thị có hướng.");
					return false;
				}
				
			
			}
		}
		System.out.println("Đồ thị có hướng.");
		return true;
		
	}

	
	
//	sumDeg
	@Override
	public int sumDeg() {
		int vertices = matrix.length;
        int totalDegree = 0;

        for (int i = 0; i < vertices; i++) {
            int inDegree = 0;
            int outDegree = 0;
 
            for (int j = 0; j < vertices; j++) {
                inDegree += matrix[j][i]; // In-degree
                outDegree += matrix[i][j]; // Out-degree
            }

            totalDegree += inDegree + outDegree;
        }

        return totalDegree;
	}
	
	
	
	
//	numEdges
	@Override
	public int numEdges() {
		return sumDeg()/2;
	}
	
	
	
//	checkConnect for degraph
	
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

	
	
	
	
	
	
	
	
// checkStrongConnect

	@Override
	public boolean checkStrongConnect() {
		if (checkConnect()) {

			for (int i = 0; i < matrix.length; i++) {
				int inDegree = 0;
				int outDegree = 0;
				for (int j = 0; j < matrix.length; j++) {
					inDegree += matrix[i][j];
					outDegree += matrix[j][i];

				}
				if (inDegree != outDegree) {
					System.out.println("Đồ thị liên thông yếu!");
					return false;
				}

			}
			System.out.println("Đồ thị liên thông mạnh!");
			return true;

		}
		else {
			throw new IllegalArgumentException("Ko phải là đồ thị vô hướng, Không xét được tính mạnh yếu.");
		}
		
		
	}
	
	


	
	
	//checkEuler
	
	@Override
	public void checkEuler() {
		if (checkConnect()) {
			System.out.println("Đồ thị liên thông, tiếp tục check Euler....");
			int inDegree = 0;
			int outDegree = 0;
			for (int i = 0; i < matrix.length; i++) {
				
				for (int j = 0; j < matrix.length; j++) {
					inDegree += matrix[i][j];
					outDegree += matrix[j][i];

				}
				if (inDegree != outDegree) {
					System.out.println("Đồ thị liên thông yếu!");
					break;
				}

			}
			if (inDegree == outDegree) {
			System.out.println("Đồ thị liên thông mạnh!");
			}
		}
		else {
			throw new IllegalArgumentException("Đồ thị không liên thông, Không có Euler ,ko xét được tính mạnh yếu.");
		}
		
		
	}

	
	
	
	
	
//	isEulerGraph
	@Override
	public boolean isEulerGraph() {
		if (checkStrongConnect()) {
			return true;
		}
		
		else {
			return false;
		}
	}
	


	
	
	
	
	
	
//	isHalfEulerGraph
	@Override
	public boolean isHalfEulerGraph() {
		if (isEulerGraph()) {
			return true;
		}
		
		if (!checkStrongConnect()) {
			return true;
		}
		
		else {
			return false;
		}
	}

	
	
	
	
	
	
	
//	findEulerCycle
	@Override
	public void findEulerCycle() {
		if (isEulerGraph()) {
			System.out.print( "Đồ thị có chu trình Euler là : ");
			int[][] subMatrix = deepCopy();

			Stack<Integer> previous = new Stack<Integer>();
			Stack<Integer> CE = new Stack<Integer>();
//			Queue<Integer> CE = new LinkedList<Integer>();
			int current = 0;
			previous.add(current);
			while (!previous.isEmpty()) {
				for (int i = 0; i < subMatrix.length; i++) {
					if (subMatrix[current][i] != 0 ) {
						subMatrix[current][i] = 0;
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
			int size = CE.size();
			for (int i = 0; i <size; i++) {
				System.out.print( " "+CE.pop());
				
			}
		}
		else {
			System.out.println("Không có chu trình Euler ");
		}
		
	}

	
//	findEulerPath
	@Override
	public void findEulerPath() {
		if (isEulerGraph()) {
			System.out.println("Vì có chu trình Euler nên có đường đi Euler.");
			findEulerCycle();
		}
		else {
			if (isHalfEulerGraph()) {
				System.out.print( "Đồ thị có đường đi Euler là : ");
				int[][] subMatrix = deepCopy();
				int current = 0;
				Stack<Integer> previous = new Stack<Integer>();
				Stack<Integer> CE = new Stack<Integer>();
//				Queue<Integer> CE = new LinkedList<Integer>();
				
//				Tìm đỉnh deg- != deg+
				for (int i = 0; i < subMatrix.length; i++) {
					int inDegree = 0;
					int outDegree = 0;
					for (int j = 0; j < subMatrix.length; j++) {
						inDegree += matrix[i][j];
						outDegree += matrix[j][i];
						
					}
					if (inDegree != outDegree  && inDegree>outDegree) {
						current = i;
						break;
					}
					
				}
				
				
				previous.add(current);
				while (!previous.isEmpty()) {
					for (int i = 0; i < subMatrix.length; i++) {
						if (subMatrix[current][i] != 0 ) {
							subMatrix[current][i] = 0;
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
				int size = CE.size();
				for (int i = 0; i <size; i++) {
					System.out.print( " "+CE.pop());
					
				}
				
			}
		}
		
	}

	
	
	
	
	
	
	
	
	// SpanningTree bằng DFS + Đệ Qui
		@Override
		public int[][] SpanningTreeByDFS() {

			int vertrex = 0;
			int[][] result = new int[matrix.length][matrix.length];
			daTham = new boolean[matrix.length];

			daTham[vertrex] = true;
			recursive(vertrex, result, daTham);
			return result;
		}
		
		
		
		// sub Đệ qui
		public void recursive(int vertrex, int[][] result, boolean[] datham) {
			if (vertrex > matrix.length) {
				return;
			}

			else {
				for (int i = 0; i < result.length; i++) {
					if (matrix[vertrex][i] != 0 && !datham[i]) {
						datham[i] = true;
						result[vertrex][i] = 1;
						
						recursive(i, result, datham);
					}

				}

			}

		}
		
		
		
		

		// SpanningTree bằng DFS không dùng Đệ Qui
		public int[][] SpanningTreeByDFS(int v) {

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
					}

				}

			}

			return result;

		}

		
		
		
		
		
		// SpanningTree bằng BFS 
		@Override
		public int[][] SpanningTreeByBFS() {
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
					
						daTham[i] = true;
						next.add(i);
					}

				}

			}

			return result;
		}

	
	
	
	
	
	
	
	
	
	
	//    SpanningTreeByKruskal
		
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
	 

	
	
	



	@Override
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

	
	
	
	
	
	// dijsktra
	
	@Override
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
	@Override
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

//				boolean flag = false;
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

	
	
	
	
	
	
	//    floyd

	@Override
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

	
	
	
	
	
	
	@Override
	public subBellMan[] bellManFord(int v) {
		// TODO Auto-generated method stub
		return null;
	}

	
	}
