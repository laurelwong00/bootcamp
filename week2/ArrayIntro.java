package week2;
public class ArrayIntro { //Array 陣列 
    public static void main(String[] args) {
        //9 types = Primitives + String
        int x = 2;
        String s = "abc";
        //Array store a set of same type of values
        int [] arr = new int[4];
        //Assign a value to the int array
        //Array内容不能改，size不能改, 可以選擇一開始開大少少先
        //可以移資料, 開個新array, for loop逐個搬過去, 但係好麻煩
        arr [0] = 100;
        arr [1] = 1000;
        arr [2] = 10000;
        arr [3] = 1000000; //max is 3 when size is 4
        System.out.println(arr[0]);

        arr = new int [5]; //create another new int array to the original variable
        //old one no more
        System.out.println(arr[0]); //int default value = 0
        arr [0] += 10; //0+10 = 10
        arr [0] *= 2; //10*2 = 20
        
        long[][][] arr2 = new long [1][2][3];
        String[][] strings = {{"hello"},{"Capybara"}}; //String唔改得
        //strings in stack, array in heap;

        String[] Strings = new String[3];
        Strings[0] = "abc"; //
        Strings[1] = "hello";
        Strings[2] = "xyz";
        
        Strings[0] += "def"; //"abc"將會消失, 新仔"abcdef" String[0]要
        Strings[1] = Strings[2];//Strings[1]地址 變埋 Strings[2]地址, 兩個都指住"xyz", "hello"將會消失
        
        if ("abcdef".equals(Strings[0])) { //記住value放equals前面
            System.out.println("yay");
        }

        String [] backup = 

        Strings = new String[4];
        Strings [1] = "mvn"; //strings default value is null

        int[] integers = new int[10]; //int default value is 0
        //default value of boolean is false 
        //default value of char is '\u0000'

        char c3 = 'a';
        System.out.println(c3); //a
        System.out.println(c3 > 97); //false
        System.out.println(c3 > 96); //true

        if (c3 == 97) {//'a' convert to int (ASCII code)
            System.out.println("c3 is 97 in ASCII code");
        }
        if (c3 >= 'a') {//'a' convert to int (ASCII code)
            System.out.println("c3 is a char a");
        }
        //The way to declare and assign String value
        String s3 = "abc"; //"abc" is a string object in heal
        String s4 = new String("abc"); //this "abc" is another new string object in heap
        String s5 = "abc"; //this "abc" object is same as the one in s3 沒開new, java會 s3 s5都導向"abc" save memory
        String s6 = new String("abc"); //this "abc" is another new string object

        //
        String [] strings2 = new String[3];
        strings2[0] = "hello1";
        strings2[1] = "hello2";
        strings2[2] = "hello3";
        //
        String[] strings3 = new String[] {"hello", "hello", "hello"}; //imply length = 3
        
        for (int i = 0; i < strings2.length; i++) { // array length no .()
            System.out.println(strings2[i]);
        }

    }
}
