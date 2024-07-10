import java.util.Arrays;
public class ArrayPractice {
    public static void main(String[] args) {
        int num1[]={2,1,5,3,4,8,7,6};
        int rem=1;
        int num2[]=new int[8];
        for(int i=0;i<num1.length;i++){
            if(num1[i]==rem){
                num2[i]=num1[i+1];
                for(int j=i+1;j<num1.length;j++){
                    num2[j-1]=num1[j];
                }
                break;
            }
            else{
                num2[i]=num1[i];
            }

        }


       System.err.println(Arrays.toString(num1));
       System.err.println(Arrays.toString(num2));
       Arrays.sort(num1);
       System.err.println(Arrays.toString(num1));
        String Arr[][]={
                {" - "," - ", " - "," - "},
                {" - "," - ", " - "," - "},
                {" - "," - ", " - "," - "},
                {" - "," - ", " - "," - "},
        };

        for(int i=0;i<Arr.length;i++){
            for(int j=0;j<Arr.length;j++){
                System.out.print(Arr[i][j]);

            }
            System.out.println();
        }



        
        /* 
        int num=0;
        for(int i=0;i<num1.length;i++){
            num=num1[i];
            for(int j=0;j<num1.length;j++){
                if(num<num1[j]){
                    
                }
                else{
                    num=num1[j];
                }
            }
            num2[i]=num;
        }
        System.err.println("Unordered: ");
        System.out.print("[");
        for(int i=0;i<num1.length;i++){
                System.out.print(num1[i]+",");
        }
        System.out.println("]");
        System.err.println("Ordered: ");
        System.out.print("[");
        for(int i=0;i<num1.length;i++){
                System.out.print(num2[i]+",");
        }
        System.out.println("]");
        System.out.println("length: "+num1.length);
        */
    }
}
