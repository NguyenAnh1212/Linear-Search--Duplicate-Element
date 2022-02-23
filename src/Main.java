import java.util.Scanner;

public class Main{
    // trong một mảng a có n phần tử tìm phần tử duplicate.
        public static int findDuplicate(int[] a,int n){
            for(int i=0;i<=n;i++){
                for(int j=i+1;j<=n;j++){
                    if(a[i]==a[j]){
                        return a[i];
                    }
                }
            }
            return -1;
        }
        public static void main(String[] args) {
            Scanner sc= new Scanner(System.in);
            int n = sc.nextInt();
            System.out.println("số phần tử có trong mảng:" + (n+1));
            int[] a = new int[n+1];
            // lặp tạo mảng
            for(int i=0;i<n+1;i++){
                System.out.println("Element " +(i+1));
                a[i] = sc.nextInt();
            }
            int ans = findDuplicate(a,n);
            System.out.println("Duplicate element is: "+ans);
        }







    }




