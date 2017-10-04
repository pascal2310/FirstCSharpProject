import TodoList.Task;

import java.util.*;

public class Collections {
    public static void main(String[] args) {
        /* p15.1 en 15.2
        LinkedList<String> employeeNames = makeEmployeeList();
        System.out.println(employeeNames);
        downsize(employeeNames, 2);
        System.out.println(employeeNames);
        reverse(employeeNames);
        System.out.println(employeeNames);
        */

        /*p15.3
        reverseAllSentences("This is how I tried to split a paragraph into a sentence. But, there is a problem. My paragraph includes dates like Jan 13, 2014 , words like US and numbers like 2,2 They all got split by the above code.");
        */

        /* p15.4
    breakNumbers(91352153);
    */

//        commandDriveway();

   }



   public static void commandDriveway(){
       System.out.println("voer een auto in");
        Scanner scanner = new Scanner(System.in);
        while(scanner.hasNext())
        ownDriveWay(scanner.nextInt());
   }




    public static void ownDriveWay(int input) {
        Stack<Integer> driveWay = new Stack<>();
        Stack<Integer> street = new Stack<>();
        // add car to driveway

            if (input > 0) {
                driveWay.add(input);
            } // remove car
            if (input < 0) {
                input = input * -1;
                while (!driveWay.isEmpty()) {
                    if(driveWay.peek() != input)
                    street.push(driveWay.pop());
                }
                driveWay.pop();
                while (!street.isEmpty()) {
                    driveWay.push(street.pop());
                }
            }


            if (input == 0) {
                System.out.println(driveWay);
                return;
            }
        }


//p15.4
    public static void breakNumbers(int number){
        Stack<Integer> integers = new Stack<Integer>();
        while(number !=0){
            integers.push(number%10);
            number = number/10;

        }
        while(integers.size()!= 0){
            System.out.print(integers.pop() + " ");
        }

    }

//p15.2
    public static void reverse(LinkedList<String> strings){
        Stack<String> stack = new Stack<>();
        for (String s : strings){
            stack.push(s);
        }
        strings.clear();

        while(stack.size() != 0){
            strings.addLast(stack.pop());
        }
    }

// p15.3
    public static String reverseSentence(String input){
        Stack<String> sentence = new Stack<>();
        String[] array = input.split("\\s+");
        for (String s : array){
            if(!s.isEmpty()){
                String a =s.toLowerCase();
                sentence.push(a);
            }


        }
        System.out.println(sentence);
        String reversed = "";

        while(sentence.size() != 0){
            reversed += sentence.pop()+ " ";
        }
        reversed = makeFirstLetterCapital(reversed);
        reversed = addDotAndRemoveSpace(reversed);
        return reversed;
    }

    public static String makeFirstLetterCapital(String s){
        String firstLetter = s.substring(0,1);
        String restString = s.substring(1);

        return firstLetter.toUpperCase() + restString;
    }

    public static String addDotAndRemoveSpace(String s){
        String withoutSpace = s.substring(0, s.length()-1);
        return withoutSpace + ".";
    }

    public static void reverseAllSentences(String s){

        List<String> list = new ArrayList<>();
        String[] array = s.split("\\.|\\?|\\!");

        //to arraylist
        for (String a : array){
            list.add(reverseSentence(a));


        }

        //print reversed arraylist
        for (String a :list){
            System.out.println(a);
        }
    }


    public static LinkedList<String> makeEmployeeList(){
        LinkedList<String> employeeNames = new LinkedList<>();
        employeeNames.add("henk");
        employeeNames.add("frits");
        employeeNames.add("harry");
        employeeNames.add("piet");
        employeeNames.add("bud");
    return employeeNames;
    }

//p15.1
    public static void downsize(LinkedList<String> employeeNames, int n){
        //remove every n'th element from the linked list
        int counter = 1;
        ListIterator iterator = employeeNames.listIterator();
        while(iterator.hasNext()){
            iterator.next();
            if(counter%n ==0 || counter == n){
                iterator.remove();
                counter++;
            }
            else{
                counter++;
            }
        }

    }
}

