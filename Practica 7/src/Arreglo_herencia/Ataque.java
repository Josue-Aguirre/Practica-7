package Arreglo_herencia;

public class Ataque extends Bird{
	
	public Ataque(String color, String tamaño){
		super(color,tamaño);
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
		System.out.println("El pajaro " + gettamaño() + getcolor() + " atacó y explotó");
	}
	private void especialIce() {
		System.out.println("El pajaro " + gettamaño() + getcolor() + " atacó y congeló");
	}
	private void especialRed() {
		System.out.println("El pajaro " + gettamaño() + getcolor() + " atacó y se estrelló");
	}
}
