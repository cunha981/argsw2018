package adapter.map;

import java.util.Map;

public class Main {

	public static void main(String[] args) {
		Object[][] pares = new String[][] { { "a", "b", "", "c", "d", "e" },
				{ "i", "ii", "iii", "iv", "v", "vi" } };

		Map<?, ?> mapa = new NewMapAdapter(pares);
		
		for(Object key : mapa.keySet()) {
			System.out.println(key + " : " + mapa.get(key));
		}
	}

}
