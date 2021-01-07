package com.prepare.Model;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class CategorySourceResponse{

	@SerializedName("sources")
	private List<SourcesItem> sources;

	@SerializedName("status")
	private String status;

	public List<SourcesItem> getSources(){
		return sources;
	}

	public String getStatus(){
		return status;
	}

	public void setSources(List<SourcesItem> sources) {
		this.sources = sources;
	}

	public void setStatus(String status) {
		this.status = status;
	}
}