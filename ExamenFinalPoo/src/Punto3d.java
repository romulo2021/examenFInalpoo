public class Punto3d {
   //atributos
    double x;
    double y;
    double z;
//constructor
    public Punto3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }
//constructor
    public Punto3d(double w) {
    this.x=w;
    this.y=w;
    this.z=w;
    }
//constructor
    public Punto3d() {
        this.x=0;
        this.y=0;
        this.z=0;
    }
//metodos
    public double calcularDistanciaOrigen(){
        return Math.sqrt(Math.pow(this.x,2)+Math.pow(this.y,2)+Math.pow(this.z,2));

    }

    public double calcularDistanciaOtroPunto(double x,double y,double z){
        return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
}
public double calcularDistanciaOtroPunto(Punto3d otroPunto){
    return Math.sqrt(Math.pow(this.x-x,2)+Math.pow(this.y-y,2)+Math.pow(this.z-z,2));
}
//toString
    @Override
    public String toString() {
        return "("+ this.x + ";"+this.y + ";" + this.z +")";
    }
}
