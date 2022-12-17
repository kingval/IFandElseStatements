package D.IfandElse;

public class ElseIfStatement {

    public static void main(String[] args) {

        int i = 80;  // change to a lower value or higher value to see another outcome.
        int j = 80;  // change value to same as int i to see third print statement.
        if(i>j){
            System.out.println("i is Bigger than j");
        }else if (j>i){
            System.out.println("j is Bigger than i");
        }else {
            System.out.println("both are equal");

        }

    }
}
