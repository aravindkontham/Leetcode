public class Coin_Exchange {
    public static int minCoins(int coins[],int m,int v){
        int table[]=new int[v+1];
        table[0]=0;
        for(int i=1;i<=v;i++){
            table[i]=Integer.MAX_VALUE;
        }
        for(int i=1;i<=v;i++){
            for(int j=0;j<m;j++){
                if(coins[j]<=i){
                    int sub_res=table[i-coins[j]];
                    if(sub_res!=Integer.MAX_VALUE && sub_res+1<table[i])
                        table[i]=sub_res+1;
                }
            }
        }
        if(table[v]==Integer.MAX_VALUE)
            return -1;
        return table[v];
    }
    public static void main(String[] args) {
        int coins[]={9,6,5,1};
        int sum=22;
        int result=minCoins(coins,coins.length,sum);
        System.out.println(result);
    }
}
