public class estudianteUniversidad{

    String legajo;
    String nombreCompleto;
    double calificacionFinal;

    estudianteUniversidad(String legajoAlumno,String nombreAlumno, double calificacionFinalAlumno){

        legajo = legajoAlumno;
        nombreCompleto = nombreAlumno;
        calificacionFinal = calificacionFinalAlumno;

    }

   public double getCalificacionFinal() {
       return calificacionFinal;
   }

   public void setCalificacionFinal(double calificacionFinal) {

    if (calificacionFinal >= 0 && calificacionFinal <= 10) {
     
        this.calificacionFinal = calificacionFinal;

    }
    else{

        System.out.println("La nota debe ser mayor a 0 y menor a 10 ");

    }
       
   }

   public String getNombreCompleto() {
       return nombreCompleto;
   }

   public void setNombreCompleto(String nombreCompleto) {
       this.nombreCompleto = nombreCompleto;
   }

    boolean estaAprobado(){

        return calificacionFinal >= 6;

    }

    public static void main(String[] args) {
        estudianteUniversidad estudiante1 =
                new estudianteUniversidad("001", "Mateo Sosa", 8);

        estudianteUniversidad estudiante2 =
                new estudianteUniversidad("002", "Juanjo Alberton", 4);

        System.out.println(estudiante1.getNombreCompleto());

        if (estudiante1.estaAprobado()) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante no aprobo.");
        }

        System.out.println();

        System.out.println(estudiante2.getNombreCompleto());

        if (estudiante2.estaAprobado()) {
            System.out.println("El estudiante aprobo.");
        } else {
            System.out.println("El estudiante no aprobo.");
        }
    }
}
    





