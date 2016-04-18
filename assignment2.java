class assignment2 {

	public static void main (String[] args){

		
		int num,i;

		for(i=2;i<=100;i++){
			int count=0;
			for(num=i;num>=2;num--){
				if(i%num==0){
					count=count+1;
				}
			}
			if(count==1){
				System.out.println("primeNumbers "+i);
			}
		}

	}
}