package src.springA.di.ui;

import src.springA.di.entity.Exam;

public class GridConsole implements ExamConsole {

	private Exam exam;
	
	
	
	public GridConsole(Exam exam) {
		//super();
		this.exam = exam;
	}



	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("----------------");
		System.out.println("total   |   avg   ");
		System.out.println(exam.total()+"       |   "+ exam.avg());

	}

}
