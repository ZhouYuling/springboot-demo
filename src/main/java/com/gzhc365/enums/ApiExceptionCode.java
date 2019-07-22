package com.gzhc365.enums;

public enum ApiExceptionCode {

	RESOURCE_NOT_FOUND(101, "App not found");

	private Integer value;

	private String desc;

	private ApiExceptionCode(Integer value, String desc) {
		this.value = value;
		this.desc = desc;
	}

	public Integer getValue() {
		return value;
	}

	public void setValue(Integer value) {
		this.value = value;
	}

	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

}
