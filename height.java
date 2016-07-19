public class Height {
	public static void main(String[] args) {
		float a[]=new float[50];
		float temp;
		for(int i=0;i<50;i++){
			a[i]=Float.parseFloat(args[i]);
		}
		for(int i=0;i<49;i++){
			for(int j=0;j<49-i;j++){
				if(a[j]<a[j+1]){
				temp=a[j];
				a[j]=a[j+1];
				a[j+1]=temp;
				}
			}
		}
		System.out.println("The fourth tallest is:"+a[4]);
	}

}
