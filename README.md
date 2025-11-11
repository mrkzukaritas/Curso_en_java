# 📘 Proyecto: Curso con 10 Estudiantes

Este proyecto en Java simula la gestión de un curso con 10 estudiantes.  
Permite visualizar información de los estudiantes, identificar el de mayor edad, asignar nuevas notas y calcular cuántos aprobaron la materia.

---

## 🧑‍💻 Desarrollado por
**María Stefanie Bermúdez**

---

## 🧠 Descripción General

El proyecto contiene tres clases principales dentro del paquete `Actividad`:

1. **`Estudiante`**  
   Representa a un estudiante con sus atributos básicos:
   - `nombre`  
   - `edad`  
   - `nota`

2. **`Curso`**  
   Modela un curso con:
   - Nombre del curso.  
   - Cantidad de horas.  
   - Diez instancias de la clase `Estudiante`.

   Además, contiene métodos para:
   - Mostrar todos los estudiantes del curso (`toString`).  
   - Determinar el estudiante con mayor edad (`calcularEstudianteMasEdad`).  
   - Calcular el total de aprobados (`totalAprobados`).

3. **`Main`**  
   Clase principal que ejecuta el programa.  
   Muestra un menú interactivo en consola que permite:
   - Listar todos los estudiantes.  
   - Mostrar el estudiante de mayor edad.  
   - Modificar la nota de un estudiante según su nombre.  
   - Ver cuántos estudiantes aprobaron (nota ≥ 3.0).  
   - Salir del programa.

---

## 🧩 Estructura del Proyecto

Curso_con_10_estudiantes/
│
├── src/
│ └── Actividad/
│ ├── Curso.java
│ ├── Estudiante.java
│ └── Main.java
│
├── .classpath
├── .project
├── LICENSE
└── README.md

---

## ⚙️ Requisitos

- **Java JDK 8 o superior**
- **IDE recomendado:** Eclipse o VS Code con extensión para Java
- **Consola interactiva** para ejecutar la clase `Main`

---

## 🚀 Ejecución del Programa

1. Compila las clases:
   ```bash
   javac src/Actividad/*.java
   ```
2. Ejecuta la clase principal:
```bash
   java Actividad.Main

   ```

