public class Main{
    public static void main(String[] args){
        int arr[] = {1,2,3,4,6,7,8};
        int sum = 0;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
        }
        int total = 8*9/2;
        System.out.println(total-sum);

    }
}