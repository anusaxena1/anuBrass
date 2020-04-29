package practise.seleniumBrass;

import java.io.IOException;
import java.util.ArrayList;

import org.testng.annotations.Test;

public class SeleniumTest {
	public static void main(String args[]) throws IOException {
	dataDriven d = new dataDriven();
	ArrayList data= d.getData("Login");
	System.out.println(data.get(0));
	System.out.println(data.get(1));
	System.out.println(data.get(2));
	}
}
