import java.util.ArrayList;
import java.util.Iterator;

import org.w3c.dom.ls.LSException;

public class MaHoaArr {

	public static ArrayList<ArrayList<String>> createArrayList(String S) { // hàm để mã hóa

		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(); // tạo mảng 2 chiều bằng arraylist

		for (int i = 0; i < S.length(); i += 5) {

			ArrayList<String> row = new ArrayList<String>();

			for (int j = i; j < i + 5; j++) {

				if (j <= S.length() - 1) {
					if (String.valueOf(S.charAt(j)).equals(" "))
						row.add("-");
					else {
						row.add(String.valueOf(S.charAt(j)));
					}

				} else {
					row.add("-");
				}

			}

			list.add(row);

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("--------------------------");

		return list;
	}

	public static String maHoa(String S) { // viết hàm dễ mã hóa dữ liệu
		String result = "";
		ArrayList<ArrayList<String>> list = createArrayList(S);
		for (int i = 0; i < list.get(0).size(); i++) {

			for (int j = 0; j < list.size(); j++) {

				result += list.get(j).get(i);

			}

		}

		return result;

	}

	public static void giaiMa(String S) { // viết hàm để giải mã dữ liệu
		ArrayList<ArrayList<String>> list = new ArrayList<ArrayList<String>>(); // tạo mảng 2 chiều bằng arraylist

		for (int i = 0; i < S.length(); i += 3) {

			ArrayList<String> row = new ArrayList<String>();

			for (int j = i; j < i + 3; j++) {

				if (j <= S.length() - 1) {
					if (String.valueOf(S.charAt(j)).equals(" "))
						row.add("-");
					else {
						row.add(String.valueOf(S.charAt(j)));
					}

				} else {
					row.add("-");
				}

			}

			list.add(row);

		}

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}
		System.out.println("--------------------------");

		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));

		}

		for (ArrayList<String> arrayList : list) {
			for (String a : arrayList) {
				if (a.equals("-")) {
					System.out.print("-");
				} else {
					System.out.print(a);

				}

			}
		}

	}

	public static void main(String[] args) {
		String S = "I am student";
		String maHoaString = maHoa(S);
		System.out.println("chuỗi mã hóa là : " + maHoaString);
		System.out.println("-----------------");
		giaiMa(maHoaString);

	}

}
