package com.kaltura.playersdk;

import org.json.JSONException;
import org.json.JSONObject;

public class LanguageTrack {
	
	public int index;
	public String kind;
	public String label;
	public String language;
	public String scrlang;
	public String title;

	public LanguageTrack(){}

	public LanguageTrack(int index, String kind, String label, String language, String scrlang, String title) {
		this.index = index;
		this.kind = kind;
		this.label = label;
		this.language = language;
		this.scrlang = scrlang;
		this.title = title;
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
	}

	public String getKind() {
		return kind;
	}

	public void setKind(String kind) {
		this.kind = kind;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getScrlang() {
		return scrlang;
	}

	public void setScrlang(String scrlang) {
		this.scrlang = scrlang;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String toJSONString() {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("index", getIndex());
			jsonObject.put("kind", getKind());
			jsonObject.put("label", getLabel());
			jsonObject.put("language", getLanguage());
			jsonObject.put("scrlang", getScrlang());
			jsonObject.put("title", getTitle());
			return jsonObject.toString();
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return "";
		}
	}

	public JSONObject toJSONObject() {
		JSONObject jsonObject = new JSONObject();
		try {
			jsonObject.put("index", getIndex());
			jsonObject.put("kind", getKind());
			jsonObject.put("label", getLabel());
			jsonObject.put("language", getLanguage());
			jsonObject.put("scrlang", getScrlang());
			jsonObject.put("title", getTitle());
		} catch (JSONException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
		return jsonObject;
	}
}


