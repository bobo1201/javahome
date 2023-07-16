package ch05;

import java.time.LocalDateTime;

public class DateChange {		
    public static void main(String[] args) {
    	LocalDateTime now = LocalDateTime.now();
    	
    	int a = now.getDayOfWeek().getValue();
    	
    	System.out.println(a);
    	
    	System.out.println(twelveOrder(now, 1));
    	
	}
    
    // ch1 {1.�����, 2.�渶��, 3.���� �����, 4.�Ž� �����, 5.�ݶ��, 6.������, 7.��ƽ�Ŀ�ġ, 8.�ڽ�}
    // ch1 : 1, 2���� ��
    // 12�� ���� �ֹ���
    // 1.��(+2) �� ��,  2.ȭ(+3),��(+2) �� ��,  3.��(+4) �� ��,  4.��(+5) �� ��
    static private LocalDateTime twelveOrder(LocalDateTime now, int ch1) {
        // 1.��, 2. ȭ, 3.��, 4.��, 5.��, 6.��, 7.��
        int day = now.getDayOfWeek().getValue();
        LocalDateTime chDate;

        // ��, �Ͽ����̸� ��¥�� 2�� ���ϰ�
        if(day > 5) {
            now.plusDays(2);
        }

        // ��, �ݿ����̸� +day
        if(day > 3) {
            chDate = now.plusDays(day);
        } else {
            // �������̸� +2
            if(day == 3) {
                chDate = now.plusDays(day-1);
                // ��, ȭ�����̸� +2, +3
            } else {
                chDate = now.plusDays(day+1);
            }
        }
        return chDate;
    }
}