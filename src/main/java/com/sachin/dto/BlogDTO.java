package com.sachin.dto;

import java.util.List;
import java.util.Map;

import org.springframework.data.mongodb.core.mapping.Document;

import com.fasterxml.jackson.annotation.JsonProperty;
@Document(collection="data")

public class BlogDTO {
	@JsonProperty(value="key")
	private String key;
	@JsonProperty(value="next")
	private String nextNode;
	@JsonProperty(value="dataNode")
	private List<Map<String, Object>> dataNodes;
	@JsonProperty(value="previous")
	private String previousNode;

	public String getKey() {
		return key;
	}

	public void setKey(String key) {
		this.key = key;
	}

	public String getNextNode() {
		return nextNode;
	}

	public void setNextNode(String nextNode) {
		this.nextNode = nextNode;
	}

	public List<Map<String, Object>> getDataNodes() {
		return dataNodes;
	}

	public void setDataNodes(List<Map<String, Object>> dataNodes) {
		this.dataNodes = dataNodes;
	}

	public String getPreviousNode() {
		return previousNode;
	}

	public void setPreviousNode(String previousNode) {
		this.previousNode = previousNode;
	}

	public String toString() {
		return "" + key + "" + nextNode + "" + previousNode;

	}

}
