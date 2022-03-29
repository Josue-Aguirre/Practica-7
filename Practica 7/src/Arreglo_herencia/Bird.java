package Arreglo_herencia;

public class Bird {
	private String color;
	private String tamaño;

	public Bird(String color, String tamaño)
	{
		this.color=color;
		this.tamaño=tamaño;
	}
	public Bird()
	{
		this.color=null;
		this.tamaño=null;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String gettamaño() {
		return tamaño;
	}
	public void settamaño(String tamaño){
		this.tamaño=tamaño;
	}
	
}
