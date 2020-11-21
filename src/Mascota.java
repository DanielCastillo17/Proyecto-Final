import java.util.ArrayList;

public class Mascota implements Comparable<Mascota> {
	
	String TipoMascota;
	int dia;
	int ValorVacuna;
	int codigo; 
	
	ArrayList<String> enfermedades = new ArrayList<>();

	public Mascota(String tipo, int dia, int valor, int codigo) {
		this.TipoMascota = tipo;
		this.dia = dia; 
		this.ValorVacuna = valor;
		this.codigo = codigo;
		
	}
	
	@Override
	public int compareTo(Mascota m) {
		
		return m.dia - this.dia ;
	}
}
