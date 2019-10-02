import java.io.Serializable;

import com.emp.Employee;

public class Person implements Serializable {

	private static final long serialVersionUID = 1L;

	private String id;

    private String name;
    
    private Employee emp;

    public Employee getEmp() {
		return emp;
	}

	public void setEmp(Employee emp) {
		this.emp = emp;
	}

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

}
