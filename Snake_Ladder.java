public class Snake_Ladder{
   public static void main(String[] args){
      //Constants Declared

         int Start_Pos=0;
         int Win_Pos=100;
      //Variables
      int position=0;
		int Noplay=0;
		int Ladder=1;
		int Snake=2;
      //Computation
      int RndmChck=(int) Math.floor(Math.random()*10)%7;
		 int RndmOpt=(int) Math.floor(Math.random()*10)%3;
      switch(RndmOpt){
			case 1:
				position=position+RndmChck;
				System.out.println("Position of a User is :" +position);
				break;
			case 2:
				position=position+RndmChck;
			   System.out.println("Position after bitting is :" +position);
				break;
			default:
				position=0;
			   System.out.println("No play For the User");
			}
			System.out.println(position);
   }
}

