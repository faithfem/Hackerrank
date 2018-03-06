public class Strings {

    public static void main(String[]args){

        //Scanner gonyo = new Scanner(System.in);
        String A = "Hello World!";
        String B = "Java, how u doing?";
        int length = A.length();
        int lengthB = B.length();

        System.out.println("Length of String A is " + length);
        System.out.println("Length of String B is " + lengthB);

        //1. SUM THE LENGTHS OF A & B
        //2. FIND THE LONGER STRING
        //3. CAPITALIZE THE FIRST LETTER IN A & B
        //4. PRINT THE CAPITALIZED FIRST LETTERS, SEPARATED BY A SPACE


        //1.Sum lengths of A & B
        System.out.println(A.length() + B.length());

        //2. Which is longer, A or B?
        int result = A.length() - B.length();

        if(result>0)
            System.out.println("A is larger than B");
        else if(result<0)
            System.out.println("A is smaller than B");
        else
            System.out.println("A is equal to B");


        //3.Capitalize first letter in A & B

        System.out.println(A.substring(0,1).toUpperCase());
        System.out.println(B.substring(0,1).toUpperCase());
    }

}
