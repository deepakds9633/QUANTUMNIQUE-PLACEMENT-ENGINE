public class Main{
    public static void main(String []args){
        int[] a={5,8,2,10,7};
        int big= Integer.MIN_VALUE;
        int small=Integer.MIN_VALUE;
        for(int num:a){
            if (num>big){
            small=big;
            big=num;
            }
            
            else if(num>small&num!=big){
                small=num;
                
            }
            
        }
        System.out.println(small);
        
    }
}
