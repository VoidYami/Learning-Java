public class Nested_try_catch {

    public static void main(String[] args) {
        int[] marks = new int[3];
        marks[0] = 0;
        marks[1] = 1;
        marks[2] = 2;
        marks[3] = 3;

        try{
            System.out.println("learning new things");

            try{
                System.out.println(marks[9]);
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println(e);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
    }
}