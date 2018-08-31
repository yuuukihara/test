package model;

public class HealthCheckLogin {
	public void execute(Health health){
		double weight = health.getWeight();
		double height = health.getHeight();
		double bmi = weight/(height/100.0*height/100.0);
		health.setBMI(bmi);

		String bodyType;

		if(bmi<18.5){
			bodyType="痩せ型";
		}else if(bmi<25.){
			bodyType="普通";
		}else{
			bodyType="太り気味";
		}
		health.setBodyType(bodyType);
	}

}
