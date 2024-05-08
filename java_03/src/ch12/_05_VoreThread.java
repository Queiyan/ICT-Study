package ch12;

import java.util.Random;

public class _05_VoreThread implements Runnable{
	
	int sum = 0;		 			// 총 투표율
	int targetNum = 100; 			// 개표율 100%
	Random random = new Random();	// 개표율 속도
	
	@Override
	public void run() {
		// 별(*)모양의 그래프를 출력하기 위함 => 개표율을 *의 갯수로 출력
		StringBuffer sb = new StringBuffer();  
		while(true) {
			sum += random.nextInt(10); // 총개표율 : 10까지의 난수발생숫자를 누적
			sb.delete(0, sb.length()); // 그래프를 0으로 초가화, *의 길이만큼
			
			if(sum > targetNum) {
				sum = 100;
				for (int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
				break;
			} 
			else {
				for (int i = 0; i < sum; i++) {
					sb.append("*");
				}
				System.out.println(Thread.currentThread().getName() + " 개표율 : " + sum + "\t" + sb);
				
			}
			
			// 1000 : 1초 => cpu의 시간을 다른 쓰레드에게 넘겨주는 효율적인 방법이다. 현작업을 중지하고 넘겨준다.
			try {
				Thread.sleep(100); 
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			
			
		}
	}

}
