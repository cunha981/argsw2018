package design_patterns_singleton.incremental;

public class Incremental {
	private static Incremental singletonInstance;

	private static int count = 0;

	private int numero;

	private Incremental() {
		numero = ++count;
	}

	synchronized public static Incremental getInstance() {
		if (singletonInstance == null)
			singletonInstance = new Incremental();

		return singletonInstance;
	}

	public String toString() {
		return "Incremental: " + numero;
	}
}