package Actividad;

public class Curso {
	
	private String nombre;
	private int cantidadHoras;
	private Estudiante estudiante1;
	private Estudiante estudiante2;
	private Estudiante estudiante3;
	private Estudiante estudiante4;
	private Estudiante estudiante5;
	private Estudiante estudiante6;
	private Estudiante estudiante7;
	private Estudiante estudiante8;
	private Estudiante estudiante9;
	private Estudiante estudiante10;
	
	
	//constructo ry getter y setters
	public Curso(String nombre, int cantidadHoras, Estudiante estudiante1, Estudiante estudiante2,
			Estudiante estudiante3, Estudiante estudiante4, Estudiante estudiante5, Estudiante estudiante6,
			Estudiante estudiante7, Estudiante estudiante8, Estudiante estudiante9, Estudiante estudiante10) {
		super();
		this.nombre = nombre;
		this.cantidadHoras = cantidadHoras;
		this.estudiante1 = estudiante1;
		
		this.estudiante2 = estudiante2;
		this.estudiante3 = estudiante3;
		this.estudiante4 = estudiante4;
		this.estudiante5 = estudiante5;
		this.estudiante6 = estudiante6;
		this.estudiante7 = estudiante7;
		this.estudiante8 = estudiante8;
		this.estudiante9 = estudiante9;
		this.estudiante10 = estudiante10;
	}
	
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getCantidadHoras() {
		return cantidadHoras;
	}

	public void setCantidadHoras(int cantidadHoras) {
		this.cantidadHoras = cantidadHoras;
	}

	public Estudiante getEstudiante1() {
		return estudiante1;
	}

	public void setEstudiante1(Estudiante estudiante1) {
		this.estudiante1 = estudiante1;
	}

	public Estudiante getEstudiante2() {
		return estudiante2;
	}

	public void setEstudiante2(Estudiante estudiante2) {
		this.estudiante2 = estudiante2;
	}

	public Estudiante getEstudiante3() {
		return estudiante3;
	}

	public void setEstudiante3(Estudiante estudiante3) {
		this.estudiante3 = estudiante3;
	}

	public Estudiante getEstudiante4() {
		return estudiante4;
	}

	public void setEstudiante4(Estudiante estudiante4) {
		this.estudiante4 = estudiante4;
	}

	public Estudiante getEstudiante5() {
		return estudiante5;
	}

	public void setEstudiante5(Estudiante estudiante5) {
		this.estudiante5 = estudiante5;
	}

	public Estudiante getEstudiante6() {
		return estudiante6;
	}

	public void setEstudiante6(Estudiante estudiante6) {
		this.estudiante6 = estudiante6;
	}

	public Estudiante getEstudiante7() {
		return estudiante7;
	}

	public void setEstudiante7(Estudiante estudiante7) {
		this.estudiante7 = estudiante7;
	}

	public Estudiante getEstudiante8() {
		return estudiante8;
	}

	public void setEstudiante8(Estudiante estudiante8) {
		this.estudiante8 = estudiante8;
	}

	public Estudiante getEstudiante9() {
		return estudiante9;
	}

	public void setEstudiante9(Estudiante estudiante9) {
		this.estudiante9 = estudiante9;
	}

	public Estudiante getEstudiante10() {
		return estudiante10;
	}

	public void setEstudiante10(Estudiante estudiante10) {

		this.estudiante10 = estudiante10;
	}
	//mostrar todo 

	//muestra todo
	public String toString() {
		return "Curso [nombre=" + nombre + ", cantidadHoras=" + cantidadHoras + " \nestudiante1=" + estudiante1
				+ "\nestudiante2=" + estudiante2 + " \nestudiante3=" + estudiante3 + " \nestudiante4=" + estudiante4
				+ " \nestudiante5=" + estudiante5 + " \nestudiante6=" + estudiante6 + " \nestudiante7=" + estudiante7
				+ " \nestudiante8=" + estudiante8 + " \nestudiante9=" + estudiante9 + " \nestudiante10=" + estudiante10
				+ "]";
	}
	//calcular estudiente de mayor edad
	public Estudiante calcularEstudianteMasEdad(Estudiante estudiante1, Estudiante estudiante2,
			Estudiante estudiante3, Estudiante estudiante4, Estudiante estudiante5, Estudiante estudiante6,
			Estudiante estudiante7, Estudiante estudiante8, Estudiante estudiante9, Estudiante estudiante10) {
		Estudiante Mayor=null;
		
		
		if (estudiante1.getEdad()> estudiante2.getEdad()&& 
				estudiante1.getEdad() > estudiante3.getEdad()&&
				estudiante1.getEdad()> estudiante4.getEdad()&&
				estudiante1.getEdad()> estudiante5.getEdad()&&
				estudiante1.getEdad()> estudiante6.getEdad()&&
				estudiante1.getEdad()> estudiante7.getEdad()&&
				estudiante1.getEdad()> estudiante8.getEdad()&&
				estudiante1.getEdad()> estudiante9.getEdad()&&
				estudiante1.getEdad()> estudiante10.getEdad()){
			Mayor =estudiante1;
		}
		if (estudiante2.getEdad()> estudiante1.getEdad()&&
				estudiante2.getEdad() > estudiante3.getEdad()&&
				estudiante2.getEdad()> estudiante4.getEdad()&&
				estudiante2.getEdad()> estudiante5.getEdad()&&
				estudiante2.getEdad()> estudiante6.getEdad()&&
				estudiante2.getEdad()> estudiante7.getEdad()&&
				estudiante2.getEdad()> estudiante8.getEdad()&&
				estudiante2.getEdad()> estudiante9.getEdad()&&
				estudiante2.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante2;
		}
		if (estudiante3.getEdad()> estudiante1.getEdad()&&
				estudiante3.getEdad() > estudiante2.getEdad()&&
				estudiante3.getEdad()> estudiante4.getEdad()&&
				estudiante3.getEdad()> estudiante5.getEdad()&&
				estudiante3.getEdad()> estudiante6.getEdad()&&
				estudiante3.getEdad()> estudiante7.getEdad()&&
				estudiante3.getEdad()> estudiante8.getEdad()&&
				estudiante3.getEdad()> estudiante9.getEdad()&&
				estudiante3.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante3;
		}
		if (estudiante4.getEdad()> estudiante1.getEdad()&&
				estudiante4.getEdad() > estudiante3.getEdad()&&
				estudiante4.getEdad()> estudiante2.getEdad()&&
				estudiante4.getEdad()> estudiante5.getEdad()&&
				estudiante4.getEdad()> estudiante6.getEdad()&&
				estudiante4.getEdad()> estudiante7.getEdad()&&
				estudiante4.getEdad()> estudiante8.getEdad()&&
				estudiante4.getEdad()> estudiante9.getEdad()&&
				estudiante4.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante4;
		}
		if (estudiante5.getEdad()> estudiante1.getEdad()&&
				estudiante5.getEdad() > estudiante3.getEdad()&&
				estudiante5.getEdad()> estudiante4.getEdad()&&
				estudiante5.getEdad()> estudiante2.getEdad()&&
				estudiante5.getEdad()> estudiante6.getEdad()&&
				estudiante5.getEdad()> estudiante7.getEdad()&&
				estudiante5.getEdad()> estudiante8.getEdad()&&
				estudiante5.getEdad()> estudiante9.getEdad()&&
				estudiante5.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante5;
		}
		
		if (estudiante6.getEdad()> estudiante1.getEdad()&&
				estudiante6.getEdad() > estudiante3.getEdad()&&
				estudiante6.getEdad()> estudiante4.getEdad()&&
				estudiante6.getEdad()> estudiante2.getEdad()&&
				estudiante6.getEdad()> estudiante5.getEdad()&&
				estudiante6.getEdad()> estudiante7.getEdad()&&
				estudiante6.getEdad()> estudiante8.getEdad()&&
				estudiante6.getEdad()> estudiante9.getEdad()&&
				estudiante6.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante6;
		}
		
		if (estudiante7.getEdad()> estudiante1.getEdad()&&
				estudiante7.getEdad() > estudiante2.getEdad()&&
				estudiante7.getEdad()> estudiante3.getEdad()&&
				estudiante7.getEdad()> estudiante4.getEdad()&&
				estudiante7.getEdad()> estudiante5.getEdad()&&
				estudiante7.getEdad()> estudiante6.getEdad()&&
				estudiante7.getEdad()> estudiante8.getEdad()&&
				estudiante7.getEdad()> estudiante9.getEdad()&&
				estudiante7.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante7;
		}
		if (estudiante8.getEdad()> estudiante1.getEdad()&&
				estudiante8.getEdad() > estudiante2.getEdad()&&
				estudiante8.getEdad()> estudiante3.getEdad()&&
				estudiante8.getEdad()> estudiante4.getEdad()&&
				estudiante8.getEdad()> estudiante5.getEdad()&&
				estudiante8.getEdad()> estudiante6.getEdad()&&
				estudiante8.getEdad()> estudiante7.getEdad()&&
				estudiante8.getEdad()> estudiante9.getEdad()&&
				estudiante8.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante8;
		}
		
		if (estudiante9.getEdad()> estudiante1.getEdad()&&
				estudiante9.getEdad() > estudiante2.getEdad()&&
				estudiante9.getEdad()> estudiante3.getEdad()&&
				estudiante9.getEdad()> estudiante4.getEdad()&&
				estudiante9.getEdad()> estudiante5.getEdad()&&
				estudiante9.getEdad()> estudiante6.getEdad()&&
				estudiante9.getEdad()> estudiante7.getEdad()&&
				estudiante9.getEdad()> estudiante8.getEdad()&&
				estudiante9.getEdad()> estudiante10.getEdad()){
			
			Mayor =estudiante9;
		}
		
		if (estudiante10.getEdad()> estudiante1.getEdad()&&
				estudiante10.getEdad() > estudiante2.getEdad()&&
				estudiante10.getEdad()> estudiante3.getEdad()&&
				estudiante10.getEdad()> estudiante4.getEdad()&&
				estudiante10.getEdad()> estudiante5.getEdad()&&
				estudiante10.getEdad()> estudiante6.getEdad()&&
				estudiante10.getEdad()> estudiante7.getEdad()&&
				estudiante10.getEdad()> estudiante8.getEdad()&&
				estudiante10.getEdad()> estudiante9.getEdad()){
			
			Mayor =estudiante10;
		}
		return Mayor;
	}
	
	//ver cuales son aprobados
	public int totalAprobados(Estudiante estudiante1, Estudiante estudiante2,
			Estudiante estudiante3, Estudiante estudiante4, Estudiante estudiante5, Estudiante estudiante6,
			Estudiante estudiante7, Estudiante estudiante8, Estudiante estudiante9, Estudiante estudiante10) {
		int aprobados=0;
		
		if (estudiante1.getNota()>=3) {
			aprobados++;
			
		}
		if (estudiante2.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante3.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante4.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante5.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante6.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante7.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante8.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante9.getNota()>=3.0) {
			aprobados++;
			
		}
		if (estudiante10.getNota()>=3.0) {
			aprobados++;
			
		}
		return aprobados;
	}
}

