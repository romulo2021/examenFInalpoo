public class Vector3d {
  //atributos
    Punto3d puntoInicial;
    Punto3d puntoFinal;
//constructor
    public Vector3d(Punto3d puntoInicial, Punto3d puntoFinal) {
        this.puntoInicial = puntoInicial;
        this.puntoFinal = puntoFinal;
    }
//constructor
    public Vector3d(Punto3d puntoFinal) {
        this.puntoInicial=new Punto3d(0,0,0);
        this.puntoFinal = puntoFinal;

    }
//metodos
    public double calcularMagnitud(){
        return  Math.sqrt(Math.pow(puntoFinal.x-puntoInicial.x,2)+Math.pow(puntoFinal.y-puntoInicial.y,2)+Math.pow(puntoFinal.z-puntoInicial.z,2));
}
public void mostrarComponentes(){
    System.out.println(this.puntoFinal.x-this.puntoInicial.x);
    System.out.println(this.puntoFinal.y-this.puntoInicial.y);
    System.out.println(this.puntoFinal.z-this.puntoInicial.z);
}
   //toString
    @Override
    public String toString() {
        return "El vector comienza en el punto puntoInicial "+this.puntoInicial +
                " y termina en el punto puntoFinal "+this.puntoFinal;
    }
}
