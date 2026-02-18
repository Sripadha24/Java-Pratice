package Interface;

public class Car  {
   private Engine eng = new PetrolEngine();
   private Brake brk = new PetrolEngine();
   private Media media = new MediaPlayer();

   public void startEngine(){
       eng.start();
   }
   public void stopEngine(){
       eng.stop();
   }

   public void startMedia(){
       media.start();
   }
   public void stopMedia(){
       media.stop();
   }
   public void brake(){
       brk.brake();
   }
   public void acc(){
       eng.acc();
   }
}
