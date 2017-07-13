package com.Properties;

import java.util.ArrayList;
import java.util.List;



public class Properties {
	
	public String value;
	public List dropdownList = (List) new ArrayList<String>();
	public boolean isUpdatable;
	public boolean isSuppable;
	public boolean isDisplayed;
	public boolean isRequired;
	public String id;
	
	
	public String getValue() {
		return value;
	}
	public List getDropdownList() {
		return dropdownList;
	}
	public boolean isUpdatable() {
		return isUpdatable;
	}
	public boolean isSuppable() {
		return isSuppable;
	}
	public boolean isDisplayed() {
		return isDisplayed;
	}
	public boolean isRequired() {
		return isRequired;
	}
	public String getId() {
		return id;
	}
	public void setValue(String value) {
		this.value = value;
	}
	public void setDropdownList(List dropdownList) {
		this.dropdownList = dropdownList;
	}
	public void setUpdatable(boolean isUpdatable) {
		this.isUpdatable = isUpdatable;
	}
	public void setSuppable(boolean isSuppable) {
		this.isSuppable = isSuppable;
	}
	public void setDisplayed(boolean isDisplayed) {
		this.isDisplayed = isDisplayed;
	}
	public void setRequired(boolean isRequired) {
		this.isRequired = isRequired;
	}
	public void setId(String id) {
		this.id = id;
	}
	
	

}
