package src.springA.di;


import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import src.springA.di.entity.Exam;
import src.springA.di.entity.NewlecExam;
import src.springA.di.ui.ExamConsole;
import src.springA.di.ui.GridConsole;
import src.springA.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		/* ���������� �����ϴ� ������� �ڵ带 ����(���� �� ����[������ ������])
	    Exam exam = new NewlecExam(); 
		ExamConsole console = new InlineExamConsole(exam); // DI
		//ExamConsole console = new GridConsole(exam);
		console.setter(exam);
		*/
		
		ApplicationContext context = new ClassPathXmlApplicationContext("src/springA/di/setting.xml");
		//���ü��� ã�Ƽ� ��ü�� �����. context�� IoC�� �ȴ�.
		
		ExamConsole console = (ExamConsole) context.getBean("console");// ���1
		//ExamConsole console = context.getBean(ExamConsole.class);// ��� 2
		console.print();
		//����, InlineExam ��� Grid�� ����ϰ� ������ setting.xml(DI ���ü�) ���� Ŭ������ �ٲ��ָ�ȴ�.
		//�� java code ���� �ʿ� ����.
	}
	//https://www.youtube.com/watch?v=gtqctgfywn4
	//https://www.youtube.com/watch?v=R_6fW1tVj8Y
}
