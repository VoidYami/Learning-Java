

public class oop_Ex_8_3 {
    static class Tommy{
        public void hitting(){
            System.out.println("Hitting");
        }public void firing(){
            System.out.println("Firing");
        }public void Jump(){
            System.out.println("Jumping");
        }public void Running(){
            System.out.println("Running");
        }
    }

    public static void main(String[] args) {

        Tommy RG = new Tommy();
        RG.firing();
        RG.Jump();
        RG.Running();
        RG.hitting();

    }
}
