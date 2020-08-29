package polimorfismoAnimais;

public class Peixes extends Animais{
	private String corEscama;
	
	@Override
	public void locomover() {
		System.out.println("Nadando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo algas");
	}

	@Override
	public void emitirSom() {
		System.out.println("Soltando bolha");
	}

	public String getCorEscama() {
		return corEscama;
	}

	public void setCorEscama(String corEscama) {
		this.corEscama = corEscama;
	}

}
