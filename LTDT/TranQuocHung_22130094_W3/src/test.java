import java.io.IOException;
import java.util.Arrays;

public class test {
	public static void main(String[] args) throws NumberFormatException, IOException {
		Graph graph = new UnGraph();

//		graph.loadGraph("test3.txt");
//		graph.loadGraph("luongphan.txt");
//		if (graph.loadGraph("eulerpath.txt") == true) {
//		if (graph.loadGraph("dijsktra.txt") == true) {
		if (graph.loadGraph("gk.txt") == true) {

			graph.printMatrix();  
//			System.out.println("Đồ thị có hợp lí ko ? " + graph.checkValid());    // PASSED
			
//			graph.checkUnGraph();  // Kiểm tra đồ thị có hướng ko ? // PASSED
		
//			System.out.println("Tổng bậc của đỉnh đã cho là : " + graph.deg(3)); // PASSED
			
//			System.out.println("Tổng bậc của đồ thị là : " + graph.sumDeg());  // PASSED
			
//			System.out.println("Tổng cạnh của đồ thị : " + graph.numEdges());  // PASSED
			
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
//			System.out.println("\n\n===================Cây bao trùm duyệt theo chiều sâu DFS sử dụng đệ qui =========================================" );
//			graph.printMatrix(graph.SpanningTreeByDFS());
//			
//			
//			
			System.out.println("\n\n===================Cây bao trùm duyệt theo chiều sâu DFS KHÔNG sử dụng đệ qui =========================================" );
			graph.printMatrix(graph.SpanningTreeByDFS(graph.matrix, 0));

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
//
//			System.out.println(
//					"\n\n=================== Đường đi ngắn nhất bằng BellMan =========================================");
//			System.out.println(Arrays.toString(graph.bellManFord(0)));
	}
	}
}
