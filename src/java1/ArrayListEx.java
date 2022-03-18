package java1;
import javax.lang.model.type.ArrayType;
import java.util.*;
/*
예제 7-3
이름을 4개 입력받아 ArrayList에 저장하고
모두 출력한 후 제일 긴 이름을 출력하라
 */

public class ArrayListEx {
    public static void main(String[] args) {
        ArrayList<String> a = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        for(int i=0; i<4; i++){
            System.out.print("이름을 입력하세요>>");
            String s = scanner.next(); //키보드로부터 이름을 입력
            a.add(s); //ArrayList컬렉션에 삽입
        }

        for(int i=0; i<a.size(); i++){
            String name = a.get(i);
            System.out.print(name + " ");
        }

        int longestIndex = 0 ; //현재 가장 긴 이름이 있는 ArrayList내의 인덱스
        for(int i=0; i<a.size(); i++){
            if(a.get(longestIndex).length() < a.get(i).length()) //이름 길이 비교
                longestIndex = i; //i번째 이름이 더 긴 이름임
        }
        System.out.println("\n가장 긴 이름은 : " + a.get(longestIndex));

    }
}
