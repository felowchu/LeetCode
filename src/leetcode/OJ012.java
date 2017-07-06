package leetcode;

public class OJ012 {
	public String intToRoman(int num) {
	       
		String s = "";
		
		while(num >= 900){
			if(num >= 1000){
				num = num -1000;
				s = s+"M";
			}
			if(900 <= num && num < 1000){
				num = num - 900;
				s= s+"CM";
			}
		}
		
		if(num >= 500){
			num = num - 500;
			s = s+"D";
		}
		
		if(num >= 400 && num < 500){
			num = num -400;
			s = s+"CD";
		}

		while(num >= 90){
			if(num >= 100){
				num = num - 100;
				s = s+"C";
			}
			if(num >= 90 && num < 100){
				num = num - 90;
				s = s+"XC";
			}
		}
		
		if(num >= 50){
			num = num - 50;
			s = s+"L";
		}
		
		if(num >= 40 && num < 50){
			num = num -40;
			s = s+"XL";
		}
		
		while(num >= 9){
			if(num >= 10){
				num = num - 10;
				s = s+"X";
			}
			if(num >= 9 && num < 10){
				num = num - 9;
				s = s+"IX";
			}
		}
		
		if(num >= 5){
			num = num - 5;
			s = s+"V";
		}
		
		if(num >= 4 && num < 5){
			num = num - 4;
			s = s+"IV";
		}
		
		while(num > 0){
			num--;
			s = s+"I";
		}
		return s;
    }
}
