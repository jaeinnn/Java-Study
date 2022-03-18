package java1;
import java.util.*;

/*
예제 7-4
예제 7-1 코드를 Iterator<Integer>를 이용하여 수정하라
 */

public class IteratorEx {
    public static void main(String[] args) {
        //정수 값만 다루는 제네릭 벡터 생성
        Vector<Integer> v = new Vector<>();
        v.add(5);
        v.add(4);
        v.add(-1);
        v.add(2,100);

        //Iterator를 이용한 모든 정수 출력하기
        Iterator<Integer> it = v.iterator(); //Iterator 객체 얻기
        while(it.hasNext()){ //while문은 벡터 v의 모든 정수 출력
            int n = it.next();
            System.out.println(n);
        }

        //Iterator를 이용하여 모든 정수 더하기
        int sum = 0;
        it = v.iterator(); //it 다시 설정
        while(it.hasNext()){
            int n = it.next();
            sum += n;
        }
        System.out.println("벡터에 있는 정수 합 : " + sum);
    }
}