package polimorfismoAnimais;
public class Main {
	public static void main(String [] args) {
		Mamifero mamifero = new Mamifero();
		Canguru canguru = new Canguru();
		Cachorro cachorro = new Cachorro();
		Reptil reptil = new Reptil();
		Peixes peixe = new Peixes();
		Aves ave = new Aves();
				
		mamifero.setPeso(35.3f);
		mamifero.setCorDoPelo("Marrom");
		mamifero.alimentar();
		mamifero.locomover();
		mamifero.emitirSom();
		
		ave.locomover();
		ave.emitirSom();
		ave.alimentar();
		
		reptil.locomover();
		reptil.emitirSom();
		reptil.alimentar();
		
		peixe.locomover();
		peixe.emitirSom();
		peixe.alimentar();
		
		canguru.locomover();
		canguru.usarBolsa();
		
		cachorro.emitirSom();
		
		
	}
}
