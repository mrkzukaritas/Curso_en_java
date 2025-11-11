package Actividad;
import java.util.Scanner;
public class Main {

	public static void main(String[] args) {
		//poner los datos de los estudiantes
		Estudiante estudiante1= new Estudiante("maria", 17,4);
		Estudiante estudiante2= new Estudiante("mafe", 18,5);
		Estudiante estudiante3= new Estudiante("ailin", 16,4);
		Estudiante estudiante4= new Estudiante("juliana", 15,5);
		Estudiante estudiante5= new Estudiante("katherin", 19,4);
		Estudiante estudiante6= new Estudiante("santiago", 16,3);
		Estudiante estudiante7= new Estudiante("angel", 20,4);
		Estudiante estudiante8= new Estudiante("andrea", 30,3);
		Estudiante estudiante9= new Estudiante("juan", 18,4);
		Estudiante estudiante10= new Estudiante("stefanie", 17,1);
		//crear el nuevo curso 
		Curso curso1 = new Curso("programacion",52,estudiante1,estudiante2,estudiante3,estudiante4,estudiante5,
						estudiante6,estudiante7,estudiante8,estudiante9,estudiante10);
		Scanner scanner = new Scanner(System.in);
		int opc=0;
		
		while(opc==0){
			//mostrar el menu
			//aca voy a hacer un menu para escoger que se quiere hacer 
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Aplicacion para mostrar el curso 1\nElige una opcion");
			System.out.println("1.Mostrar todos los estudiantes del curso 1.\n2.Mostrar el estudiante con la mayor edad\n3.Asignar la nota del estudiante"
					+ "\n4.Mostrar total de aprobados\n5.Salir.");
			System.out.println("----------------------------------------------------------------------");
			System.out.println("Opcion: ");
			opc=scanner.nextInt();
			
			switch (opc) {
			case 1:
				//mostrar todos los estudiantes
				System.out.println(curso1.toString());
				opc=0;
				break;
				
				
			case 2:
				//Estudiante mayor 
				System.out.println("El mayor del curso es: "+ curso1.calcularEstudianteMasEdad(estudiante1, estudiante2,
						estudiante3, estudiante4, estudiante5, estudiante6, estudiante7, estudiante8, estudiante9, estudiante10));
				opc=0;
				break;
				
			case 3:
				//asignar nota y buscar estudiantes por su nombre 
				System.out.println("Asignar nota de un estudiante por su nombre");
				scanner.nextLine();
				String nombreNota = scanner.nextLine().toLowerCase();
				
				if(nombreNota.equals(estudiante1.getNombre())) {
					
					System.out.println("El estudiante es: " + estudiante1.getNombre()+"\nIngrese la nueva nota:");
					int nota= scanner.nextInt();
					
					estudiante1.setNota(nota);
					System.out.println("Nota guardada con exito");
					
				}else{
					if(nombreNota.equals(estudiante2.getNombre())) {
						
						System.out.println("El estudiante es: " + estudiante2.getNombre()+"\nIngrese la nueva nota:");
						int nota= scanner.nextInt();
						
						estudiante2.setNota(nota);
						System.out.println("Nota guardada con exito");	
				}else {
					if(nombreNota.equals(estudiante3.getNombre())) {
						
						System.out.println("El estudiante es: " + estudiante3.getNombre()+"\nIngrese la nueva nota:");
						int nota= scanner.nextInt();
						
						estudiante3.setNota(nota);
						System.out.println("Nota guardada con exito");
				}else {
					if(nombreNota.equals(estudiante4.getNombre())) {
						
						System.out.println("El estudiante es: " + estudiante4.getNombre()+"\nIngrese la nueva nota:");
						int nota= scanner.nextInt();
						
						estudiante4.setNota(nota);
						System.out.println("Nota guardada con exito");
				}else {
					if(nombreNota.equals(estudiante5.getNombre())) {
						
						System.out.println("El estudiante es: " + estudiante5.getNombre()+"\nIngrese la nueva nota:");
						int nota= scanner.nextInt();
						
						estudiante5.setNota(nota);
						System.out.println("Nota guardada con exito");
					}else {
						if(nombreNota.equals(estudiante6.getNombre())) {
							
							System.out.println("El estudiante es: " + estudiante6.getNombre()+"\nIngrese la nueva nota:");
							int nota= scanner.nextInt();
							
							estudiante6.setNota(nota);
							System.out.println("Nota guardada con exito");
					}else {
						if(nombreNota.equals(estudiante7.getNombre())) {
							
							System.out.println("El estudiante es: " + estudiante7.getNombre()+"\nIngrese la nueva nota:");
							int nota= scanner.nextInt();
							
							estudiante7.setNota(nota);
							System.out.println("Nota guardada con exito");
					}else {
						if(nombreNota.equals(estudiante8.getNombre())) {
							
							System.out.println("El estudiante es: " + estudiante8.getNombre()+"\nIngrese la nueva nota:");
							int nota= scanner.nextInt();
							
							estudiante8.setNota(nota);
							System.out.println("Nota guardada con exito");
						}else {
							if(nombreNota.equals(estudiante9.getNombre())) {
								
								System.out.println("El estudiante es: " + estudiante9.getNombre()+"\nIngrese la nueva nota:");
								int nota= scanner.nextInt();
								
								estudiante9.setNota(nota);
								System.out.println("Nota guardada con exito");
						}else {
							if(nombreNota.equals(estudiante10.getNombre())) {
								
								System.out.println("El estudiante es: " + estudiante10.getNombre()+"\nIngrese la nueva nota:");
								int nota= scanner.nextInt();
								
								estudiante10.setNota(nota);
								System.out.println("Nota guardada con exito");
						}else {
							System.out.println("No se encontró el estudiante con el nombre ingresado.");
						}
						}
						}
						}
					}
						
					}
				}
				
				}
				}
					
				}
				//System.out.println("no lo he hecho xd");ya
				opc=0;
				break;
			case 4:
				//aca vamos a mostrar el tootal de aprobados del curso.ya
				System.out.println("El total de aprobados es de: "+ curso1.totalAprobados(estudiante1, estudiante2,
						estudiante3, estudiante4, estudiante5,estudiante6, estudiante7, estudiante8, estudiante9, 
						estudiante10));
				opc=0;
				break;
				
			case 5: opc=1;
				break;
				//salir
			default:
				System.out.println("Opcion invalida");
				opc=0;
				break;
			
			}
			
		}
		scanner.close();
	}
	
}
