package interfac;

public class Printer {
   private InKBox ink=null;
   private Paper paper=null;
public InKBox getInk() {
	return ink;
}
public void setInk(InKBox ink) {
	this.ink = ink;
}
public Paper getPaper() {
	return paper;
}
public void setPaper(Paper paper) {
	this.paper = paper;
}
public Printer() {
	
}
public Printer(InKBox ink,Paper paper) {
	this.ink=ink;
	this.paper=paper;
	
	
	
}
public void print(String content) {
	System.out.println("-------------");
	System.out.println("��ӡ������ʹ��("
    +ink.getInKBox()+","
    +paper.getPaper()+")��ӡ"
    +"  ["+content+"]");
}
}
