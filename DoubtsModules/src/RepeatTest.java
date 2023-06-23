public class RepeatTest {
    public static void main(String[] args) {
        System.out.println(print(2));
    }

    public static String print(int level){
        String ret;
        ret=" ".repeat(level)+"raja"+"\n";
//        for(int i=0;i<5;i++){
//            ret+= print(level+1);
//
//        }
        return ret;
    }

}