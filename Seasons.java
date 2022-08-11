package jenums;

public class Seasons{
	enum Season{
		SPRING,
		SUMMER,
		WINTER,
		AUTUMN,

	}

	public static void main(String[] args) {
		for(Season mySeason : Season.values()) {
		System.out.println(mySeason);
	    }
	}
}


