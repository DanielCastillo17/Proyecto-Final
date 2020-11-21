import java.io.*;

public class Program {
	
	public static void main(String[] args) throws  IOException{
		
		Veterinaria vet = new Veterinaria(); 
		
		BufferedReader bf = new BufferedReader(new FileReader("Datos-Veterinaria.txt"));
		int cantidadMascotas = Integer.parseInt(bf.readLine());
		
		String[] arrMascotas;
		
		for (int i = 0; i < cantidadMascotas; i++) {
			
			arrMascotas = bf.readLine().split(", ");
			Mascota mascotas = new Mascota(arrMascotas[0], Integer.parseInt(arrMascotas[1]), 
					Integer.parseInt(arrMascotas[2]), Integer.parseInt(arrMascotas[3]));
			
			int cantEnfermedades = Integer.parseInt(arrMascotas[4]);
			for (int j = 0; j < cantEnfermedades; j++) {
				String enfermedades = bf.readLine(); 
				mascotas.enfermedades.add(enfermedades);
				
			}
			vet.colaMascota.add(mascotas);
			
		}
		
		vet.mostrar();
		
		//1. Promedio de las vacunas 
		System.out.println("Promedio vacunas: " + vet.PromedioVacunas() + "\n");
		
		//2. Buscador de mascotas 
		System.out.println("Mascota encontra es: "); 
		vet.buscador(101);
		System.out.println();
	
		//3. Cantidad de enfermedades 
		vet.contarEnfermedades();
		
		//4. buscador de enfermedades, que coloque la enfermedad y me muestre los datos de las mascotas que lo tienen 
		vet.buscarEnfermedades("migraña");
	}

}
