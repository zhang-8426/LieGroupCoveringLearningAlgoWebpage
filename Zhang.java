import java.util.*;
public class Zhang {
    public static boolean examine(String s1) {
    	String s=s1.replaceAll("[^0-9a-zA-Z]+", "");    //ȥ����������ĸ��ĸ��ַ���
    	
    	char[] chr = s.toCharArray();
    	char[] chr2=new char[chr.length];
    	int count=0;
    	boolean answer=true;
    	for(int i=chr.length-1;i>=0;i--) {
    		chr2[count]=chr[i];
    		count+=1;
    	}
        String v=new String();
        for (int n=0;n<chr2.length;n++) {
        	v+=chr2[n];                                     //��Ŀ���ַ�������
        }
        
        if (v.equals(s) ){                             //�������ַ����Ƚ�
        	answer=true;
        }
        else  {
        	answer=false;
        }
    return answer;
    }
    
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("�������ַ���");
              Scanner input=new Scanner(System.in);
              String s=input.next();
              
              boolean a=examine(s);
              System.out.println(a);
	}

}
