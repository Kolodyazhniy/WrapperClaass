
public class WClaass {
  public static void main (String[] args){	
	int i = 128;//�������� �� 127 !!! 
	Integer oa = i; //�������� �������+�������� 
	Integer ob = i;
	System.out.println ("oa==i " + (oa == i));// true
	System.out.println("ob==i " + (ob == i));// true
	System.out.println("oa==ob " + (oa == ob));// false(������ ������)
	System.out.println("equals ->" + oa.equals(i) 
			+ ob.equals(i) 
			+ oa.equals(ob));// true
	
	
}

}