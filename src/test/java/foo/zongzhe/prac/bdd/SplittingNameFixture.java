package foo.zongzhe.prac.bdd;

import org.concordion.integration.junit4.ConcordionRunner;
import org.junit.runner.RunWith;

@RunWith(ConcordionRunner.class)
public class SplittingNameFixture {

	public Result split(String fullName) {
		String[] nameSplit = fullName.split(" ");
		Result res = new Result();
		res.firstName = nameSplit[0];
		res.lastName = nameSplit[1];
		return res;
	}

	class Result {
		public String firstName = "TODO";
		public String lastName = "TODO";
	}
}
