import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Solution {

    private static int count;

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ArrayList<String> list = new ArrayList<String>();
        double x;
        while (true) {
            System.out.print("������� ���������� �����: ");
            x = Double.parseDouble(reader.readLine());
            if (x <= 0 || x % 1 != 0 ) {
                System.out.println("������� ����� ����� ������ 0");
                continue;
            }
            break;
        }
        System.out.print("������� �����: ");
        String word = reader.readLine();

        for (int i = 1; i <= x; i++) {
            System.out.print("������� ������ " + i + ": ");
            String str = reader.readLine();
            list.add(str);
        }

        System.out.println("����� ����� ���������");


        for (int i = 0; i < list.size(); i++) {
            System.out.print("������ " + (i+1) + ": " );
            ifHave(list.get(i),word);
        }

        System.out.println("���� � ������: " + count);

    }

    public static void ifHave(String str, String word){
        int z = str.indexOf(word);
        while(z >= 0){
            count++;
            z = str.indexOf(word,z+1);
        }
        String fixed = str.replaceAll(word,"");
        System.out.println(fixed);
    }
}
