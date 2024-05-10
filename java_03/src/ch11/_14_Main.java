package ch11;

public class _14_Main {
	public static void main(String[] args) {
		System.out.println(_14_Week.SUN); //SUN
		System.out.println(_14_Week.SAT.ordinal()); // 6
		
		System.out.println();
		
		// switch case를 이용해서 요일 출력	
		String week = " ";
		
		switch (_14_Week.SAT.ordinal()) { // 인덱스
		case 0:
			week = "일요일";
			break;

		case 1:
			week = "월요일";
			break;
		case 2:
			week = "화요일";
			break;
		case 3:
			week = "수요일";
			break;
		case 4:
			week = "목요일";
			break;
		case 5:
			week = "금요일";
			break;
		case 6:
			week = "토요일";
			break;
		}
		System.out.println("요일 : " + week); // 요일 : 토요일
		System.out.println();
		
		switch (_14_Week.SAT) { // 상수
		case SUN:
			week = "일요일";
			break;

		case MON:
			week = "월요일";
			break;
		case THUS:
			week = "화요일";
			break;
		case WED:
			week = "수요일";
			break;
		case THR:
			week = "목요일";
			break;
		case FRI:
			week = "금요일";
			break;
		case SAT:
			week = "토요일";
			break;
		}
		System.out.println("요일 : " + week); // 요일 : 토요일
		System.out.println();
		
		
	}

}
