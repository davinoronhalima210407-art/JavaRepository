public class Media {

   private double n1;

   private double n2;

   private static final double P1 = 3.5;

   private static final double P2 = 7.5;

   private double media;

   public Media(double n1, double n2) {
       this.n1 = n1;
      this.n2 = n2;
   }

    public void setN1(double n1) {
        this.n1 = n1;
    }
    public void setN2(double n2) {
        this.n2 = n2;
    }
    public void CalcularMedia() {
       media = (n1*P1 + n2*P2)/(P1+P2);
    }
    public void exibirinfo(){
       if(media<=10 && media>=0){
        System.out.printf("MEDIA = %.5f%n",media);
    }
   else{
   System.out.printf("[ERROR] - valores fora do range");}
    }
}
