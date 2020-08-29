package polimorfismoAnimais;

public class Aves extends Animais{
	private String corDaPena;

	@Override
	public void locomover() {
		System.out.println("Voando");
	}

	@Override
	public void alimentar() {
		System.out.println("Som de Ave");
	}

	@Override
	public void emitirSom() {
		System.out.println("Som de Ave");
	}
	
	public void fazerNinho() {
		System.out.println("Construindo ninho");
	}

	public String getCorDaPena() {
		return corDaPena;
	}

	public void setCorDaPena(String corDaPena) {
		this.corDaPena = corDaPena;
	}
	
	
}
