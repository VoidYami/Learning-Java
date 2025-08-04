interface TvRemote{
    void buttons();
}

interface SmartTvRemote extends TvRemote{
    void voice(); 

}

class TV implements SmartTvRemote{
    @Override
    public void voice() {
       System.out.println("Voice assistance");
        
    }
    @Override
    public void buttons() {
        System.out.println("simple buttons");
        
    }
}

public class oop_ex_11_3 {
    public static void main(String[] args) {
        SmartTvRemote myTv = new TV();
        myTv.buttons();
        myTv.voice();
        
    }
}
