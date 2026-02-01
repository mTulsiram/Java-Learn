public class ArgsJava {

    public static void main(String[] args){

        System.out.println(System.currentTimeMillis());
        for(String a : args){
            System.out.println(a);
        }

    }

}
