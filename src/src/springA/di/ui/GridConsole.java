package src.springA.di.ui;

import org.springframework.stereotype.Repository;

import src.springA.di.entity.Exam;

@Repository
public class GridConsole implements ExamConsole {

	private Exam exam;
	
	
	
	public GridConsole(Exam exam) {
		//super();
		this.exam = exam;
	}

	public GridConsole() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public void print() {
		// TODO Auto-generated method stub
		
		System.out.println("----------------");
		System.out.println("total   |   avg   ");
		System.out.println(exam.total()+"       |   "+ exam.avg());

	}



	@Override
	public void setExam(Exam exam) {
		// TODO Auto-generated method stub
		this.exam = exam;
	}
	
	
	

}
