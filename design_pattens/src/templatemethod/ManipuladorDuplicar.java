package templatemethod;

/**
 * 
 * @author Igor Almeida | RA: 81617543
 *
 */
public class ManipuladorDuplicar extends ManipuladorAbstrato {

	protected String transformarString(String string) {
		return string + " " + string;
	}
}
