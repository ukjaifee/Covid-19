package Covid19.page;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import org.openqa.selenium.WebElement;

public class Rules {

	public static final Predicate<WebElement> isBlank = e -> e.getText().length() == 0;


	public static List<Predicate<WebElement>> getRules() {
		List<Predicate<WebElement>> list = new ArrayList<>();
		list.add(isBlank);
	

		return list;

	}

}
