package Arreglo_herencia;

public class Ataque extends Bird{
	
	public Ataque(String color, String tama�o){
		super(color,tama�o);
	}
	
	public void especiales()
	{
		if(getcolor().equals("(Grande)")) {
			especialBomb();
		}
		else if(getcolor().equals("(Chico)")) {
			especialIce();
		}
		else {
			especialRed();
		}
	}
	private void especialBomb() {
		System.out.println("El pajaro " + gettama�o() + getcolor() + " atac� y explot�");
	}
	private void especialIce() {
		System.out.println("El pajaro " + gettama�o() + getcolor() + " atac� y congel�");
	}
	private void especialRed() {
		System.out.println("El pajaro " + gettama�o() + getcolor() + " atac� y se estrell�");
	}
}
