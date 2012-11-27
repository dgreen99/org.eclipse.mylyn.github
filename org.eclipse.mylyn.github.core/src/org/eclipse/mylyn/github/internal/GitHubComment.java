package org.eclipse.mylyn.github.internal;

/**
 * GitHub Comment object to hold all the properties of an individual comment.
 */
public class GitHubComment {

	private String id;

	private String created_at;

	private String body;

	private String user;

	public void setCreated_at(String created_at) {
		this.created_at = created_at;
	}

	public String getCreated_at() {
		return created_at;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public String getBody() {
		return body;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getId() {
		return id;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getUser() {
		return user;
	}

}
