package pgrdevelopers.strutsforms.actions;

import com.opensymphony.xwork2.ActionSupport;

public class RegisterAction extends ActionSupport {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1176050329778450175L;

	String fullName;
	String email;
	String password;
	String confirmPassword;

	public String execute() {
		System.out.println("Inside Register Action execute method");
		return SUCCESS;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getConfirmPassword() {
		return confirmPassword;
	}

	public void setConfirmPassword(String confirmPassword) {
		this.confirmPassword = confirmPassword;
	}

	public void validate() {
		System.out.println("Validating...");
		System.out.println(fullName + " " + email + " " + password + " " + confirmPassword);
		if (password != null || confirmPassword != null) {
			if (!password.equals(confirmPassword)) {
				addFieldError("password", "Password does not matching!");
			}
		}
	}

}
