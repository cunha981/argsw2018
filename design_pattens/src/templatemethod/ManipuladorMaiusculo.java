package templatemethod;

/**
 * 
 * @author Igor Almeida | RA: 81617543
 *
 */
public class ManipuladorMaiusculo extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string.toUpperCase();
	}
}
