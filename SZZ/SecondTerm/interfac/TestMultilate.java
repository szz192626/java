package interfac;

public class TestMultilate {

	public static void main(String[] args) {
	MultilateralFunctions multilateralFunctions1=new Circular(3.5, "Բ��");
    multilateralFunctions1.area();
    multilateralFunctions1.girth();
    MultilateralFunctions multilateralFunctions2=new Square(5.5, "������");
    multilateralFunctions2.area();
    multilateralFunctions2.girth();
    MultilateralFunctions multilateralFunctions3=new Triangle2("������", 4, 3, 5, 6);
    multilateralFunctions3.area();
    multilateralFunctions3.girth();
	}

}