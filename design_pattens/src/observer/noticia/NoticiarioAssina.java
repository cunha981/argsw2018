package observer.noticia;

import java.util.Observable;
import java.util.Observer;

public class NoticiarioAssina extends Noticiario implements Observer{

	@Override
	public void update(Observable o, Object arg) {
		System.out.println("Nova noticia");
		setChanged();
		notifyObservers();
		
	}

	@Override
	public void notificaNoticia(String textoNoticia, int dia, int mes, String topico) {
		System.out.println("Noticia: " + textoNoticia);
		update(this, textoNoticia);
		
	}

}
