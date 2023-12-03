import java.io.IOException;
import java.util.Scanner;

import org.jsoup.*;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;


public class main {

	public static void main(String[] args) throws IOException {
		Scanner sc = new Scanner(System.in);
		
		String URL = sc.next();
		Document doc = Jsoup.connect(URL).get();
		
		doc.text();
		doc.html();
		
		Elements elem = doc.select("div[class=\"textchatcontainer\"]");
		
		System.out.println(elem.text());
		
		sc.close();
		
		//접근 권한 문제
	}

}
