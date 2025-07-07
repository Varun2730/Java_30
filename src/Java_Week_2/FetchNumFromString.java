package Java_Week_2;

public class FetchNumFromString {
    public static void main(String[] args) {

        String str = "abc bfc brrb we 0 0 djds 9 jjkfd";
        int  count =0;

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) >= '0' && str.charAt(i) <= '9'){
                count++;

            }
//            System.out.print(str.charAt(i));

        }

        System.out.println(count);
    }
}
