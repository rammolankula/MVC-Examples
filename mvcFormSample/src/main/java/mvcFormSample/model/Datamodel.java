package mvcFormSample.model;

import java.util.List;

import lombok.Data;

@Data
public class Datamodel {
	/* 
	 * MVC SAMPLE FOEM SHOW
	 * creating a model class for storing the data using .html or .jsp file
	 * branches should be list and colleges should be list and 
	 * Here i worked on 
	 * select drop down
	 * check box
	 * text data
	 * address box
	 * radio button
	 * date calendar
	 * */
	private Integer dataId;
	private String name;
	private String namesure;
	private String namerating;
	private List<String> branchNames;
	private List<String> colleges;
	private String date;
	private String address;
	private String gender;
}
