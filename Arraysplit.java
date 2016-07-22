public class Arraysplit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=args.length;
int arr[]=new int[n];
int c1=0;int c2=0;
for(int i=0;i<n;i++){
	arr[i]=Integer.parseInt(args[i]);
}
int split=n/2;
int sum1=0;
int sum2=0;
if(n%2==0){
	split=split-1;
}
for(int i=0;i<=split;i++){
	sum1=sum1+arr[i];
	c1++;
}
for(int i=split+1;i<n;i++){
	sum2=sum2+arr[i];
	c2++;
}
if((sum1/c1)==(sum2/c2)){
	int arr2[]=new int[split+1];
	int arr3[]=new int[split+1];
	for(int i=0;i<=split;i++){
		arr2[i]=arr[i];
		System.out.println(arr2[i]);
	}
	int i=n-1;
	for(int j=0;j<=split;j++){
		arr3[j]=arr[i];
		i--;
		System.out.println(arr3[j]);
	}
}
else{
	System.out.println("no split possible");
}
	}

}
