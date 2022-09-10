public class multiplyScreen {

    public static void main(){
        try {
            inputNums.displayScreen();
        }catch (InterruptedException e){
            throw new RuntimeException(e);
        }
    }
}
