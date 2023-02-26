import java.util.*;

public class S3Q2_64010475 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random random = new Random();
        char[] num = { '0', '1', '2', '3', '4', '5', '6', '7', '8', '9' };
        char[] character = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j' };
        char[] text = new char[10];
        int rand = random.nextInt(2);
        if (rand == 0) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    text[i] = num[random.nextInt(10)];
                }
                if (i % 2 != 0) {
                    text[i] = character[random.nextInt(10)];
                }
            }
        }
        if (rand == 1) {
            for (int i = 0; i < 10; i++) {
                if (i % 2 == 0) {
                    text[i] = character[random.nextInt(10)];
                }
                if (i % 2 != 0) {
                    text[i] = num[random.nextInt(10)];
                }
            }
        }
        System.out.print("Random character are : ");
        for (int i = 0; i < text.length; i++) {
            System.out.print(text[i] + " ");
        }
        System.out.println();
        System.out.print("Select group of character [1]character [2]numeric : ");
        int group = input.nextInt();
        if (group <= 2 && group >= 1) {
            char[] temp = new char[5];
            int count = 0;
            boolean notsame = false;
            if (group == 1) {
                for (int i = 0; i < text.length; i++) {
                    if (text[i] >= 'a' && text[i] <= 'j') {
                        temp[count] = text[i];
                        count++;
                    }
                }
                System.out.print("Character not in the list are : ");
                for (int i = 0; i < character.length; i++) {
                    for (int j = 0; j < temp.length; j++) {
                        if (character[i] != temp[j]) {
                            notsame = true;
                        } else {
                            notsame = false;
                            break;
                        }
                    }
                    if(notsame){
                        System.out.print(character[i] + " ");
                    }
                }
            }
            if (group == 2) {
                for (int i = 0; i < 10; i++) {
                    if (text[i] >= '0' && text[i] <= '9') {
                        temp[count] = text[i];
                        count++;
                    }
                }
                System.out.print("Numeric not in the list are : ");
                for (int i = 0; i < num.length; i++) {
                    for (int j = 0; j < temp.length; j++) {
                        if (num[i] != temp[j]) {
                            notsame = true;
                        } else {
                            notsame = false;
                            break;
                        }
                    }
                    if(notsame){
                        System.out.print(num[i] + " ");
                    }
                }
            }
        } else {
            System.err.println("Error, group must be 1 or 2.");
        }
        input.close();
    }
}
