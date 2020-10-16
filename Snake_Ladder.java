public class Snake_Ladder{
   public static void main(String[] args){
      //Constants Declared

         int Start_Pos=0;
         int Win_Pos=100;
      //Variables
      int position=0;
     	/* Noplay=0;
         Ladder=1;
         Snake=2;*/

      //Computation
		for(int i=0;i!=Win_Pos;i++){
      int RndmChck=(int) Math.floor(Math.random()*10)%7;
       int RndmOpt=(int) Math.floor(Math.random()*10)%3;
      switch(RndmOpt){
         case 1:
            position=position+RndmChck;
            System.out.println("Position of a User is :" +position);
            break;
         case 2:
            position=position+RndmChck;
				if(position<=Start_Pos){
					position=Start_Pos;
				}
            System.out.println("Position after bitting is :" +position);
            break;
         default:
            position=0;
            System.out.println("No play For the User");
         }
		}
   }
}
