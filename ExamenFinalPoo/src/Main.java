public class Main {
    public static void main(String[] args) {
       Punto3d primerPunto=new Punto3d(4,7,8);
       Punto3d segundoPunto=new Punto3d(8,7,4);
       Punto3d tercerPunto=new Punto3d(1);

        System.out.println(primerPunto);
        System.out.println(segundoPunto);
        System.out.println(tercerPunto);

        System.out.println(segundoPunto.calcularDistanciaOrigen());
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(0,0,0));
        System.out.println(segundoPunto.calcularDistanciaOtroPunto(primerPunto));

        Vector3d primerVector=new Vector3d(primerPunto,segundoPunto);
        Vector3d segundoVector=new Vector3d(tercerPunto);

        System.out.println(primerVector);
        primerVector.mostrarComponentes();
        System.out.println(primerVector.calcularMagnitud());
        System.out.println(segundoVector);
        segundoVector.mostrarComponentes();
        System.out.println(primerVector.calcularMagnitud());








    }
}
