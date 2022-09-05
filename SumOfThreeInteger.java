public class SumOfThreeInteger {
    public static void main(String[] args) {
        int arr[]={0,-1,2,-3,1,4};
        int n=arr.length;
        boolean found=false;
        for(int i=0;i<n-2;i++){
            for(int j=i+1;j<n-1;j++){
                for(int k=j+2;k<n;k++){
                    if(arr[i]+arr[j]+arr[k]==0){
                        System.out.println(arr[i]+" "+arr[j]+ " "+arr[k]+" forms 0.");
                        found=true;
                    }
                }
            }
        }
        if(found==false){
            System.out.println("not exits");
        }
    }
}
