import java.util.*;

public class ExercisePlan {

	private AdjacencyListMatrix<Exercise> dailyExercises;
	private Exercise E[];
	private int burnedCals;

	public ExercisePlan() {
		burnedCals = 0;
		Exercise Aerobics = new Exercise("Aerobics", 144);
		Exercise weightLifting = new Exercise("Weight Lifting", 108);
		Exercise Stretching = new Exercise("Stretching", 144);
		Exercise Calisthenics = new Exercise("Calisthenics", 162);
		Exercise stairStepMachine = new Exercise("Stair Step Machine", 216);
		Exercise Bicycling = new Exercise("Bicycling", 252);
		Exercise ellipticalTrainer = new Exercise("Elliptical Trainer", 324);
		Exercise Walking = new Exercise("Walking", 133);
		Exercise Running = new Exercise("Running", 288);
		Exercise ropeJumping = new Exercise("Rope Jumping", 281);
		E = new Exercise[10];
		E[0] = Aerobics;
		E[1] = weightLifting;
		E[2] = Stretching;
		E[3] = Calisthenics;
		E[4] = stairStepMachine;
		E[5] = Bicycling;
		E[6] = ellipticalTrainer;
		E[7] = Walking;
		E[8] = Running;
		E[9] = ropeJumping;
		dailyExercises = new AdjacencyListMatrix<>(20, true, E);
		dailyExercises.insert(new Edge<Exercise>(Aerobics, Walking));
		dailyExercises.insert(new Edge<Exercise>(Walking, Stretching));
		dailyExercises.insert(new Edge<Exercise>(Walking, ellipticalTrainer));
		dailyExercises.insert(new Edge<Exercise>(ellipticalTrainer, ropeJumping));
		dailyExercises.insert(new Edge<Exercise>(Calisthenics, Bicycling));
		dailyExercises.insert(new Edge<Exercise>(Bicycling, Aerobics));
		dailyExercises.insert(new Edge<Exercise>(Running, stairStepMachine));
		dailyExercises.insert(new Edge<Exercise>(stairStepMachine, weightLifting));
	}

	public AdjacencyListMatrix<Exercise> getDailyExercises() {
		return dailyExercises;
	}

	public void setDailyExercises(AdjacencyListMatrix<Exercise> dailyExercises) {
		this.dailyExercises = dailyExercises;
	}

	public void getDaily()
	{
		Random rand = new Random();
		int r = rand.nextInt(10);
		Iterator<Exercise> itr = dailyExercises.edgeIterator(E[r]);
		Iterator<Exercise> itr2 = dailyExercises.edgeIterator(E[r]);
		while(itr.hasNext() && itr2.hasNext())
		{
			System.out.println(itr.next().toString());
			burnedCals += itr2.next().getCal();
		}
	}

	public int ExerciseStatistics()
	{
		return burnedCals;
	}

}
