package edu.cpp.cs356.assignment2;

/**
 * Post class.
 * Contains name of poster and contents of post.
 */
public class Post {
	private String msg;
	private User user;
	
	public Post( User user, String msg ){
		this.msg = msg;
		this.user = user;
	}
	
	public String getMsg(){
		return msg;
	}
	
	public User getUser(){
		return user;
	}
	
	public String toString(){
		return user + ": " + msg;
	}
}
