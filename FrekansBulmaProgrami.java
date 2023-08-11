import java.util.Arrays;
import java.util.List;

public class FrekansBulmaProgrami {
    public static void main(String[] args) {
        int[] List = {10, 20, 20, 10, 10, 20, 5, 20};

        Arrays.sort(List);
        int count = 1
                ;
        for (int i = 1; i < List.length; i++){
            System.out.println(List[i]);
            System.out.println(List[i-1]);
            if (List[i] == List[i - 1]){
                count++;
            }else {
                System.out.println(List[i -1] + " Sayısı " + count + " Kere tekrar edildi");
                count = 1;
            }
        }
        System.out.println(List[List.length - 1] + " Sayısı " + count + " Kere tekrar edildi");
    }
}
