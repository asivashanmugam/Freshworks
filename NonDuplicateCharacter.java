import java.util.*;
public class MyClass {
      
      /**
       * Until the character repeats print the same character again and again
       * When duplicates, print the next non-duplicate character.
       * E.x. For Input [a,b,c,b,a] , print [a,a,a,a,c]
       * E.x. For Input [a,b,c,d,a,b] , print [a,a,a,a,b,c]
       * */
    public static void main(String args[]) {
      char[] inputArray = {'a','b','c','b','a'};
      char temp = 0;
      
      int length = inputArray.length;
      List<Character> myList = new ArrayList();
      List<Character> output = new ArrayList();
      for(int i = 0 ; i < length ; i++){
          if (i == 0){
             temp =  inputArray[i];
             output.add(temp);
             continue;
          }
          char input = inputArray[i];
          
           if(temp != input){
               
               if(myList.contains(input)){
                   myList.remove(new Character(input));
               } else {
                    myList.add(input);
               }
            } else {
                temp = myList.get(0);
                 myList.remove(new Character(temp));
            }
             output.add(temp);
      }
      
          System.out.println("OUTPUT :: " + output.toString());
    }
}
