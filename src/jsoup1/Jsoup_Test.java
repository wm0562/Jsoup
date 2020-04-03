package jsoup1;

import java.io.IOException;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;

public class Jsoup_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Document doc = null;
		try {
		doc = Jsoup.connect("http://www.baidu.com").get();
		} catch(IOException e)
		{
			e.printStackTrace();
		}
		System.out.println(doc);
	}

}
