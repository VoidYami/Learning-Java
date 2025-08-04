   

public class oop_contructor {

    static class MY_my{
        private int id;
        private String name;


        public MY_my(String myName , int myId) {
            id = myId;
//            name = "what your name";
            name = myName;
        }

        public String getName(){
            return name;
        }
        public void setName(String n){
            this.name = n;
        }

        public int setId(){
            return id;
        }
        public void getId(int i){
            id = i;
        }


    }
    public static void main(String[] args) {
        MY_my Dark = new MY_my("VoidYami", 32);
        System.out.println(Dark.getName());

        int v = Dark.id;

        System.out.println(v);

    }
}
