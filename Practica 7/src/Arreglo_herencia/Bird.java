package Arreglo_herencia;

public class Bird {
	private String color;
	private String tama�o;

	public Bird(String color, String tama�o)
	{
		this.color=color;
		this.tama�o=tama�o;
	}
	public Bird()
	{
		this.color=null;
		this.tama�o=null;
	}
	
	public String getcolor() {
		return color;
	}
	public void setcolor(String color){
		this.color=color;
	}
	public String gettama�o() {
		return tama�o;
	}
	public void settama�o(String tama�o){
		this.tama�o=tama�o;
	}
	
}
