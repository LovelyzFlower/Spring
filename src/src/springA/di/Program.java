package src.springA.di;


import src.springA.di.entity.Exam;
import src.springA.di.entity.NewlecExam;
import src.springA.di.ui.ExamConsole;
import src.springA.di.ui.GridConsole;
import src.springA.di.ui.InlineExamConsole;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Exam exam = new NewlecExam();
		ExamConsole console = new InlineExamConsole(exam); // DI
		//ExamConsole console = new GridConsole(exam);
		console.print();
	}
//https://www.youtube.com/watch?v=gtqctgfywn4
}
