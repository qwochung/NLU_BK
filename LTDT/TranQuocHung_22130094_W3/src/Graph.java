import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;
import java.util.Stack;
import java.util.TreeMap;

public abstract class Graph {
	int peak;
	protected int[][] matrix;
	boolean[] daTham;

//	Viết phương thức đọc ma trận kề từ một filetest.txt
	public boolean loadGraph(String pathFile) throws NumberFormatException, IOException {
		FileReader file = new FileReader(pathFile);
		try (BufferedReader bufferedReader = new BufferedReader(file)) {
			peak = Integer.valueOf(bufferedReader.readLine());
			System.out.println(peak);

			matrix = new int[peak][peak];
			int pos = 0;

			while (bufferedReader.ready()) {
				String[] line = bufferedReader.readLine().split(" ");
				int j = 0;
				for (String c : line) {
					matrix[pos][j++] = Integer.valueOf(c);
				}
				pos++;

			}
		}

		return true;

	}

	
	
	
	
//	Viết phương thức in ra ma trên kề của đồ thị
	public void printMatrix(int[][] inMatrix) {
		for (int i = 0; i < inMatrix.length; i++) {
			System.out.println();
			for (int j = 0; j < inMatrix[i].length; j++) {
				System.out.print(inMatrix[i][j] + " ");
			}
		}

	}


	public void printMatrix() {
		for (int i = 0; i < matrix.length; i++) {
			System.out.println();
			for (int j = 0; j < matrix[i].length; j++) {
				System.out.print(matrix[i][j] + " ");
			}
		}
		System.out.println();
	}
	
	
	
	
	
	

//	Viết phương thức kiểm tra đồ thị có hợp lý không (có hướng hoặc vô hướng)

	public boolean checkValid() {
		for (int i = 0; i < matrix.length; i++) {
			if (matrix[i][i] != 0) {
				return false;
			}
		}

		return true;
	}

	
	
	
	
	
//		Viết phương thức kiểm tra đồ thị có phải là  đồ thị vô hướng hay không
	public abstract boolean checkUnGraph();
	
	
	
	
	

//		Viết phương thức thêm một cạnh vào đồ thị

	public void addEdge(int[][] matrix, int v1, int v2) {
		matrix[v1][v2] = 1;
		matrix[v2][v1] = 1;
	}
	
	
	
	
	
	
	

//		Viết phương thức xóa một cạnh vào đồ thị

	public void removeEdge(int[][] matrix, int v1, int v2) {
		if (v1 > matrix.length || v2 > matrix.length) {
			System.out.println("Sai cạnh");
		} else {
			matrix[v1][v2] = 0;
			matrix[v2][v1] = 0;
		}

	}
	
	
	
	
	

//		Viết phương tính tổng bậc của mỗi đỉnh
	public int deg(int v) {
		return Arrays.stream(matrix[v - 1]).sum();
	}

//	Viết phương tính tổng bậc của đồ thị
	public abstract int sumDeg();

//	Câu 10: (1) Viết phương tính tổng số cạnh của đồ thị
	public abstract int numEdges();

//	Câu 11: (1) Viết phương thức kiểm tra đồ thị có liên thông hay không
	public abstract boolean checkConnect(); 
	
	
// Kiểm tra tính liên thông của đồ thị có hướng ( Mạnh - Yếu )
	public abstract boolean checkStrongConnect();
	
	
//	check Connect For DeGraph  => CÓ KHẢ NĂNG SAI
	public boolean checkConnectForDeGraph() {
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
					return true;
				}

			}
			System.out.println("Đồ thị liên thông mạnh!");
			return true;

		}
		return false;
	}
	
	
	
	
	
	
	
	


//	checkConnect từ 1 đỉnh cho trước
	
	public boolean checkConnect(int startVex) {
		daTham = new boolean[matrix.length];
		daTham[startVex] = true;
		int count = 1;
		for (int i = startVex; i < daTham.length; i++) {
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

	
	
	
	
	
//	Tính số thành phần liên thông
	public int countConnect() {
		int count = 0;
		daTham = new boolean[matrix.length];
		for (int i = 0; i < daTham.length; i++) {
			if (!daTham[i]) {
				count++;
				checkConnect(i);
			}

		}

		return count;
	}

	
	
	
	
	
	
//	Câu 12: (2) Viết phương thức xét tính liên thông của đồ thị: số thành phần liên thông, liệt kê các
//	đỉnh thuộc từng thành phần liên thông nếu có?
	public void diTimCacDinhLienThong() {
		Map<Integer, List<Integer> > resultMap = new TreeMap<Integer, List<Integer>>();
		int count = 0;

		daTham = new boolean[matrix.length];
		for (int i = 0; i < daTham.length; i++) {
			if (!daTham[i]) {
				count++;
				checkConnect(i);
			}
			List<Integer> list = new ArrayList<Integer>();
			List<Integer> subList = new ArrayList<Integer>();
			for (int j = 0; j < daTham.length; j++) {
				if (!list.contains(j) && daTham[j]) {
					subList.add(j);
				}

				else if (daTham[j]) {
					list.add(j);
				}
			}
			resultMap.put(count, new ArrayList<>(subList));
			subList.clear();

		}

		for (Map.Entry<Integer, List<Integer>> entry : resultMap.entrySet()) {
			System.out.print(entry.getKey() + " : ");
			System.out.println(entry.getValue());

		}

		return;
	}

	
	
	
	
	
	
	
//	Câu 13: (2) Viết phương thức dùng giải thuật BFS duyệt đồ thị G,
	public int[] BFSGraph() {
			
		Queue<Integer> open = new LinkedList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		
		
		if (checkConnect()) {
		open.add(0);
		while (!open.isEmpty()) {
			int current = open.poll();
			for (int i = 0; i < matrix.length; i++) {
				if (!close.contains(current)) {
					close.add(current);
				}
				if ((matrix[current][i] != 0 || matrix[i][current] != 0) && !close.contains(i)) {

					next.add(i);
				}

			}
			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);

				}
			});

			next.clear();
		}

//		return close.stream().mapToInt(x -> x).toArray();
		return close.stream().mapToInt(Integer::intValue).toArray();
		
		}
		
		else {
			return null;
		}


	}
	
	

	public int[] BFSGraph(int startVex) {
		Queue<Integer> open = new LinkedList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();

		open.add(startVex);
		while (!open.isEmpty()) {
			int current = open.poll();
			for (int i = 0; i < matrix.length; i++) {
				if (!close.contains(current)) {
					close.add(current);
				}
				if ((matrix[current][i] != 0 || matrix[i][current] != 0) && !close.contains(i)) {

					next.add(i);
				}

			}
			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);

				}
			});

			next.clear();
		}

		return close.stream().mapToInt(x -> x).toArray();

	}

	
	
	
	
	
//	Câu 14: (2) Viết phương thức dùng giải thuật DFS duyệt đồ thị G,
	public int[] DFSGraph() {

		Stack<Integer> open = new Stack<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		open.add(0);
		while (!open.isEmpty()) {
			int current = open.pop();
			for (int i = 0; i < matrix.length; i++) {
				if (!close.contains(current)) {
					close.add(current);
				}
				if ((matrix[current][i] != 0 || matrix[i][current] != 0) && !close.contains(i)) {

					next.add(i);
				}

			}
			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);

				}
			});

			next.clear();
		}

//		return close.stream().mapToInt(x -> x).toArray();
		return close.stream().mapToInt(Integer::intValue).toArray();
	}

	public int[] DFSGraph(int startVex) {
		Stack<Integer> open = new Stack<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		open.add(startVex);
		while (!open.isEmpty()) {
			int current = open.pop();
			for (int i = 0; i < matrix.length; i++) {
				if (!close.contains(current)) {
					close.add(current);
				}
				if ((matrix[current][i] != 0 || matrix[i][current] != 0)) {

					next.add(i);
				}

			}
			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);

				}
			});

			next.clear();
		}
//		return close.stream().mapToInt(x -> x).toArray();
		return close.stream().mapToInt(Integer::intValue).toArray();
	}

	
	
	
	
	
	
//	Câu 15: (2) Viết phương thức kiểm tra đồ thị có liên thông hay không bằng cách sử dụng thuật
//	toán duyêt theo chiều rộng hoặc duyệt theo chiều sâu?
	public boolean isConnected() {
		Queue<Integer> open = new LinkedList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		daTham = new boolean[matrix.length];
		open.add(0);

		while (!open.isEmpty()) {
			int current = open.poll();

			if (!close.contains(current)) {
				close.add(current);

			}

			for (int i = 0; i < matrix.length; i++) {

				if (matrix[current][i] != 0 || matrix[i][current] != 0) {
					next.add(i);
				}

			}

			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);
				}
			});
			next.clear();
		}

		if (close.size() != matrix.length) {
			System.out.println("Đồ thị ko liên thông!");
		} else {
			System.out.println("Đồ thị liên thông!");
		}

		return false;

	}

	
	
	
	
	
	
//	Câu 16: (2) Viết phương thức tìm đường đi giữa 2 đỉnh từ s tới t bằng cách sử dụng thuật toán
//	duyêt theo chiều rộng hoặc duyệt theo chiều sâu?
	public void findPathTwoVexs(int s, int t) {
		Queue<Integer> open = new LinkedList<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		daTham = new boolean[matrix.length];
		open.add(s);

		while (!open.isEmpty()) {
			int current = open.poll();

			if (!close.contains(current)) {
				close.add(current);
				
				if (current == t) {
					break;
				}
			}

			for (int i = 0; i < matrix.length; i++) {

				if (matrix[current][i] != 0 || matrix[i][current] != 0) {
					next.add(i);
				}

			}

			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);
				}
			});
			next.clear();
		}

		System.out.println(close.toString());

	}

	
	
	
	
	
	
	
//	Câu 17: (2) Viết phương thức kiểm tra đồ thị có LƯỠNG PHÂN hay không bằng cách sử dụng
//	thuật toán duyêt theo chiều rộng hoặc duyệt theo chiều sâu để tô màu cho 2 đỉnh có tạo cạnh
//	với nhau?

	/*
	 * Hướng dẫn : - Chọn x là đỉnh bắt đầu xét - X là tập hợp các đỉnh đang xét ->
	 * thêm x vào X
	 * 
	 * - Y là tập hợp các đỉnh kề của X - Nếu X giao Y khác rỗng thì ko phải là
	 * lưỡng phân -> return false - T là tập hợp các đỉnh kề của Y
	 * 
	 * - Nếu T giao với Y khác rỗng thì ko phải là lưỡng phân -> return false - Nếu
	 * X == T thì kết luận là lưỡng phân -> return True - Ngược lại gán X = T, sau
	 * đó reset lại Y và T, quay lại ở bước tìm Y
	 */

	public boolean checkBipartiteGraph() {
		List<Integer> X = new ArrayList<Integer>();
		List<Integer> Y = new ArrayList<Integer>();
		List<Integer> T = new ArrayList<Integer>();

		X.add(0);
		return subcheckBipartiteGraph(X, Y, T);
	}

	private boolean subcheckBipartiteGraph(List<Integer> X, List<Integer> Y, List<Integer> T) {
		Y = getAdjacentVertices(X);

		if (hasIntersection(Y, X)) {
			return false;
		}

		else {
			T = getAdjacentVertices(Y);
			if (hasIntersection(T, Y)) {
				return false;
			}
			if (hasIntersection(T, X) && (T.size() == X.size())) {
				return true;
			}

			else {
				X = new ArrayList<Integer>(T);
				T.clear();
				Y.clear();
				return subcheckBipartiteGraph(X, Y, T);

			}
		}

	}

	
	// SUB Kiểm tra 2 tập hợp có giao nhau hay ko ? 
	private boolean hasIntersection(List<Integer> list1, List<Integer> list2) {
		Set<Integer> set1 = new HashSet<>();
		Set<Integer> set2 = new HashSet<>();

		for (int num : list1) {
			set1.add(num);
		}
		for (int num : list2) {
			set2.add(num);
		}

		// Kiểm tra xem có phần tử nào chung không bằng phương thức retainAll()
		set1.retainAll(set2);

		// Nếu tập hợp sau khi giao không rỗng, có nghĩa là có giao nhau
		return !set1.isEmpty();
	}



	
	// SUB Lấy tất cả các đỉnh kề của 1 danh sách input
	private List<Integer> getAdjacentVertices(List<Integer> input) {
		List<Integer> result = new ArrayList<Integer>();

		for (Integer integer : input) {
			for (int i = 0; i < matrix.length; i++) {
				if ((matrix[integer][i] != 0 || matrix[i][integer] != 0) && (!result.contains(i))) {
					result.add(i);

				}
			}
		}

		return result;
	}

	
	
	
	
	
	
	
	
//	Câu 18: (3) Viết phương thức kiểm tra đồ thị G có chu trình Euler hay không?
	public abstract void checkEuler();

	
	
// Kiểm tra đồ thị có chu trình Euler không
	public abstract boolean isEulerGraph();

	
	
//Câu 19: (3) Viết phương thức kiểm tra đồ thị G có đường đi Euler hay không?
	public abstract boolean isHalfEulerGraph();

	
	
//Câu 20: (3) Viết phương thức tìm chu trình Euler của đồ thị G?

	public abstract void findEulerCycle();

	// deep copy matrix
	protected int[][] deepCopy() {
		int[][] result = new int[matrix.length][];
		for (int i = 0; i < matrix.length; i++) {
			result[i] = matrix[i].clone();
		}
		return result;
	}

	
	
	
//	sub menthod for findEulerCycle
	public boolean checkNext(int i, int[][] maxtrix) {

		for (int j = 0; j < maxtrix.length; j++) {
			if (maxtrix[i][j] != 0) {
				return true;
			}
		}
		return false;
	}
	
	
	
	

//Câu 21: (3) Viết phương thức tìm đường đi Euler của đồ thị G?
	public abstract void findEulerPath();

	
	
	
// Câu 22: (4) Áp dụng thuật toán BFS/DFS để kiểm tra đồ thị LIÊN THÔNG LƯỠNG PHÂN
	public boolean checkBipartiteGraphWithBFS() {
		Stack<Integer> open = new Stack<Integer>();
		List<Integer> close = new ArrayList<Integer>();
		List<Integer> next = new ArrayList<Integer>();
		daTham = new boolean[matrix.length];
		open.add(0);
		daTham[0] = true;
		while (!open.isEmpty()) {
			int current = open.pop();
			for (int i = 0; i < matrix.length; i++) {
				if (!close.contains(current)) {
					close.add(current);
				}
				if ((matrix[current][i] != 0 || matrix[i][current] != 0) && !close.contains(i)) {

					next.add(i);
				}

			}
			Collections.sort(next);
			next.forEach(x -> {
				if (!close.contains(x)) {
					open.add(x);
					daTham[x] = true;

				}
			});

			next.clear();
		}

		for (boolean bo : daTham) {
			if (!bo) {
				return false;
			}
		}

		return true;
	}

	
	
	
	
	
//	Câu 23: (4) Viết phương thức tìm chu trình Hamilton của đồ thị G?
	public void findHamiltionCycle() {
		if (!checkConnect()) {
			System.out.println("Đồ thị ko liên thông");

		} else {
			int path[] = new int[matrix.length + 1];
			daTham = new boolean[matrix.length];
			path[0] = 0;
			daTham[0] = true;
			expand(1, path);
		}
	}
	
	

	protected void expand(int i, int[] path) {
		for (int j = 0; j < daTham.length; j++) {
			if (daTham[j] == false && matrix[path[i - 1]][j] > 0) {
				path[i] = j;

				if (i < matrix.length) {
					daTham[j] = true;
					expand(i + 1, path);
					daTham[j] = false;
				}
			}

			else {
				if (matrix[path[i]][0] > 0) {
					System.out.println(Arrays.toString(path));
				}
			}

		}
	};

	
	
	
	
//	Câu 24: (4) Hiện thực thuật toán tô màu đồ thị cho G, sao cho số lượng màu là ít nhất
//			và 2 đỉnh kề nhau ko cùng màu.
	public void color() {
		List<Integer> vertrex = new ArrayList<Integer>();
		Integer[] color = new Integer[matrix.length];
		int countColor = 0;
		
		// reset color[]
		for (int i = 0; i < matrix.length; i++) {
			vertrex.add(i);
			color[i] = -1;

		}

		
		vertrex.sort(new Comparator<Integer>() {
			@Override
			public int compare(Integer a, Integer b) {
				return deg(a + 1) - deg(b + 1);
			}
		});

		vertrex.reversed();

		while (!vertrex.isEmpty()) {
			countColor++;
			int v = vertrex.getFirst();
			vertrex.remove((Integer) v);
			color[v] = countColor;
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[v][j] == 0 && (v != j)) {
					color[j] = countColor;
					vertrex.remove((Integer) j);
				}
			}

		}
		System.out.println("Số màu sử dụng là : " + countColor);
		System.out.println("Các đỉnh tô màu như sau :" + Arrays.toString(color));

	}
	
	
	
	
	

//		Câu 26: (5) Viết phương thức duyệt cây bao trùm bằng thuật toán duyệt theo chiều sâu DFS đệ quy?
	public abstract int[][] SpanningTreeByDFS(  int[][] matrix, int v);

	
	
	
//		Câu 27: (5) Viết phương thức duyệt cây bao trùm bằng thuật toán duyệt theo chiều sâu DFS khử đệ quy?
	public abstract int[][] SpanningTreeByDFS(int v);

	
	
//		Câu 28: (5) Viết phương thức duyệt cây bao trùm bằng thuật toán duyệt theo chiều rộng BFS?
	public abstract int[][] SpanningTreeByBFS();

	
	

	
	
	
	
	

//		Câu 30: (6) Viết phương thức tìm cây bao trùm có trọng số nhỏ nhất bằng thuật toán Kruskal?
	public abstract int[][] SpanningTreeByKruskal(int[][] matrix);

//		Câu 31: (6) Viết phương thức tìm cây bao trùm có trọng số nhỏ nhất bằng thuật toán Prim?
	public abstract int[][] SpanningTreeByPrim();

//		Kiểm tra xem có chu trình con ko. Hỗ trợ cho Kruskal
	public boolean checkCycel() {

		return false;
	}

// 		Thuật toán Dijsktra
	public abstract int[] dijsktra(int[][] matrix);

	public abstract int[] dijsktra(int[][] matrix, int startpoint);

	public abstract int[] dijsktra(int[][] matrix, int startpoint, int endPoint);

// Thuật toán Floy
	public abstract int[] floyd(int[][] matrix);

// Thuật toán Bellman-Ford
	public abstract subBellMan[]  bellManFord( int v) ;

	
	
	
	
	
	
	// Inner class
	class Edge {
		int u, v, w;

		public Edge(int u, int v, int w) {
			super();
			this.u = u;
			this.v = v;
			this.w = w;
		}

		public int getU() {
			return u;
		}

		public void setU(int u) {
			this.u = u;
		}

		public int getV() {
			return v;
		}

		public void setV(int v) {
			this.v = v;
		}

		public int getW() {
			return w;
		}

		public void setW(int w) {
			this.w = w;
		}

		public boolean checkNotInto(List<Integer> vt) {
			if (!vt.contains(u) || !vt.contains(v)) {
				return true;
			}
			return false;
		}

		@Override
		public boolean equals(Object obj) {
			Edge edge = (Edge) obj;
			return this.u == edge.u && this.v == edge.v && this.w == edge.w;
		}

	}

}

class subBellMan {
	int w, pre;

	public subBellMan(int w, int pre) {
		super();
		this.w = w;
		this.pre = pre;
	}

	public int getW() {
		return w;
	}

	public void setW(int w) {
		this.w = w;
	}

	public int getPre() {
		return pre;
	}

	public void setPre(int pre) {
		this.pre = pre;
	}

	@Override
	public String toString() {
		return "subBellMan [w=" + w + ", pre=" + pre + "]" +"\n";
	}
	
	

}
