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
		// 配列がnullならエラーメッセージを返す
		if (array == null) {
			throw new IllegalArgumentException("array must not be null");
		}

		for (String str : array) {
			// 要素がnullならエラーメッセージを返す
			if (str == null) {
				throw new IllegalArgumentException("array elements must not be null");
			}
			System.out.println(str);
		}
	}

}