import java.util.Scanner;
public class VowelsCount {
   public static void main(String args[]){
      int flag = 0;
      System.out.println("Enter a sentence :");
      Scanner sc = new Scanner(System.in);
      String sentence = sc.nextLine();

      for (int i=0 ; i<sentence.length(); i++){
         char ch = sentence.charAt(i);
         if(ch == 'a'|| ch == 'e'|| ch == 'i' ||ch == 'o' ||ch == 'u'||ch == ' '){
            flag ++;
         }
      }
      System.out.println("Number of vowels in the given sentence is "+flag);
   }
}
