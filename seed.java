public class Seed {
	public static void main(String[] args) {
	int num=Integer.parseInt(args[0]);
	int count=0;
	for(int i=11;i<num/2;i++){
	int t1=i;
	int b=i;
	while(t1>0){
		b=b*(t1%10);
		t1=t1/10;
			}
		if(b==num){
			System.out.println(i+" is a seed of "+num);
			count+=1;
			}
		}
	if(count==0){
		System.out.println("No seed found.");
	}
	}
}
