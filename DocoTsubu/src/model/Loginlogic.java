package model;

public class Loginlogic {
	public boolean execute(User user){
		if(user.getPass().equals("1234")){
			return true;
		}
		return false;

	}

}
