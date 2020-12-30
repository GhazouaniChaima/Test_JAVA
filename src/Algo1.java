import java.util.Arrays;
public class Algo1 {

    public static int[] solution(int N, int[] A) {
        // write your code in Java SE 8
        int size = A.length;
        int [] res = new int[N];
        int max = 0;
        for(int i=0;i<size;i++){
            if(A[i]==N+1){
                if(i>1 && A[i]==A[i-1]){ // handle {max,max,max,max} array
                    continue;
                }
                for(int j=0,sizeJ=res.length;j<sizeJ;j++){
                    res[j] = max;
                }
            }else{
                res[A[i]-1]=res[A[i]-1]+1;
                max = Math.max(max, res[A[i]-1]);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        int [] a = {3,4,4,6,1,4,4};
        System.out.println(Arrays.toString(solution(5, a)));
    }
}




