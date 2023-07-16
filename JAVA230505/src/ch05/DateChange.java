package ch05;

import java.time.LocalDateTime;

public class DateChange {		
    public static void main(String[] args) {
    	LocalDateTime now = LocalDateTime.now();
    	
    	int a = now.getDayOfWeek().getValue();
    	
    	System.out.println(a);
    	
    	System.out.println(twelveOrder(now, 1));
    	
	}
    
    // ch1 {1.양배추, 2.흑마늘, 3.석류 농축액, 4.매실 농축액, 5.콜라겐, 6.포장지, 7.스틱파우치, 8.박스}
    // ch1 : 1, 2번일 때
    // 12시 직전 주문시
    // 1.월(+2) → 수,  2.화(+3),수(+2) → 금,  3.목(+4) → 월,  4.금(+5) → 수
    static private LocalDateTime twelveOrder(LocalDateTime now, int ch1) {
        // 1.월, 2. 화, 3.수, 4.목, 5.금, 6.토, 7.일
        int day = now.getDayOfWeek().getValue();
        LocalDateTime chDate;

        // 토, 일요일이면 날짜를 2일 더하고
        if(day > 5) {
            now.plusDays(2);
        }

        // 목, 금요일이면 +day
        if(day > 3) {
            chDate = now.plusDays(day);
        } else {
            // 수요일이면 +2
            if(day == 3) {
                chDate = now.plusDays(day-1);
                // 월, 화요일이면 +2, +3
            } else {
                chDate = now.plusDays(day+1);
            }
        }
        return chDate;
    }
}