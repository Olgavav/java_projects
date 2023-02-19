// Реализуйте алгоритм сортировки пузырьком числового массива, 
//результат после каждой итерации запишите в лог-файл.

// Плучилось только записать в файл сразу измененый массив
import java.io.FileWriter;
import java.io.IOException;


public class Task1 {
    public static void main(String[] args) {
        StringBuilder stringBuilder = new StringBuilder();
        
        int[] sortArr = {12, 6, 4, 1, 15, 10};
        
        bubbleSort(sortArr);
        for(int i = 0; i < sortArr.length; i++){
            stringBuilder.append(sortArr[i] + " ");
        }
        FileWriter fileWriter = null;
        String filePath = "Faile.txt";
        try{
            
            fileWriter = new FileWriter(filePath);
            fileWriter.write(stringBuilder.toString());
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{fileWriter.close();
            }catch(IOException e){
                e.printStackTrace();
            }
            

        }
    }
    public static void bubbleSort(int[] sortArr){
        for (int i = 0; i < sortArr.length - 1; i++) {
            for(int j = 0; j < sortArr.length - i - 1; j++) {
                if(sortArr[j + 1] < sortArr[j]) {
                    int swap = sortArr[j];
                    sortArr[j] = sortArr[j + 1];
                    sortArr[j + 1] = swap;
                    }
                }
            }
        }
    
    
}
        
        
        