package interfac;

public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InKBox inKBox = null;
		Paper paper = null;
		Printer printer = new Printer();

		/* A4,��ɫī�д�ӡ */
		inKBox = new ColorInkBox();
		paper = new A4Paper();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("������������ȷ�ĵ�·�ϣ���");
		/* B5,��ɫ��ӡ */
		paper = new B5Paper();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("������������ȷ�ĵ�·�ϣ���");
		/* A4,�ڰ״�ӡ */
		inKBox = new GrayInkBox();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("������������ȷ�ĵ�·�ϣ���");

	}

}
