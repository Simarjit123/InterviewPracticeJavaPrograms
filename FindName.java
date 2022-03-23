package practice;

public class FindName {
	public static void main(String[] args) {

		String[] cityname = { "Brampton", "Toronto", "Guelph", "Cambridge" };
		String city = "guelph";
		boolean found = false;
		for (int i = 0; i < cityname.length; i++) {
			if (cityname[i].equalsIgnoreCase(city)) {
				found = true;
				break;

			}
		}
		if (found) {
			System.out.println("city found is :" + city);
		} else {
			System.out.println("city not found");
		}

	}
}
