public class Integer_To_Roman {
    public static void main(String[] args) {
        int num=500;
        int values[]={1000,900,500,400,100,90,50,40,10,9,5,4,1};
        String Code[]={"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<values.length;i++){
            while(num>=values[i]){
                sb.append(Code[i]);
                num=num-values[i];
            }
        }
        System.out.println(sb.toString());
    }
}
