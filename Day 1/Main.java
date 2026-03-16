public class Main{
    public static void main(String[]args){
        int arr[]={3,8,1,10,4};
        int max=arr[0];
        for(int i=1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }

        System.out.println(max);
    }
}