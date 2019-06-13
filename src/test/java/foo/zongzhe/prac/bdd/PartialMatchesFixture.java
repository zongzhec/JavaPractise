package foo.zongzhe.prac.bdd;

import java.util.HashSet;
import java.util.Set;
import java.util.SortedSet;
import java.util.TreeSet;

public class PartialMatchesFixture {

	private Set<String> usernamesInSystem = new HashSet<>();

	public void setUpUser(String username) {
		usernamesInSystem.add(username);
	}

	public Iterable<String> getSearchResultsFor(String searchString) {
		SortedSet<String> matches = new TreeSet<>();
		for (String username : usernamesInSystem) {
			if (username.contains(searchString)) {
				matches.add(username);
			}
		}
		return matches;
	}
}
