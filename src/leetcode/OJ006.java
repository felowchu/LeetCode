package leetcode;

public class OJ006 {
	public static void main(String[] args){
		String s = "P A H N" + System.getProperty("line.separator") + "APLSIIG" +System.getProperty("line.separator") + "Y I R";
		convert(s,3);
		//System.out.println(convert(s, 3));
	}
	
	public static String convert(String s, int numRows){
		char[] c = s.toCharArray();
		int len = c.length;
		
		StringBuffer[] sb = new StringBuffer[numRows];
		for(int i = 0; i < sb.length; i++){
			sb[i] = new StringBuffer();
		}
		
		int j = 0;
		while(j < len){
			for(int index = 0; index < numRows && j < len; index++){
				sb[index].append(c[j++]);
			}
			for(int index = numRows-2; index >= 1 && j < len; index--){
				sb[index].append(c[j++]);
			}
		}
		
		for(int i = 1; i < numRows; i++){
			sb[0].append(sb[i].toString());
		}
		
		return sb[0].toString();
	}
}
