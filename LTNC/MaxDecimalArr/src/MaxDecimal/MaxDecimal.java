package MaxDecimal;

import java.math.BigDecimal;

public class MaxDecimal {
	public static BigDecimal findMaxDecimal(BigDecimal[] decimalsArr) {
		BigDecimal result = new BigDecimal(0);
		for (BigDecimal bigDecimal : decimalsArr) {
			if (result.compareTo(bigDecimal) == -1) {
				result = bigDecimal;
			}

		}

		return result;
	}

	public static void main(String[] args) {
		BigDecimal[] decimalsArr = {new BigDecimal('a'),new BigDecimal(8),new BigDecimal(12),new BigDecimal(28)};
		System.out.println( findMaxDecimal(decimalsArr));
	}
}
