import java.util.*;
 
class Main {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int matrix_array[][] = new int[256][256];
        for(int i=0;i<256;i++){
            for(int j=0;j<256;j++){
                matrix_array[i][j] = sc.nextInt();
            }
        }
       int rows1 = 0;
       int rows2 = 0;
       int cols1 = 0;
      int  cols2 = 0;
        for(int i=0;i<256;i++){
            boolean flag = true;
            for(int j=0;j<256;j++){
                if(matrix_array[i][j]==0){
                    rows1=i;
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
            flag = true;
        }
        for(int i=0;i<256;i++){
            boolean flag = true;
            for(int j=0;j<256;j++){
                if(matrix_array[j][i]==0){
                    cols1=i;
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        for(int i=255;i<rows1;i--){
            boolean flag = true;
            for(int j=0;j<256;j++){
                if(matrix_array[j][i]==0){
                    rows2=i;
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        for(int i=255;i<cols1;i--){
            boolean flag = true;
            for(int j=0;j<256;j++){
                if(matrix_array[j][i]==0){
                    cols2=i;
                    flag = false;
                    break;
                }
            }
            if(flag==false){
                break;
            }
        }
        System.out.println("("+rows1+", "+cols1+"), ("+rows1+", "+cols2+"), ("+rows2+", "+cols1+"), ("+rows2+", "+cols2+")");
        
    }
}