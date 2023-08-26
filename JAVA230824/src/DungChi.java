import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DungChi {
	public static void main(String args[]) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();		
		
		int n = Integer.parseInt(br.readLine());
		
		List<Info> inputList = new ArrayList<>();

		for(int i=0; i<n; i++) {
			String inputArr[] = br.readLine().split(" ");
			int x = Integer.parseInt(inputArr[0]);
			int y = Integer.parseInt(inputArr[1]);
			Info info = new Info(x, y);
			inputList.add(info);
		}
		
        // Info 객체들의 x와 y 값을 비교하고 출력
		for(Info info : inputList) {
			int rank = 1;
			
			for(Info info2 : inputList) {
				if(info == info2) continue;
				if(info.getX() < info2.getX() && info.getY() < info2.getY()) {
					rank++;
				}
			}
            System.out.print(rank + " ");
        }
		
		// 아래의 방법처럼 stream을 사용해도 됨
//		for (Info info : inputList) {
//            long rank = inputList.stream()
//                    .filter(info2 -> info2.x > info.x && info2.y > info.y)
//                    .count() + 1;
//
//            System.out.print(rank + " ");
//        }
	}
	
	static class Info {
		int x; // 몸무게
		int y; // 키
		
		Info(int x, int y){
			this.x = x;
			this.y = y;
		}
		
		int getX() {
			return x;
		}
		
		void setX(int x) {
			this.x = x;
		}
		
		int getY() {
			return y;
		}
		
		void setY(int y) {
			this.y = y;
		}
	}
}
