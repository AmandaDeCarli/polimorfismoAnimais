package polimorfismoAnimais;

public class Reptil extends Animais{
	
	private String corDaEscama;
	
	@Override
	public void locomover() {
		System.out.println("Ratejando");
	}

	@Override
	public void alimentar() {
		System.out.println("Comendo vegetais");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de reptil");
	}

	public String getCorDaEscama() {
		return corDaEscama;
	}

	public void setCorDaEscama(String corDaEscama) {
		this.corDaEscama = corDaEscama;
	}

}
