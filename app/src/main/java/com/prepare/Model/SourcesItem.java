package com.prepare.Model;

import com.google.gson.annotations.SerializedName;

public class SourcesItem{

	@SerializedName("country")
	private String country;

	@SerializedName("name")
	private String name;

	@SerializedName("description")
	private String description;

	@SerializedName("language")
	private String language;

	@SerializedName("id")
	private String id;

	@SerializedName("category")
	private String category;

	@SerializedName("url")
	private String url;

	public String getCountry(){
		return country;
	}

	public String getName(){
		return name;
	}

	public String getDescription(){
		return description;
	}

	public String getLanguage(){
		return language;
	}

	public String getId(){
		return id;
	}

	public String getCategory(){
		return category;
	}

	public String getUrl(){
		return url;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public void setId(String id) {
		this.id = id;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public void setUrl(String url) {
		this.url = url;
	}
}