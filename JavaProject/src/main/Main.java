package main;

public class Main {

	public static void main(String[] args) {

		// 現在の日時文字列を取得
		util.DateTimePrinter dateTimePrinter = new util.DateTimePrinter();
		String currentTime = dateTimePrinter.getCurrentTimeString();

		// 出力するメッセージを配列に格納
		String[] strArray = new String[] { "こんにちは！ここは日本です！",
				"この寿司はうまい",
				"寿司は和食です",
				"今の現在日時は" + currentTime + "です"
		};

		// 配列に格納された文字列を順次出力
		util.ArrayStringPrinter arrayStringPrinter = new util.ArrayStringPrinter();
		arrayStringPrinter.printArrayStrings(strArray);

	}

}
