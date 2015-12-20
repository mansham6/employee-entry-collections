/**
 *   File Name: AbstractPerson.java<br>
 *
 *   LastName, FirstName<br>
 *   Java Boot Camp Exercise<br>
 *   Instructor: Jean-francois Nepton<br>
 *   Created: Dec 19, 2015
 *
 */

package com.sqa.ms.employees;

/**
 * AbstractPerson //ADDD (description of class)
 * <p>
 * //ADDD (description of core fields)
 * <p>
 * //ADDD (description of core methods)
 *
 * @author LastName, FirstName
 * @version 1.0.0
 * @since 1.0
 *
 */
public class AbstractPerson implements IPerson {

	/**
	 * @see com.sqa.ms.employees.IPerson#getName()
	 */
	private String name;
	private int age;
	private String address;

	/**
	 * @return the address
	 */
	public String getAddress() {
		return address;
	}

	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}

	/**
	 * @return the name
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * @see com.sqa.ms.employees.IPerson#move()
	 */
	@Override
	public boolean move() {
		// TODO Auto-generated method stub
		return false;
	}

	/**
	 * @param address
	 *            the address to set
	 */
	public void setAddress(String address) {
		this.address = address;
	}

	/**
	 * @param age
	 *            the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	/**
	 * @param name
	 *            the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Class:");
		builder.append(this.getClass().getSimpleName());
		builder.append(" who lives at ");
		builder.append(address);
		builder.append(" and is only ");
		builder.append(age);
		builder.append(" years old, Welcome ");
		builder.append(name);
		builder.append("!");
		return builder.toString();
	}

}
