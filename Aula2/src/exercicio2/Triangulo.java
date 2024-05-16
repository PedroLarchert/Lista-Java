package exercicio2;

public class Triangulo {
	
    private float side;
    private float height;

   public Triangulo(float side, float height){
	   this.side = side;
	   this.height = height;

   }

   public float calcularPerimetro(){
       return  side * 3;
   }
   public float calcularArea(){
       return (side*height)/2;
   }

   public void setSize(float side){
       this.side= side;
   }

   public void showInfo(float num){
       System.out.println("o tamanho  e: "+side );
       System.out.println("a altura  e: "+height );
   }
    public static void main(String[] args){
        Triangulo triangulo1 = new Triangulo(2,1);
        System.out.println("a area  e: "+ triangulo1.calcularArea());
        System.out.println("o perimetro e: "+ triangulo1.calcularPerimetro());
    }
}
