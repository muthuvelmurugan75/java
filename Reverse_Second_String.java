package tricky;

public class Reverse_Second_String {

	public static void main(String[] args) {
		char ch;
		String given="muthuvel developer";
		String r="",l="",m="";
		String[] store=given.split(" ");
		for(int i=0;i<store.length;i++){
			if(i==1){
				r=store[i];
				}
			}
		for(int i=r.length()-1;i>=0;i--){
			ch=r.charAt(i);
			l+=ch;
			}
		for(int i=0;i<store.length;i++){
			if(i==0){
				m=store[i]+l;
				}
			for(int i1=l.length();i1<0;i1--){
				char c=l.charAt(i1);
				m+=c;
				}
			r=r+" ";
			}
		System.out.println(m);
		}
	}
