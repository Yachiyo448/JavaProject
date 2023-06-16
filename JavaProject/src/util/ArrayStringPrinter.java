package util;

/**
 * 配列内の文字列を行ごとに出力するクラスです。
 */
public class ArrayStringPrinter {

	/**
	 *  配列内の文字列を行ごとに出力します。
	 * @param array 配列
	 */
	public void printArrayStrings(String[] array) {
		if (array == null) {
			throw new IllegalArgumentException("array must not be null");
		}

		for (String str : array) {
			if (str == null) {
				throw new IllegalArgumentException("array elements must not be null");
			}
			System.out.println(str);
		}
	}

}