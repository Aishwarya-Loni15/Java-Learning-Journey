public class Large{
    public static void main(String[]args){
        int[] numbers={12,3,4,23,43,45};
        int largest= numbers[0];
        for(int i=1;i<numbers.length;i++){
            if(numbers[i]>largest){
                largest=numbers[i];

            }
        }
        System.out.println("largest "+largest);  
    }

}