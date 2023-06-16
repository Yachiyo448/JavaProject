package util;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/**
 *  日時をyyyy/MM/dd hh:mm:ssの形式で返すクラスです。
 */
public class DateTimePrinter {

	// フィールドの宣言
	LocalDateTime time;

	/**
	 *  現在の日時をyyyy/MM/dd hh:mm:ssの形式で取得します。
	 * @return 現在の日時
	 */
	public String getCurrentTimeString() {
		this.time = LocalDateTime.now();

		// 日時のフォーマットを指定
		DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");

		// フォーマットに従い日時を文字列に変換
		String currentTimeString = time.format(formatter);

		// 変換した文字列を返す
		return currentTimeString;
	}

}
