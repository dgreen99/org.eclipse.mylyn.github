package org.eclipse.mylyn.github.internal;

/**
 * Container of multiple GitHub Issue Comments, used when returning JSON objects
 */
public class GitHubComments {

	private GitHubComment[] comments;

	/**
	 * Getter for all issues inside this object
	 * 
	 * @return The array of individual GitHub Comments
	 */
	public GitHubComment[] getComments() {
		return comments;
	}

}
