package util;

/**
 *  特定の文字列配列を出力するクラスです
 */

public class ConsolePrinter {

	// フィールドの宣言
	private String country = "日本";
	private String food = "寿司";
	private String foodType = "和食";

	// 現在日時の宣言
	DateTimePrinter dateTimePrinter = new util.DateTimePrinter();
	private String currentTime = dateTimePrinter.getCurrentTimeString();

	public void output() {

		// 特定のフォーマットに従い文字列配列を作成
		String[] strArray = new String[] { "こんにちは！ここは" + this.country + "です！",
				"この" + this.food + "はうまい",
				food + "は" + this.foodType + "です",
				"今の現在日時は" + this.currentTime + "です"
		};

		// 配列に格納された文字列を順次出力
		ArrayStringPrinter arrayStringPrinter = new util.ArrayStringPrinter();
		arrayStringPrinter.printArrayStrings(strArray);

	}

}
