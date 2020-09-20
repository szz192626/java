package interfac;

public class TestPrinter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InKBox inKBox = null;
		Paper paper = null;
		Printer printer = new Printer();

		/* A4,彩色墨盒打印 */
		inKBox = new ColorInkBox();
		paper = new A4Paper();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("我们正走在正确的道路上！！");
		/* B5,彩色打印 */
		paper = new B5Paper();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("我们正走在正确的道路上！！");
		/* A4,黑白打印 */
		inKBox = new GrayInkBox();
		printer.setInk(inKBox);
		printer.setPaper(paper);
        printer.print("我们正走在正确的道路上！！");

	}

}
