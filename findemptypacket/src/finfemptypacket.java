import java.util.*;

public class finfemptypacket {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k=0;
        int[] arr = new int[n];
        for (int i = 0; i <n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i <n; i++) {
                if(arr[i]!=0){
                  arr[k]=arr[i];
                  k++;
                }
        }
        for(int i=k;i<n;i++){
            arr[i]=0;
        }

            for (int i = 0; i < n; i++) {
                System.out.print(arr[i] + " ");
            }
        }
    }
