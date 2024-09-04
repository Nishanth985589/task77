package encapsulation;

public class Circumfrence {

          int r;

		public double getR() {
			return (3.14*(r*r));
		}

		public void setR(int r) {
			this.r = r;
		}

         Circumfrence()
         {
        	 r=12;
         }
         
	
     Circumfrence(int radius)
     {
}
}
