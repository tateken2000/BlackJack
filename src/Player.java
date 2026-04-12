import java.util.Scanner;

public class Player {

    private Scanner scanner = new Scanner(System.in);
    public boolean wantHit(){
        System.out.println("hit or stand(h/s)");
        String input = scanner.nextLine();
        return input.equals("h");
    }
}
