import java.util.*;

public class Veterinaria {
	
	
	PriorityQueue<Mascota> colaMascota = new PriorityQueue<>();
	
	void mostrar() {
		for (Mascota mascota : colaMascota) {
			System.out.println("Tipo: " + mascota.TipoMascota + "\nDia de entrada: " + mascota.dia 
					+ "\nValor de la vacuna: " + mascota.ValorVacuna + "\nCodigo: " + mascota.codigo + "\n" 
					+ "Enfermedad: " + mascota.enfermedades + "\n");
		}
	}
	
	int PromedioVacunas() {
		int promedio = 0;
		for (Mascota mascota : colaMascota) {
			promedio += mascota.ValorVacuna;
		}
		return promedio/ colaMascota.size();
	}
	
	void buscador(int codigo) {
		for (Mascota mascota : colaMascota) {
			if (codigo == mascota.codigo) {
				System.out.println("Tipo: " + mascota.TipoMascota + "\n" + "Dia entrada: " + mascota.dia);
			}
		}
	}
	
	void contarEnfermedades() {
		Hashtable<String, Integer> has = new Hashtable<>();
		for (Mascota mascota : colaMascota) {
			for (String enfermedad : mascota.enfermedades) {
				int contador = 1; 
				if (has.containsKey(enfermedad)) {
					contador = has.get(enfermedad);
					contador++;
				}
				
				has.put(enfermedad, contador);
			
			}
		}
		has.forEach((key, value) -> {
            System.out.println(key + ": " + value);
        });
	}
	
	void buscarEnfermedades(String enfermades) {
		for (Mascota mascota : colaMascota) {
			for (String enfermedad : mascota.enfermedades) {
				if (enfermades.equals(enfermedad)) {
					System.out.println("\n" + "Tipo: " + mascota.TipoMascota + "\nDia de entrada: " + mascota.dia +
							"\nCodigo: " + mascota.codigo );
				}
			}
		}
	}
}
