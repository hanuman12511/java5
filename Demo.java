
class Demo{
    
    public static void main(String [] a) {
    int A[]={3,2,4,3,6};
    int B[]=new int[A.length];
    B=A;
    A=new int[A.length+1];
    int n=A.length;
    int item= 4;
    int i,pos=2;
    for(i=0;i<n-1;i++){
      A[i]=B[i];
      } 
    for(i=0;i<=pos;i++){ // 0 , 1,2
    // [5]=[4]
    // [4]=[3]
    //[3]=[2]
      A[n-1-i]=A[n-2-i];
      }
    A[i-1]=item;
   

 
for(i=0;i<n;i++){
  System.out.print(A[i]);
 }

 /* 
for(i=0;i<n;i++){
  if(item==A[i]){
    pos=i;
    break;
  }
}
for(i=pos;i<n-1;i++){
  A[i]=A[i+1];
}
n--;
System.out.println();

for(i=0;i<n;i++){
 System.out.print(A[i]);
} */
    }}