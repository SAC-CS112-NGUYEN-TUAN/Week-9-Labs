package prjarrays;

 class RandomNum{
	 int randomNo;
	 public void generate(){
			randomNo = 1 + (int) (Math.random()*2);
	 }
	 public int getNum(){
			return randomNo;
	 
	 }

}